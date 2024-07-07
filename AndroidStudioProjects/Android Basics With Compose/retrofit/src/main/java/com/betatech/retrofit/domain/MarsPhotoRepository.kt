package com.betatech.retrofit.domain

import com.betatech.retrofit.data.remote.MarsPhoto

interface MarsPhotoRepository {
    suspend fun getPhotos(): List<MarsPhoto>
}