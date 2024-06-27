package com.betatech.mycityapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.betatech.mycityapp.ui.theme.AndroidBasicsWithComposeTheme

@Composable
fun MyCityApp(modifier: Modifier = Modifier) {
    Scaffold(
        modifier = modifier
    ) {
        Text(text = "Hello", modifier = Modifier.padding(it))
    }
}

@Preview(showBackground = true)
@Composable
fun MyCityAppPreview() {
    AndroidBasicsWithComposeTheme {
        MyCityApp()
    }
}