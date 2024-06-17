package com.betatech.navigation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.betatech.navigation.ui.theme.AndroidBasicsWithComposeTheme

@Composable
fun CartScreen(onCancelButtonClicked: () -> Unit, onSendButtonClicked: () ->  Unit, modifier: Modifier = Modifier) {
    Box(modifier = modifier
        .fillMaxSize()
        .background(Color(0xff2fa9ee))){
        Column {
            Text(text = "Total : $100")
            Row {
                Button(onClick = {
                    onSendButtonClicked()
                }) {
                    Text(text = "Place order")
                }
                Button(onClick = onCancelButtonClicked) {
                    Text(text = "Cancel")
                }
            }
        }
    }
}

@Preview
@Composable
fun CartScreenPreview(){
    AndroidBasicsWithComposeTheme {
        CartScreen({},{})
    }
}