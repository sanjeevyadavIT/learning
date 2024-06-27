package com.betatech.mycityapp.ui

import androidx.lifecycle.ViewModel
import com.betatech.mycityapp.data.LocalMyCityAppDataProvider
import com.betatech.mycityapp.model.Category
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class MyCityViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(
        MyCityUiState(
            LocalMyCityAppDataProvider.getCategories()
        )
    )
    val uiState: StateFlow<MyCityUiState> = _uiState

}

data class MyCityUiState (
    val categories: List<Category>
)