package com.betatech.coroutine.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.betatech.coroutine.ui.theme.AndroidBasicsWithComposeTheme
import kotlinx.coroutines.async
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

@Composable
fun RaceTrackerApp(modifier: Modifier = Modifier){
    val participant1 = remember {
        RaceParticipant(name = "Participant 1", progressDelayMillis = 100)
    }
    val participant2 = remember {
        RaceParticipant(name = "Participant 2", progressDelayMillis = 200)
    }
    val running = remember {
        mutableStateOf(false)
    }

    if(running.value){
        LaunchedEffect(participant1, participant2) {
            coroutineScope {
                launch {
                    participant1.run()
                }
                launch {
                    participant2.run()
                }
            }
            running.value = false
        }
    }

    Column {
        Spacer(modifier = Modifier.height(36.dp))
        Text(text = "Participant 1: ${participant1.progressPercentage}")
        Text(text = "Participant 2: ${participant2.progressPercentage}")
        Button(onClick = {
            running.value = !running.value
        }, ) {
            Text(text = if(running.value) "Pause" else "Start")
        }
        Button(onClick = {
            running.value = false
            participant1.reset()
            participant2.reset()
        }) {
            Text(text = "Reset")
        }
    }
}

//@Preview(showBackground = true)
//@Composable
//fun RaceTrackerAppPreview() {
//    AndroidBasicsWithComposeTheme {
//        RaceTrackerApp()
//    }
//}