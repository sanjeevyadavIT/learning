package com.betatech.mycityapp.navigation

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.width
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.NavigationRail
import androidx.compose.material3.NavigationRailItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.betatech.mycityapp.ui.utils.MyCityNavigationType

@Composable
fun NavigationSuiteScaffold(
    windowSize: WindowWidthSizeClass,
    navigationSuiteItems: List<NavigationSuiteItem>,
    modifier: Modifier = Modifier,
    layoutType: MyCityNavigationType = NavigationSuiteScaffoldDefaults.calculateFromAdaptiveInfo(
        windowSize
    ),
    content: @Composable () -> Unit
) {
    Surface(modifier = modifier) {
        when (layoutType) {
            MyCityNavigationType.BOTTOM_NAVIGATION -> {
                Column {
                    Box(modifier = Modifier.weight(1f)) {
                        content()
                    }
                    NavigationBar {
                        navigationSuiteItems.forEach {
                            NavigationBarItem(
                                selected = it.selected,
                                onClick = it.onClick,
                                icon = it.icon,
                            )
                        }
                    }
                }
            }


            MyCityNavigationType.NAVIGATION_RAIL -> {
                Row {
                    NavigationRail {
                        navigationSuiteItems.forEach {
                            NavigationRailItem(
                                selected = it.selected,
                                onClick = it.onClick,
                                icon = it.icon,
                            )
                        }
                    }
                    content()
                }
            }

            MyCityNavigationType.PERMANENT_NAVIGATION_DRAWER -> {
                PermanentNavigationDrawer(drawerContent = {
                    PermanentDrawerSheet(modifier = Modifier.width(240.dp)) {
                        navigationSuiteItems.forEach {
                            NavigationDrawerItem(
                                label = it.label ?: { Text(text = "") },
                                selected = it.selected,
                                onClick = it.onClick,
                                icon = it.icon,
                            )
                        }
                    }
                }) {
                    content()
                }
            }
        }

    }
}

data class NavigationSuiteItem(
    val selected: Boolean,
    val onClick: () -> Unit,
    val icon: @Composable () -> Unit,
    val label: @Composable (() -> Unit)?,
)

object NavigationSuiteScaffoldDefaults {
    fun calculateFromAdaptiveInfo(windowSize: WindowWidthSizeClass): MyCityNavigationType {
        return when (windowSize) {
            WindowWidthSizeClass.Compact -> MyCityNavigationType.BOTTOM_NAVIGATION
            WindowWidthSizeClass.Medium -> MyCityNavigationType.NAVIGATION_RAIL
            WindowWidthSizeClass.Expanded -> MyCityNavigationType.PERMANENT_NAVIGATION_DRAWER
            else -> MyCityNavigationType.BOTTOM_NAVIGATION
        }
    }
}