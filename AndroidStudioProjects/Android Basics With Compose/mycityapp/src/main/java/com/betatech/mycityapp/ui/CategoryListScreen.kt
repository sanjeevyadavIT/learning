package com.betatech.mycityapp.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.betatech.mycityapp.ui.utils.MyCityNavigationType
import com.betatech.mycityapp.ui.utils.NavigationItemContent

@Composable
fun CategoryListScreen(
    navigationType: MyCityNavigationType,
    navigationItems: List<NavigationItemContent>,
    selectedTab: MutableState<NavigationItemContent>,
    onTabPressed: (NavigationItemContent) -> Unit,
    modifier: Modifier = Modifier
) {
    Row(modifier = modifier.fillMaxSize()) {
        AnimatedVisibility(visible = navigationType == MyCityNavigationType.NAVIGATION_RAIL) {
            NavigationRail {
                navigationItems.forEach {
                    NavigationRailItem(
                        selected = it == selectedTab.value,
                        onClick = { onTabPressed(it) },
                        icon = { Icon(imageVector = it.icon, contentDescription = it.text) })
                }
            }
        }
        Column(
            modifier = modifier
                .fillMaxSize()
                .background(Color.Yellow)
        ) {
            Text(text = "Category List")
        }
    }
}