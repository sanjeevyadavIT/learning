package com.betatech.mycityapp.ui.utils

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun ListDetailPaneScaffold(
    windowWidthSizeClass: WindowWidthSizeClass,
    contentType: ContentType = ListDetailPaneScaffoldDefaults.calculateFromAdaptiveInfo(windowWidthSizeClass),
    listPane: @Composable () -> Unit,
    detailPane: @Composable () -> Unit
){
    if (contentType == ContentType.LIST_AND_DETAIL) {
        Row {
            Column(modifier = Modifier.weight(3f)) {
                listPane()
            }
            Column(modifier = Modifier.weight(7f)) {
                detailPane()
            }
        }
    } else {
        listPane()
    }
}

enum class ContentType {
    LIST, LIST_AND_DETAIL
}

object ListDetailPaneScaffoldDefaults {
    fun calculateFromAdaptiveInfo(windowSize: WindowWidthSizeClass): ContentType {
        return when (windowSize) {
            WindowWidthSizeClass.Compact -> ContentType.LIST
            WindowWidthSizeClass.Medium -> ContentType.LIST
            WindowWidthSizeClass.Expanded -> ContentType.LIST_AND_DETAIL
            else -> ContentType.LIST
        }
    }
}