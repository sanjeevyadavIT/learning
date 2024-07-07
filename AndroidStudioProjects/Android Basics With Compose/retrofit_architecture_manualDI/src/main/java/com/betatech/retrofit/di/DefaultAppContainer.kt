package com.betatech.retrofit.di

import com.betatech.retrofit.data.MarsApiService
import com.betatech.retrofit.data.MarsPhotoRepositoryImpl
import com.betatech.retrofit.domain.MarsPhotoRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class DefaultAppContainer: AppContainer {

    private val baseUrl =
        "https://android-kotlin-fun-mars-server.appspot.com"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(
            GsonConverterFactory.create()
        )
        .baseUrl(baseUrl)
        .build()

    private val retrofitService : MarsApiService by lazy {
        retrofit.create(MarsApiService::class.java)
    }

    override val marsPhotoRepository: MarsPhotoRepository by lazy {
        MarsPhotoRepositoryImpl(retrofitService)
    }
}