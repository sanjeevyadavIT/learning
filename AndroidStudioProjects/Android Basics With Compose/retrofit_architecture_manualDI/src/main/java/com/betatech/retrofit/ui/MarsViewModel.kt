package com.betatech.retrofit.ui

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.APPLICATION_KEY
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import com.betatech.retrofit.MarsApplication
import com.betatech.retrofit.data.remote.MarsPhoto
import com.betatech.retrofit.domain.MarsPhotoRepository
import kotlinx.coroutines.launch
import java.io.IOException

class MarsViewModel(
    private val repository: MarsPhotoRepository
): ViewModel() {

    val data = mutableStateOf<List<MarsPhoto>>(listOf())

    fun getPhotos(){
        viewModelScope.launch {
            try{
                val result = repository.getPhotos()
                data.value = result
            }catch (e: IOException){
                data.value = listOf()
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                val application = this[APPLICATION_KEY] as MarsApplication
                val marsPhotoRepository = application.container.marsPhotoRepository
                MarsViewModel(marsPhotoRepository)
            }
        }
    }
}