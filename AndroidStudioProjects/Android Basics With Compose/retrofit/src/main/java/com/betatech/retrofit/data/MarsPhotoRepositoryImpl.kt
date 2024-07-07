package com.betatech.retrofit.data

import com.betatech.retrofit.data.remote.MarsPhoto
import com.betatech.retrofit.domain.MarsPhotoRepository

class MarsPhotoRepositoryImpl(
    private val apiClient: MarsApiService
): MarsPhotoRepository {
    override suspend fun getPhotos(): List<MarsPhoto> {
        return apiClient.getPhotos()
    }
}