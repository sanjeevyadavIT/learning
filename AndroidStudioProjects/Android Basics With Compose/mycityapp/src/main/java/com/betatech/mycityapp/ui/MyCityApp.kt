package com.betatech.mycityapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.betatech.mycityapp.navigation.HomeLevelDestination
import com.betatech.mycityapp.navigation.TopLevelDestination
import com.betatech.mycityapp.navigation.NavigationSuiteItem
import com.betatech.mycityapp.navigation.NavigationSuiteScaffold
import com.betatech.mycityapp.ui.components.MyCityAppBar
import com.betatech.mycityapp.ui.theme.AndroidBasicsWithComposeTheme

// Question 1: PermanentDrawer is outside Scaffold, how to tie up top app bar seamlessly with it
// Question 2: When to use BottomAppBar vs NavigationBar
@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {

    val navController = rememberNavController()
    val viewModel: MyCityViewModel = viewModel()
    val uiState = viewModel.uiState.collectAsState().value
    var currentDestination by rememberSaveable { mutableStateOf(TopLevelDestination.HOME) }

    NavigationSuiteScaffold(
        windowSize = windowSize,
        navigationSuiteItems = TopLevelDestination.entries.map {
            NavigationSuiteItem(
                selected = currentDestination == it,
                onClick = {
                    currentDestination = it
                    navController.navigate(it.name)
                },
                label = {
                    Text(text = stringResource(id = it.text))
                },
                icon = {
                    Icon(
                        imageVector = it.icon,
                        contentDescription = null
                    )
                }
            )
        }
    ) {
        Scaffold {
            Column(
                modifier
                    .padding(it)
                    .fillMaxSize()
            ) {
                MyCityAppBar(currentDestination)
                NavHost(
                    navController = navController,
                    startDestination = TopLevelDestination.HOME.name
                ) {
                    composable(TopLevelDestination.HOME.name) {
                        val homeNavController = rememberNavController()
                        NavHost(
                            navController = homeNavController,
                            startDestination = HomeLevelDestination.HomeScreen.route
                        ) {
                            composable(HomeLevelDestination.HomeScreen.route) {
                                var categorySelected by rememberSaveable {
                                    mutableStateOf(0)
                                }
                                MyCityCategoryListScreen(
                                    windowSize,
                                    categoryList = uiState.categories,
                                    selectedCategoryId = categorySelected,
                                    onCategoryClicked = {
                                        if(windowSize == WindowWidthSizeClass.Expanded) {
                                            categorySelected = it.id
                                        } else {
                                            homeNavController.navigate(
                                                HomeLevelDestination.DetailScreen.route.replace(
                                                    "{id}",
                                                    it.id.toString()
                                                )
                                            )
                                        }

                                    }
                                )
                            }

                            composable(
                                route = HomeLevelDestination.DetailScreen.route,
                                arguments = listOf(navArgument("id") { type = NavType.IntType })
                            ) {
                                MyCityDetailScreen(it.arguments?.getInt("id") ?: 0)
                            }
                        }
                    }
                    composable(TopLevelDestination.SEARCH.name) {
                        MyCitySearchScreen()
                    }
                    composable(TopLevelDestination.PROFILE.name) {
                        MyCityProfileScreen()
                    }
                }
            }

        }
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