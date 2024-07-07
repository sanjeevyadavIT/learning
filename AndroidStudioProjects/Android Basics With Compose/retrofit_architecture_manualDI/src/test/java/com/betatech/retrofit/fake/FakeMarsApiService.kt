package com.betatech.retrofit.fake

import com.betatech.retrofit.data.MarsApiService
import com.betatech.retrofit.data.remote.MarsPhoto

class FakeMarsApiService: MarsApiService {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}