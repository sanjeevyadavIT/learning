package com.betatech.mycityapp.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.betatech.mycityapp.R
import com.betatech.mycityapp.ui.theme.AndroidBasicsWithComposeTheme
import com.betatech.mycityapp.ui.utils.MyCityNavigationType
import com.betatech.mycityapp.ui.utils.NavigationItemContent

@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val navigationType = when (windowSize) {
        WindowWidthSizeClass.Compact -> MyCityNavigationType.BOTTOM_NAVIGATION
        WindowWidthSizeClass.Medium -> MyCityNavigationType.NAVIGATION_RAIL
        WindowWidthSizeClass.Expanded -> MyCityNavigationType.PERMANENT_NAVIGATION_DRAWER
        else -> MyCityNavigationType.BOTTOM_NAVIGATION
    }

    val navigationItems = listOf(
        NavigationItemContent(
            icon = Icons.Default.Home,
            text = stringResource(R.string.home)
        ),
        NavigationItemContent(
            icon = Icons.Default.Search,
            text = stringResource(R.string.search)
        ),
        NavigationItemContent(
            icon = Icons.Default.Person,
            text = stringResource(R.string.profile)
        )
    )
    val selectedNavigationItemContent = remember { mutableStateOf(navigationItems[0]) }

    // Question 1: Should this Scaffold be moved inside CategoryListScreen where we can set drawer content and bottom bar
    // Question 2: If PermanentDrawer is outside Scaffold, how to tie up top app bar seamlessly with it
    // Question 3: When to use BottomAppBar vs NavigationBar
    Scaffold(
        modifier = modifier,
        bottomBar = {
            AnimatedVisibility(visible = navigationType == MyCityNavigationType.BOTTOM_NAVIGATION) {
                NavigationBar {
                    navigationItems.forEach {
                        NavigationBarItem(
                            selected = it == selectedNavigationItemContent.value,
                            onClick = {
                                selectedNavigationItemContent.value = it
                            },
                            icon = {
                                Icon(imageVector = it.icon, contentDescription = it.text)
                            })
                    }
                }
            }
        }
    ) {
        MyCityHomeScreen(
            navigationType = navigationType,
            navigationItems = navigationItems,
            selectedTab = selectedNavigationItemContent,
            onTabPressed = { item ->
                selectedNavigationItemContent.value = item
            },
            modifier = Modifier.padding(it)
        )
    }
}

@Preview(showBackground = true, widthDp = 480)
@Composable
fun MyCityAppCompactPreview() {
    AndroidBasicsWithComposeTheme {
        MyCityApp(
            windowSize = WindowWidthSizeClass.Compact
        )
    }
}

@Preview(showBackground = true, widthDp = 700)
@Composable
fun MyCityAppMediumPreview() {
    AndroidBasicsWithComposeTheme {
        MyCityApp(
            windowSize = WindowWidthSizeClass.Medium
        )
    }
}

@Preview(showBackground = true, widthDp = 900)
@Composable
fun MyCityAppExpandedPreview() {
    AndroidBasicsWithComposeTheme {
        MyCityApp(
            windowSize = WindowWidthSizeClass.Expanded
        )
    }
}