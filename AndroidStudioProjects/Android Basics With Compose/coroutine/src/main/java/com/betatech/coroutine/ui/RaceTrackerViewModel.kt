package com.betatech.coroutine.ui

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import java.util.concurrent.Flow

class RaceTrackerViewModel: ViewModel() {

//    var raceTrackerUiState = RaceTrackerUiState()
//
//    fun startRace() {
//        raceTrackerUiState = raceTrackerUiState.copy(running = mutableStateOf(true))
//    }
//
//    fun pause(){
//        raceTrackerUiState = raceTrackerUiState.copy(running = mutableStateOf(false))
//    }
//
//    fun reset() {
//        raceTrackerUiState = raceTrackerUiState.copy(running = mutableStateOf(false))
//        raceTrackerUiState.participant1.reset()
//        raceTrackerUiState.participant2.reset()
//    }

}

//data class RaceTrackerUiState (
//    val participant1: RaceParticipant = RaceParticipant(name = "Participant 1"),
//    val participant2 :RaceParticipant= RaceParticipant(name = "Participant 2", progressDelayMillis = 2000),
//    var running: MutableState<Boolean> = mutableStateOf(false)
//)
