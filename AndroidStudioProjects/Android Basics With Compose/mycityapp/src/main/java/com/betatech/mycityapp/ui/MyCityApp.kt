package com.betatech.mycityapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.betatech.mycityapp.navigation.NavigationSuiteItem
import com.betatech.mycityapp.navigation.NavigationSuiteScaffold
import com.betatech.mycityapp.navigation.TopLevelDestination
import com.betatech.mycityapp.ui.theme.AndroidBasicsWithComposeTheme

// Question 1: PermanentDrawer is outside Scaffold, how to tie up top app bar seamlessly with it
// Question 2: When to use BottomAppBar vs NavigationBar
@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {

    var currentDestination by rememberSaveable { mutableStateOf(TopLevelDestination.HOME) }

    NavigationSuiteScaffold(
        windowSize = windowSize,
        navigationSuiteItems = TopLevelDestination.entries.map {
            NavigationSuiteItem(
                selected = currentDestination == it,
                onClick = {
                    currentDestination = it
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
            Column {
                // TODO: Add TopBar here inside it
                // TODO: Add NavHost here
                MyCityHomeScreen(
                    modifier = Modifier.padding(it)
                )
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