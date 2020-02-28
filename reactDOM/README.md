## ReactDOM clone

React library has an api `createElement` which returns a React element, for example

```jsx
{/* This is JSX not HTML*/}
<div className="container" foo="bar">
    First Child
    <h1 className="title">Middle child</h1>
    Last Child
<div>
```

the above jsx looks like this

```javascript
{
    type: "div",
    props: {
        className: "container",
        foo: "bar",
        children: [
            "First Child",
            {
                type: "h1",
                props: {
                    className: "title",
                    children: "Middle child"
                }
            },
            "Last Child"
        ]
    }
}
```

This is not understood by browser, as it only understand dom nodes, so `ReactDOM` library is used to convert React elements into dom nodes. 

This project is a very basic implementation of `ReactDOM.render` function using `document.createElement` & `documen.appendChild` api

## How to use this project

1. Open `index.html` file on browser

## Note

Our implementation is really simple, `ReactDOM.render` needs an object
- which has two properties, `type` which is string, containg html element name and `props` which is an object
- `props` can have two type of keys, `className` which will be string & `children` which can be string or array of type string or the object itself which we are talking about