package com.betatech.mycityapp.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.betatech.mycityapp.data.LocalMyCityAppDataProvider
import com.betatech.mycityapp.model.Category
import com.betatech.mycityapp.ui.theme.AndroidBasicsWithComposeTheme

@Composable
fun CategoryList(
    categoryList: List<Category>,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn (modifier = modifier.padding(horizontal = 8.dp)) {
        items(categoryList) { category ->
            CategoryListItem(category, onClick)
            Spacer(modifier = Modifier.height(8.dp))
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryListItem(
    category: Category,
    onClick: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    Card(
        onClick = {
            onClick(category)
        },
        modifier = modifier.fillMaxSize()
    ) {
        Row {
            AsyncImage(
                model = category.thumbnail,
                contentDescription = null,
                modifier = Modifier
                    .size(120.dp)
                    .padding(end = 16.dp),
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.padding(top = 16.dp, bottom = 16.dp, end = 16.dp)) {
                Text(
                    text = category.title,
                    style = MaterialTheme.typography.titleMedium,
                    modifier = Modifier.padding(bottom = 8.dp)
                )
            }

        }
    }
}

@Preview
@Composable
fun CategoryListPreview() {
    AndroidBasicsWithComposeTheme {
        CategoryList(LocalMyCityAppDataProvider.getCategories(), {})
    }
}

@Preview
@Composable
fun CategoryListItemPreview() {
    AndroidBasicsWithComposeTheme{
        CategoryListItem(category = Category(1, "https://fastly.picsum.photos/id/553/200/300.jpg?hmac=-A3VLW_dBmwUaXOe7bHhCt-lnmROrPFyTLslwNHVH1A", "Title of the Card"), onClick = { })
    }
}