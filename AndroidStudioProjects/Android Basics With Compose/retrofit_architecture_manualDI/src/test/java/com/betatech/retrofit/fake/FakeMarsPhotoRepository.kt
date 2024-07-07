package com.betatech.retrofit.fake

import com.betatech.retrofit.data.remote.MarsPhoto
import com.betatech.retrofit.domain.MarsPhotoRepository

class FakeMarsPhotoRepository: MarsPhotoRepository {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return FakeDataSource.photosList
    }
}