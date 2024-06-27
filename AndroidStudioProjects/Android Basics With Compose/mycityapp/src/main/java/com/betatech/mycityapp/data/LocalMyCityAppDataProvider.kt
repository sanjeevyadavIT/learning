package com.betatech.mycityapp.data

import com.betatech.mycityapp.model.Category
import com.betatech.mycityapp.model.Recommendation

object LocalMyCityAppDataProvider {

    private val categories = listOf(
        Category(
            id = 1,
            thumbnail = "https://source.unsplash.com/1600x900/?nature",
            title = "Nature"
        ),
        Category(
            id = 2,
            thumbnail = "https://source.unsplash.com/1600x900/?historical",
            title = "Historical"
        ),
        Category(
            id = 3,
            thumbnail = "https://source.unsplash.com/1600x900/?restaurant",
            title = "Restaurants"
        ),
        Category(
            id = 4,
            thumbnail = "https://source.unsplash.com/1600x900/?shopping",
            title = "Shopping"
        ),
        Category(
            id = 5,
            thumbnail = "https://source.unsplash.com/1600x900/?museum",
            title = "Museums"
        ),
        Category(
            id = 6,
            thumbnail = "https://source.unsplash.com/1600x900/?park",
            title = "Parks"
        ),
        Category(
            id = 7,
            thumbnail = "https://source.unsplash.com/1600x900/?nightlife",
            title = "Nightlife"
        )
    )


    private val recommendations = listOf(
        // Nature
        Recommendation(
            id = 1,
            categoryId = 1,
            thumbnail = "https://source.unsplash.com/300x200/?forest",
            heroImage = "https://source.unsplash.com/800x600/?forest",
            title = "Greenwood Forest",
            description = "A beautiful forest with hiking trails and picnic spots."
        ),
        Recommendation(
            id = 2,
            categoryId = 1,
            thumbnail = "https://source.unsplash.com/300x200/?waterfall",
            heroImage = "https://source.unsplash.com/800x600/?waterfall",
            title = "Crystal Falls",
            description = "A stunning waterfall surrounded by lush greenery."
        ),
        Recommendation(
            id = 3,
            categoryId = 1,
            thumbnail = "https://source.unsplash.com/300x200/?mountain",
            heroImage = "https://source.unsplash.com/800x600/?mountain",
            title = "Mount Serenity",
            description = "A serene mountain with breathtaking views."
        ),
        Recommendation(
            id = 4,
            categoryId = 1,
            thumbnail = "https://source.unsplash.com/300x200/?lake",
            heroImage = "https://source.unsplash.com/800x600/?lake",
            title = "Blue Lake",
            description = "A tranquil lake perfect for kayaking and fishing."
        ),
        Recommendation(
            id = 5,
            categoryId = 1,
            thumbnail = "https://source.unsplash.com/300x200/?beach",
            heroImage = "https://source.unsplash.com/800x600/?beach",
            title = "Sunny Beach",
            description = "A beautiful beach with golden sands and clear waters."
        ),
        Recommendation(
            id = 6,
            categoryId = 1,
            thumbnail = "https://source.unsplash.com/300x200/?canyon",
            heroImage = "https://source.unsplash.com/800x600/?canyon",
            title = "Grand Canyon",
            description = "A magnificent canyon with stunning rock formations."
        ),

        // Historical
        Recommendation(
            id = 7,
            categoryId = 2,
            thumbnail = "https://source.unsplash.com/300x200/?castle",
            heroImage = "https://source.unsplash.com/800x600/?castle",
            title = "Old Castle",
            description = "A historic castle with rich cultural heritage."
        ),
        Recommendation(
            id = 8,
            categoryId = 2,
            thumbnail = "https://source.unsplash.com/300x200/?monument",
            heroImage = "https://source.unsplash.com/800x600/?monument",
            title = "City Monument",
            description = "A landmark monument with historical significance."
        ),
        Recommendation(
            id = 9,
            categoryId = 2,
            thumbnail = "https://source.unsplash.com/300x200/?temple",
            heroImage = "https://source.unsplash.com/800x600/?temple",
            title = "Ancient Temple",
            description = "A beautiful temple with intricate architecture."
        ),
        Recommendation(
            id = 10,
            categoryId = 2,
            thumbnail = "https://source.unsplash.com/300x200/?fort",
            heroImage = "https://source.unsplash.com/800x600/?fort",
            title = "Historic Fort",
            description = "An ancient fort with a fascinating history."
        ),
        Recommendation(
            id = 11,
            categoryId = 2,
            thumbnail = "https://source.unsplash.com/300x200/?ruins",
            heroImage = "https://source.unsplash.com/800x600/?ruins",
            title = "Old Ruins",
            description = "Ruins of an ancient civilization."
        ),
        Recommendation(
            id = 12,
            categoryId = 2,
            thumbnail = "https://source.unsplash.com/300x200/?museum",
            heroImage = "https://source.unsplash.com/800x600/?museum",
            title = "City Museum",
            description = "A museum showcasing local history and artifacts."
        ),

        // Restaurants
        Recommendation(
            id = 13,
            categoryId = 3,
            thumbnail = "https://source.unsplash.com/300x200/?restaurant",
            heroImage = "https://source.unsplash.com/800x600/?restaurant",
            title = "Gourmet Bistro",
            description = "A fine dining restaurant with a gourmet menu."
        ),
        Recommendation(
            id = 14,
            categoryId = 3,
            thumbnail = "https://source.unsplash.com/300x200/?cafe",
            heroImage = "https://source.unsplash.com/800x600/?cafe",
            title = "Cozy Cafe",
            description = "A cozy cafe with delicious pastries and coffee."
        ),
        Recommendation(
            id = 15,
            categoryId = 3,
            thumbnail = "https://source.unsplash.com/300x200/?diner",
            heroImage = "https://source.unsplash.com/800x600/?diner",
            title = "Retro Diner",
            description = "A retro-style diner serving classic American dishes."
        ),
        Recommendation(
            id = 16,
            categoryId = 3,
            thumbnail = "https://source.unsplash.com/300x200/?sushi",
            heroImage = "https://source.unsplash.com/800x600/?sushi",
            title = "Sushi Bar",
            description = "A sushi bar with fresh and authentic sushi."
        ),
        Recommendation(
            id = 17,
            categoryId = 3,
            thumbnail = "https://source.unsplash.com/300x200/?pizza",
            heroImage = "https://source.unsplash.com/800x600/?pizza",
            title = "Pizza Parlor",
            description = "A pizzeria with a variety of delicious pizzas."
        ),
        Recommendation(
            id = 18,
            categoryId = 3,
            thumbnail = "https://source.unsplash.com/300x200/?steak",
            heroImage = "https://source.unsplash.com/800x600/?steak",
            title = "Steakhouse",
            description = "A steakhouse with premium cuts and grilled to perfection."
        ),

        // Shopping
        Recommendation(
            id = 19,
            categoryId = 4,
            thumbnail = "https://source.unsplash.com/300x200/?mall",
            heroImage = "https://source.unsplash.com/800x600/?mall",
            title = "City Mall",
            description = "A large mall with a variety of shops and brands."
        ),
        Recommendation(
            id = 20,
            categoryId = 4,
            thumbnail = "https://source.unsplash.com/300x200/?boutique",
            heroImage = "https://source.unsplash.com/800x600/?boutique",
            title = "Fashion Boutique",
            description = "A boutique offering trendy and stylish clothing."
        ),
        Recommendation(
            id = 21,
            categoryId = 4,
            thumbnail = "https://source.unsplash.com/300x200/?market",
            heroImage = "https://source.unsplash.com/800x600/?market",
            title = "Local Market",
            description = "A local market with fresh produce and handmade goods."
        ),
        Recommendation(
            id = 22,
            categoryId = 4,
            thumbnail = "https://source.unsplash.com/300x200/?electronics",
            heroImage = "https://source.unsplash.com/800x600/?electronics",
            title = "Electronics Store",
            description = "A store offering the latest electronics and gadgets."
        ),
        Recommendation(
            id = 23,
            categoryId = 4,
            thumbnail = "https://source.unsplash.com/300x200/?bookstore",
            heroImage = "https://source.unsplash.com/800x600/?bookstore",
            title = "Bookstore",
            description = "A bookstore with a wide range of books and literature."
        ),
        Recommendation(
            id = 24,
            categoryId = 4,
            thumbnail = "https://source.unsplash.com/300x200/?jewelry",
            heroImage = "https://source.unsplash.com/800x600/?jewelry",
            title = "Jewelry Shop",
            description = "A shop offering exquisite jewelry and accessories."
        ),

        // Museums
        Recommendation(
            id = 25,
            categoryId = 5,
            thumbnail = "https://source.unsplash.com/300x200/?art-museum",
            heroImage = "https://source.unsplash.com/800x600/?art-museum",
            title = "Art Museum",
            description = "A museum showcasing various forms of art and exhibitions."
        ),
        Recommendation(
            id = 26,
            categoryId = 5,
            thumbnail = "https://source.unsplash.com/300x200/?science-museum",
            heroImage = "https://source.unsplash.com/800x600/?science-museum",
            title = "Science Museum",
            description = "A museum with interactive science exhibits and displays."
        ),
        Recommendation(
            id = 27,
            categoryId = 5,
            thumbnail = "https://source.unsplash.com/300x200/?history-museum",
            heroImage = "https://source.unsplash.com/800x600/?history-museum",
            title = "History Museum",
            description = "A museum that tells the story of the region's history."
        ),
        Recommendation(
            id = 28,
            categoryId = 5,
            thumbnail = "https://source.unsplash.com/300x200/?natural-history",
            heroImage = "https://source.unsplash.com/800x600/?natural-history",
            title = "Natural History Museum",
            description = "A museum with exhibits on natural history and wildlife."
        ),
        Recommendation(
            id = 29,
            categoryId = 5,
            thumbnail = "https://source.unsplash.com/300x200/?aviation-museum",
            heroImage = "https://source.unsplash.com/800x600/?aviation-museum",
            title = "Aviation Museum",
            description = "A museum showcasing the history of aviation."
        ),
        Recommendation(
            id = 30,
            categoryId = 5,
            thumbnail = "https://source.unsplash.com/300x200/?children-museum",
            heroImage = "https://source.unsplash.com/800x600/?children-museum",
            title = "Children's Museum",
            description = "A museum with exhibits designed for children."
        ),

        // Parks
        Recommendation(
            id = 31,
            categoryId = 6,
            thumbnail = "https://source.unsplash.com/300x200/?urban-park",
            heroImage = "https://source.unsplash.com/800x600/?urban-park",
            title = "Central Park",
            description = "A large urban park with walking paths and green spaces."
        ),
        Recommendation(
            id = 32,
            categoryId = 6,
            thumbnail = "https://source.unsplash.com/300x200/?botanical-garden",
            heroImage = "https://source.unsplash.com/800x600/?botanical-garden",
            title = "Botanical Garden",
            description = "A garden with a variety of plant species and flowers."
        ),
        Recommendation(
            id = 33,
            categoryId = 6,
            thumbnail = "https://source.unsplash.com/300x200/?national-park",
            heroImage = "https://source.unsplash.com/800x600/?national-park",
            title = "National Park",
            description = "A national park with scenic landscapes and wildlife."
        ),
        Recommendation(
            id = 34,
            categoryId = 6,
            thumbnail = "https://source.unsplash.com/300x200/?amusement-park",
            heroImage = "https://source.unsplash.com/800x600/?amusement-park",
            title = "Amusement Park",
            description = "A park with rides and attractions for all ages."
        ),
        Recommendation(
            id = 35,
            categoryId = 6,
            thumbnail = "https://source.unsplash.com/300x200/?zoo",
            heroImage = "https://source.unsplash.com/800x600/?zoo",
            title = "City Zoo",
            description = "A zoo with a variety of animals and exhibits."
        ),
        Recommendation(
            id = 36,
            categoryId = 6,
            thumbnail = "https://source.unsplash.com/300x200/?water-park",
            heroImage = "https://source.unsplash.com/800x600/?water-park",
            title = "Water Park",
            description = "A park with water slides and pools."
        ),

        // Nightlife
        Recommendation(
            id = 37,
            categoryId = 7,
            thumbnail = "https://source.unsplash.com/300x200/?club",
            heroImage = "https://source.unsplash.com/800x600/?club",
            title = "Night Club",
            description = "A vibrant night club with live music and DJs."
        ),
        Recommendation(
            id = 38,
            categoryId = 7,
            thumbnail = "https://source.unsplash.com/300x200/?bar",
            heroImage = "https://source.unsplash.com/800x600/?bar",
            title = "Cocktail Bar",
            description = "A bar with a variety of cocktails and drinks."
        ),
        Recommendation(
            id = 39,
            categoryId = 7,
            thumbnail = "https://source.unsplash.com/300x200/?live-music",
            heroImage = "https://source.unsplash.com/800x600/?live-music",
            title = "Live Music Venue",
            description = "A venue featuring live music performances."
        ),
        Recommendation(
            id = 40,
            categoryId = 7,
            thumbnail = "https://source.unsplash.com/300x200/?theater",
            heroImage = "https://source.unsplash.com/800x600/?theater",
            title = "Theater",
            description = "A theater showing plays and performances."
        ),
        Recommendation(
            id = 41,
            categoryId = 7,
            thumbnail = "https://source.unsplash.com/300x200/?karaoke",
            heroImage = "https://source.unsplash.com/800x600/?karaoke",
            title = "Karaoke Bar",
            description = "A bar with karaoke nights and entertainment."
        ),
        Recommendation(
            id = 42,
            categoryId = 7,
            thumbnail = "https://source.unsplash.com/300x200/?pub",
            heroImage = "https://source.unsplash.com/800x600/?pub",
            title = "Pub",
            description = "A traditional pub with a variety of beers and ales."
        )
    )


    fun getCategories() : List<Category> = categories

    fun getRecommendations(categoryId: Int) = recommendations.filter { it.categoryId == categoryId }
}