package com.betatech.mycityapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

@Composable
fun DetailCategory(categoryID: Int, modifier: Modifier = Modifier) {
    Column(modifier = modifier.background(Color.Yellow).fillMaxSize()) {
        Text(text = "My City Detail: Category ID: $categoryID")
    }
}