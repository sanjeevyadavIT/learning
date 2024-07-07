package com.betatech.retrofit.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun MarsApp(modifier: Modifier = Modifier) {
    val viewModel: MarsViewModel = viewModel<MarsViewModel>(factory = MarsViewModel.Factory)

    LaunchedEffect(key1 = "1") {
        viewModel.getPhotos()
    }

    Column(
        modifier = modifier.verticalScroll(
            rememberScrollState()
        )
    ) {
        Text(text = "${viewModel.data.value.size}")
    }
}