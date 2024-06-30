package com.betatech.mycityapp.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.betatech.mycityapp.model.Category
import com.betatech.mycityapp.ui.components.CategoryList
import com.betatech.mycityapp.ui.components.DetailCategory

@Composable
fun MyCityDetailScreen(
    categoryId: Int,
    modifier: Modifier = Modifier
) {
    DetailCategory(categoryID = categoryId)
}