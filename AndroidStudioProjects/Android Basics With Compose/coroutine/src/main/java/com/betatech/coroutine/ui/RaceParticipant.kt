package com.betatech.coroutine.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import kotlinx.coroutines.delay

class RaceParticipant(
    val name: String,
    val maxProgress: Int = 100,
    val progressDelayMillis: Long = 1000,
    private val progressIncrement: Int = 1,
    private val initialProgress: Int = 0
) {
    init {
        require(maxProgress > 0) { "Max progress must be greater than 0, was $maxProgress" }
        require(progressIncrement > 0) { "Progress increment must be greater than 0, was $progressIncrement" }
    }

    var currentProgress by mutableStateOf(initialProgress)
    private set

    suspend fun run() {
        while (currentProgress < maxProgress) {
            delay(progressDelayMillis)
            currentProgress += progressIncrement
        }
    }

    fun reset() {
        currentProgress = 0
    }
}

val RaceParticipant.progressPercentage: Float
    get() = (currentProgress.toFloat() / maxProgress.toFloat())*100