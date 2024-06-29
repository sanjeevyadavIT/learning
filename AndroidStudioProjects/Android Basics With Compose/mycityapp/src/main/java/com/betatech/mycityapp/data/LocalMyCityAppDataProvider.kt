package com.betatech.mycityapp.data

import com.betatech.mycityapp.model.Category
import com.betatech.mycityapp.model.Recommendation

object LocalMyCityAppDataProvider {

    private val categories = listOf(
        Category(
            id = 1,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Nature"
        ),
        Category(
            id = 2,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Historical"
        ),
        Category(
            id = 3,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Restaurants"
        ),
        Category(
            id = 4,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Shopping"
        ),
        Category(
            id = 5,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Museums"
        ),
        Category(
            id = 6,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Parks"
        ),
        Category(
            id = 7,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Nightlife"
        )
    )


    private val recommendations = listOf(
        // Nature
        Recommendation(
            id = 1,
            categoryId = 1,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Greenwood Forest",
            description = "A beautiful forest with hiking trails and picnic spots."
        ),
        Recommendation(
            id = 2,
            categoryId = 1,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Crystal Falls",
            description = "A stunning waterfall surrounded by lush greenery."
        ),
        Recommendation(
            id = 3,
            categoryId = 1,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Mount Serenity",
            description = "A serene mountain with breathtaking views."
        ),
        Recommendation(
            id = 4,
            categoryId = 1,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Blue Lake",
            description = "A tranquil lake perfect for kayaking and fishing."
        ),
        Recommendation(
            id = 5,
            categoryId = 1,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Sunny Beach",
            description = "A beautiful beach with golden sands and clear waters."
        ),
        Recommendation(
            id = 6,
            categoryId = 1,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Grand Canyon",
            description = "A magnificent canyon with stunning rock formations."
        ),

        // Historical
        Recommendation(
            id = 7,
            categoryId = 2,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Old Castle",
            description = "A historic castle with rich cultural heritage."
        ),
        Recommendation(
            id = 8,
            categoryId = 2,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "City Monument",
            description = "A landmark monument with historical significance."
        ),
        Recommendation(
            id = 9,
            categoryId = 2,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Ancient Temple",
            description = "A beautiful temple with intricate architecture."
        ),
        Recommendation(
            id = 10,
            categoryId = 2,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Historic Fort",
            description = "An ancient fort with a fascinating history."
        ),
        Recommendation(
            id = 11,
            categoryId = 2,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Old Ruins",
            description = "Ruins of an ancient civilization."
        ),
        Recommendation(
            id = 12,
            categoryId = 2,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "City Museum",
            description = "A museum showcasing local history and artifacts."
        ),

        // Restaurants
        Recommendation(
            id = 13,
            categoryId = 3,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Gourmet Bistro",
            description = "A fine dining restaurant with a gourmet menu."
        ),
        Recommendation(
            id = 14,
            categoryId = 3,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Cozy Cafe",
            description = "A cozy cafe with delicious pastries and coffee."
        ),
        Recommendation(
            id = 15,
            categoryId = 3,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Retro Diner",
            description = "A retro-style diner serving classic American dishes."
        ),
        Recommendation(
            id = 16,
            categoryId = 3,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Sushi Bar",
            description = "A sushi bar with fresh and authentic sushi."
        ),
        Recommendation(
            id = 17,
            categoryId = 3,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Pizza Parlor",
            description = "A pizzeria with a variety of delicious pizzas."
        ),
        Recommendation(
            id = 18,
            categoryId = 3,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Steakhouse",
            description = "A steakhouse with premium cuts and grilled to perfection."
        ),

        // Shopping
        Recommendation(
            id = 19,
            categoryId = 4,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "City Mall",
            description = "A large mall with a variety of shops and brands."
        ),
        Recommendation(
            id = 20,
            categoryId = 4,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Fashion Boutique",
            description = "A boutique offering trendy and stylish clothing."
        ),
        Recommendation(
            id = 21,
            categoryId = 4,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Local Market",
            description = "A local market with fresh produce and handmade goods."
        ),
        Recommendation(
            id = 22,
            categoryId = 4,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Electronics Store",
            description = "A store offering the latest electronics and gadgets."
        ),
        Recommendation(
            id = 23,
            categoryId = 4,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Bookstore",
            description = "A bookstore with a wide range of books and literature."
        ),
        Recommendation(
            id = 24,
            categoryId = 4,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Jewelry Shop",
            description = "A shop offering exquisite jewelry and accessories."
        ),

        // Museums
        Recommendation(
            id = 25,
            categoryId = 5,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Art Museum",
            description = "A museum showcasing various forms of art and exhibitions."
        ),
        Recommendation(
            id = 26,
            categoryId = 5,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Science Museum",
            description = "A museum with interactive science exhibits and displays."
        ),
        Recommendation(
            id = 27,
            categoryId = 5,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "History Museum",
            description = "A museum that tells the story of the region's history."
        ),
        Recommendation(
            id = 28,
            categoryId = 5,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Natural History Museum",
            description = "A museum with exhibits on natural history and wildlife."
        ),
        Recommendation(
            id = 29,
            categoryId = 5,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Aviation Museum",
            description = "A museum showcasing the history of aviation."
        ),
        Recommendation(
            id = 30,
            categoryId = 5,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Children's Museum",
            description = "A museum with exhibits designed for children."
        ),

        // Parks
        Recommendation(
            id = 31,
            categoryId = 6,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Central Park",
            description = "A large urban park with walking paths and green spaces."
        ),
        Recommendation(
            id = 32,
            categoryId = 6,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Botanical Garden",
            description = "A garden with a variety of plant species and flowers."
        ),
        Recommendation(
            id = 33,
            categoryId = 6,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "National Park",
            description = "A national park with scenic landscapes and wildlife."
        ),
        Recommendation(
            id = 34,
            categoryId = 6,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Amusement Park",
            description = "A park with rides and attractions for all ages."
        ),
        Recommendation(
            id = 35,
            categoryId = 6,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "City Zoo",
            description = "A zoo with a variety of animals and exhibits."
        ),
        Recommendation(
            id = 36,
            categoryId = 6,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Water Park",
            description = "A park with water slides and pools."
        ),

        // Nightlife
        Recommendation(
            id = 37,
            categoryId = 7,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Night Club",
            description = "A vibrant night club with live music and DJs."
        ),
        Recommendation(
            id = 38,
            categoryId = 7,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Cocktail Bar",
            description = "A bar with a variety of cocktails and drinks."
        ),
        Recommendation(
            id = 39,
            categoryId = 7,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Live Music Venue",
            description = "A venue featuring live music performances."
        ),
        Recommendation(
            id = 40,
            categoryId = 7,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Theater",
            description = "A theater showing plays and performances."
        ),
        Recommendation(
            id = 41,
            categoryId = 7,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Karaoke Bar",
            description = "A bar with karaoke nights and entertainment."
        ),
        Recommendation(
            id = 42,
            categoryId = 7,
            thumbnail = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            heroImage = "https://fastly.picsum.photos/id/648/200/300.jpg?hmac=yifVKULNJZhxFK2Oav2kDH8G4unUDKn-OebXR1bWOf4",
            title = "Pub",
            description = "A traditional pub with a variety of beers and ales."
        )
    )


    fun getCategories() : List<Category> = categories

    fun getRecommendations(categoryId: Int) = recommendations.filter { it.categoryId == categoryId }
}