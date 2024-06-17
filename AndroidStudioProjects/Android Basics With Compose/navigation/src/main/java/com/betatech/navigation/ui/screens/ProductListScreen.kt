package com.betatech.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.betatech.navigation.ui.theme.AndroidBasicsWithComposeTheme

@Composable
fun ProductListScreen(onNextButtonClicked: (Int) ->  Unit, modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color(0xffffeb46))){
        Column {
            Text(text = "ProductListScreen")
            Button(onClick = {
                onNextButtonClicked(5)
            }) {
                Text(text = "Next")
            }
        }
    }
}

@Preview
@Composable
fun ProductListScreenPreview(){
    AndroidBasicsWithComposeTheme {
        ProductListScreen({})
    }
}