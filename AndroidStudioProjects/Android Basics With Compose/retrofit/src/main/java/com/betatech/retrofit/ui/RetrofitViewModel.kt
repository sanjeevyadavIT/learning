package com.betatech.retrofit.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.betatech.retrofit.data.MarsApi
import com.betatech.retrofit.data.remote.MarsPhoto
import kotlinx.coroutines.launch
import java.io.IOException

class RetrofitViewModel: ViewModel() {

    val data = mutableStateOf<List<MarsPhoto>>(listOf())

    fun getPhotos(){
        viewModelScope.launch {
            try{
                val result = MarsApi.retrofitService.getPhotos()
                data.value = result
            }catch (e: IOException){
                data.value = listOf()
            }
        }
    }
}