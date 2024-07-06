package com.betatech.coroutine

import com.betatech.coroutine.ui.RaceParticipant
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.launch
import kotlinx.coroutines.test.advanceTimeBy
import kotlinx.coroutines.test.runCurrent
import kotlinx.coroutines.test.runTest
import org.junit.Test

class RaceParticipantTest {
    private val raceParticipant = RaceParticipant(
        name = "Participant 1"
    )

    @OptIn(ExperimentalCoroutinesApi::class)
    @Test
    fun raceParticipant_RaceStarted_ProgressUpdated() {
        return runTest {
            val expectedProgress = 1
            launch {
                raceParticipant.run()
            }
            advanceTimeBy(raceParticipant.progressDelayMillis)
            runCurrent()
            assert(raceParticipant.currentProgress == expectedProgress)
        }
    }
}