package com.example.composequadrant

import android.graphics.Paint.Align
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composequadrant.ui.theme.AndroidBasicsWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AndroidBasicsWithComposeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    App(
                        qudrants = listOf(
                            Triple(
                                "Text composable",
                                "Displays text and follows the recommended Material Design guidelines.",
                                Color(0xFFEADDFF)
                            ),
                            Triple(
                                "Image composable",
                                "Creates a composable that lays out and draws a given Painter class object.",
                                Color(0xFFD0BCFF)
                            ),
                            Triple(
                                "Row composable",
                                "A layout composable that places its children in a horizontal sequence.",
                                Color(0xFFB69DF8)
                            ),
                            Triple(
                                "Column composable",
                                "A layout composable that places its children in a vertical sequence.",
                                Color(0xFFF6EDFF)
                            ),
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun App(qudrants: List<Triple<String, String, Color>>, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Row(
            modifier.weight(0.5f),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Qudrant(qudrants[0], modifier.weight(0.5f))
            Qudrant(qudrants[1], modifier.weight(0.5f))
        }
        Row(modifier.weight(0.5f)) {
            Qudrant(qudrants[2], modifier.weight(0.5f))
            Qudrant(qudrants[3], modifier.weight(0.5f))
        }
    }
}

@Composable
fun Qudrant(data: Triple<String, String, Color>, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .background(data.third)
            .padding(16.dp)
    ) {
        Text(
            text = data.first,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        Text(text = data.second, textAlign = TextAlign.Justify)
    }
}

@Preview(showBackground = true)
@Composable
fun App() {
    AndroidBasicsWithComposeTheme {
        App(
            listOf(
                Triple(
                    "Text composable",
                    "Displays text and follows the recommended Material Design guidelines.",
                    Color(0xFFEADDFF)
                ),
                Triple(
                    "Image composable",
                    "Creates a composable that lays out and draws a given Painter class object.",
                    Color(0xFFD0BCFF)
                ),
                Triple(
                    "Row composable",
                    "A layout composable that places its children in a horizontal sequence.",
                    Color(0xFFB69DF8)
                ),
                Triple(
                    "Column composable",
                    "A layout composable that places its children in a vertical sequence.",
                    Color(0xFFF6EDFF)
                ),
            )
        )
    }
}