package com.betatech.coroutine.ui

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun LaunchedEffectTesting() {
    Log.d("SANJEEV", "ReComposition :: LaunchedEffectTesting")
    var showUi1 by remember {
        mutableStateOf(false)
    }
    var showUi2 by remember {
        mutableStateOf(false)
    }

    Column {
        Spacer(modifier = Modifier.height(36.dp))
        Button(onClick = {
            showUi1 = !showUi1
        }) {
            Text(text = if(showUi1) "Hide UI 1" else "Show UI 1")
        }
        Button(onClick = {
            showUi2 = !showUi2
        }) {
            Text(text = if(showUi2) "Hide UI 2" else "Show UI 2")
        }
        if (showUi1) {
            GenericUi(1)
        }
        if (showUi2) {
            GenericUi(2)
        }
    }

}


@Composable
fun GenericUi(id: Int) {
    Log.d("SANJEEV", "ReComposition :: GenericUi :: $id")

    var startCoroutine by remember {
        mutableStateOf(false)
    }
    var indepdent by remember {
        mutableStateOf(false)
    }

    if(startCoroutine) {
        LaunchedEffect(id, indepdent){
            launch {
                var count = 1
                while(true){
                    delay(1000)
                    Log.d("SANJEEV", "Coroutine :: $id :: $count")
                    count++
                }
            }
        }
    }

    Card(
        Modifier
            .padding(bottom = 16.dp, start = 16.dp, end = 16.dp)
            .fillMaxWidth()
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = "UI $id :: ")
            Row{
                Button(onClick = {
                    startCoroutine = !startCoroutine
                }) {
                    Text(text = "Launch Effect $id ")
                }
                Button(onClick = { indepdent = !indepdent }) {
                    Text(text = "Independent State = $indepdent")
                }
            }
            
        }
    }
}