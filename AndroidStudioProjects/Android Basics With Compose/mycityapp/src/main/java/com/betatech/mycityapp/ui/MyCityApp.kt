package com.betatech.mycityapp.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.betatech.mycityapp.ui.theme.AndroidBasicsWithComposeTheme
import com.betatech.mycityapp.ui.utils.MyCityNavigationType

@Composable
fun MyCityApp(
    windowSize: WindowWidthSizeClass,
    modifier: Modifier = Modifier
) {
    val navigationType = when(windowSize) {
        WindowWidthSizeClass.Compact -> MyCityNavigationType.BOTTOM_NAVIGATION
        WindowWidthSizeClass.Medium -> MyCityNavigationType.NAVIGATION_RAIL
        WindowWidthSizeClass.Expanded -> MyCityNavigationType.PERMANENT_NAVIGATION_DRAWER
        else -> MyCityNavigationType.BOTTOM_NAVIGATION
    }
    Scaffold(
        modifier = modifier
    ) {
        MyCityHomeScreen(
            navigationType = navigationType,
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