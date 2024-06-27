package com.betatech.mycityapp.ui

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.betatech.mycityapp.ui.utils.MyCityNavigationType
import com.betatech.mycityapp.ui.utils.NavigationItemContent

@Composable
fun MyCityHomeScreen(
    navigationType: MyCityNavigationType,
    navigationItems: List<NavigationItemContent>,
    selectedTab: MutableState<NavigationItemContent>,
    onTabPressed: (obj: NavigationItemContent) -> Unit,
    modifier: Modifier
) {
    if (navigationType == MyCityNavigationType.PERMANENT_NAVIGATION_DRAWER) {
        PermanentNavigationDrawer(drawerContent = {
            PermanentDrawerSheet(modifier = Modifier.width(240.dp)) {
                navigationItems.forEach {
                    NavigationDrawerItem(
                        label = {
                            Text(text = it.text)
                        },
                        selected = it == selectedTab.value,
                        icon = {
                            Icon(imageVector = it.icon, contentDescription = null)
                        },
                        onClick = {
                            onTabPressed(it)
                        })
                }
            }
        }) {
            CategoryListScreen(
                navigationType = navigationType,
                navigationItems = navigationItems,
                selectedTab = selectedTab,
                onTabPressed = { item ->
                    selectedTab.value = item
                },
            )
        }
    } else {
        CategoryListScreen(
            navigationType = navigationType,
            navigationItems = navigationItems,
            selectedTab = selectedTab,
            onTabPressed = { item ->
                selectedTab.value = item
            },
        )
    }
}

