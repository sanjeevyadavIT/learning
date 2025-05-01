import { ApolloServer } from "@apollo/server";
import { startStandaloneServer } from "@apollo/server/standalone";

const data = {
  books: [
    { id: 1, title: "The Great Gatsby", publishedYear: 1999, authorId: 1 },
    { id: 2, title: "Tender is the Night", publishedYear: 1990, authorId: 1 },
    { id: 3, title: "To Kill a Mockingbird", publishedYear: 1897, authorId: 2 },
  ],
  authors: [
    { id: 1, name: "F. Scott Fitzgerald", age: 44, bookIds: [1, 2] },
    { id: 2, name: "Harper Lee", age: 89, bookIds: [3] },
  ],
};

const typeDefs = `#graphql
    type Book {
        id: Int
        title: String
        publishedYear: Int
        author: Author
    }

    type Author {
        id: Int
        name: String
        age: Int
        books: [Book]
    }

    type Query {
        books: [Book]
        authors: [Author]
    }

    type Mutation {
        addBook(title: String!, publishedYear: Int!, authorId: Int!): Book
        addAuthor(name: String!, age: Int!): Author
    }
`;

const resolvers = {
  Book: {
    author: (parent, args, context, info) => {
      return data.authors.find((author) => author.id === parent.authorId);
    },
  },
  Author: {
    books: (parent, args, context, info) => {
      return data.books.filter((book) => book.authorId === parent.id);
    },
  },
  Query: {
    books: () => {
      return data.books;
    },
    authors: () => {
      return data.authors;
    },
  },
  Mutation: {
    addBook: (parent, args, context, info) => {
      const newBook = {
        id: data.books.length + 1,
        title: args.title,
        publishedYear: args.publishedYear,
        authorId: args.authorId,
      };
      data.books.push(newBook);
      return newBook;
    },
    addAuthor: (parent, args, context, info) => {
      const newAuthor = {
        id: data.authors.length + 1,
        name: args.name,
        age: args.age,
        bookIds: [],
      };
      data.authors.push(newAuthor);
      return newAuthor;
    },
  }
};

// The ApolloServer constructor requires two parameters: your schema
// definition and your set of resolvers.
const server = new ApolloServer({
  typeDefs,
  resolvers,
});

// Passing an ApolloServer instance to the `startStandaloneServer` function:
//  1. creates an Express app
//  2. installs your ApolloServer instance as middleware
//  3. prepares your app to handle incoming requests
const { url } = await startStandaloneServer(server, {
  listen: { port: 4000 },
});

console.log(`🚀  Server ready at: ${url}`);
