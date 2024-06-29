package com.betatech.mycityapp.ui

import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.betatech.mycityapp.model.Category
import com.betatech.mycityapp.ui.components.CategoryList
import com.betatech.mycityapp.ui.components.DetailCategory
import com.betatech.mycityapp.ui.utils.ListDetailPaneScaffold

@Composable
fun MyCityCategoryListScreen(
    windowSize: WindowWidthSizeClass,
    categoryList: List<Category>,
    selectedCategoryId: Int,
    onCategoryClicked: (Category) -> Unit,
    modifier: Modifier = Modifier
) {
    ListDetailPaneScaffold(
        windowWidthSizeClass = windowSize,
        listPane = {
            CategoryList(
                categoryList = categoryList,
                onClick = {
                    onCategoryClicked(it)
                }
            ) },
        detailPane = {
            DetailCategory(
                categoryID = selectedCategoryId
            )
        })
}

