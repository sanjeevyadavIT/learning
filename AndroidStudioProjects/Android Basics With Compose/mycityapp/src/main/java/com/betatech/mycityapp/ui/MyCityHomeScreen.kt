package com.betatech.mycityapp.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.betatech.mycityapp.model.Category
import com.betatech.mycityapp.ui.components.CategoryList

@Composable
fun MyCityHomeScreen(
    categoryList: List<Category>,
    onCategoryClicked: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    // TODO: Show either list View or List+Detail view in expanded state
    CategoryList(
        categoryList = categoryList,
        onClick = {
            onCategoryClicked(it)
        }
    )
}

