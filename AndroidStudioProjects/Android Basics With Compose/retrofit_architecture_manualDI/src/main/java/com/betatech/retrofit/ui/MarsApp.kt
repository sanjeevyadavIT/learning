package com.betatech.retrofit.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.AsyncImage
import coil.request.ImageRequest

@Composable
fun MarsApp(modifier: Modifier = Modifier) {
    val viewModel: MarsViewModel = viewModel<MarsViewModel>(factory = MarsViewModel.Factory)

    LaunchedEffect(key1 = "1") {
        viewModel.getPhotos()
    }

    LazyVerticalGrid(columns = GridCells.Adaptive(150.dp)) {
        items(items = viewModel.data.value, key = { it.id!! }){
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current).data(it.imgSrc).crossfade(true).build(),
                contentDescription =  null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}