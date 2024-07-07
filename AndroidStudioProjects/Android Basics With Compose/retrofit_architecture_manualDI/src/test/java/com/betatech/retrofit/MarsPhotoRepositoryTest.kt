package com.betatech.retrofit

import com.betatech.retrofit.data.MarsPhotoRepositoryImpl
import com.betatech.retrofit.fake.FakeDataSource
import com.betatech.retrofit.fake.FakeMarsApiService
import junit.framework.TestCase.assertEquals
import kotlinx.coroutines.test.runTest
import org.junit.Test

class MarsPhotoRepositoryTest {

    @Test
    fun marsPhotoRepository_getMarsPhotos_verifySuccess() = runTest {
        val repsoitory = MarsPhotoRepositoryImpl(
            apiClient = FakeMarsApiService()
        )
        assertEquals(repsoitory.getPhotos(), FakeDataSource.photosList)
    }
}