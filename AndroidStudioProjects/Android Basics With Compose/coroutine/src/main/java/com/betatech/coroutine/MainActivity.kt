package com.betatech.coroutine

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.betatech.coroutine.ui.RaceTrackerApp
import com.betatech.coroutine.ui.RaceTrackerViewModel
import com.betatech.coroutine.ui.theme.AndroidBasicsWithComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
//        val viewModel: RaceTrackerViewModel() by viewModel()
        setContent {
            AndroidBasicsWithComposeTheme {
                RaceTrackerApp()
            }
        }
    }
}