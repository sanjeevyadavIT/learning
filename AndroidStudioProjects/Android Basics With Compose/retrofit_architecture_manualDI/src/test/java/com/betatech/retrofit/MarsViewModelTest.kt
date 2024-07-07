package com.betatech.retrofit

import com.betatech.retrofit.fake.FakeDataSource
import com.betatech.retrofit.fake.FakeMarsPhotoRepository
import com.betatech.retrofit.rule.TestDispatcherRule
import com.betatech.retrofit.ui.MarsViewModel
import kotlinx.coroutines.test.TestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MarsViewModelTest {

    @get:Rule
    val testDispatcher = TestDispatcherRule()
    @Test
    fun marsViewModel_getMarsPhotos_verifyMarsUiStateSuccess()  = runTest {
        val marsViewModel = MarsViewModel(FakeMarsPhotoRepository())

        assert(marsViewModel.data.value.isEmpty())

        marsViewModel.getPhotos()

        assertEquals(marsViewModel.data.value, FakeDataSource.photosList)
    }
}