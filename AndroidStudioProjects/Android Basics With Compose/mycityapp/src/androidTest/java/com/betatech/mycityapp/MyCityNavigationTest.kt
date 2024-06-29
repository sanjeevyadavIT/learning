package com.betatech.mycityapp

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.betatech.mycityapp.navigation.TopLevelDestination
import com.betatech.mycityapp.ui.MyCityApp
import junit.framework.TestCase.assertEquals
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MyCityNavigationTest {

    @get:Rule
    val composeTestRule = createAndroidComposeRule<ComponentActivity>()

    private lateinit var navController: TestNavHostController

    @Before
    fun setupMyCityNavHost(){
        composeTestRule.setContent {
            navController = TestNavHostController(LocalContext.current).apply {
                navigatorProvider.addNavigator(ComposeNavigator())
            }
            MyCityApp(windowSize = WindowWidthSizeClass.Compact, navController = navController)
        }
    }

    @Test
    fun myCityNavHost_verifyStartDestination() {
        assertEquals(navController.currentBackStackEntry?.destination?.route, TopLevelDestination.HOME.name)
    }
}