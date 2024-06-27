package com.betatech.mycityapp.model

data class Recommendation(
    val id: Int,
    val categoryId: Int,
    val thumbnail: String,
    val heroImage: String,
    val title: String,
    val description: String,
)
