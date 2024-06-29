package com.betatech.mycityapp

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithContentDescription
import androidx.compose.ui.test.performClick
import androidx.navigation.compose.ComposeNavigator
import androidx.navigation.testing.TestNavHostController
import com.betatech.mycityapp.navigation.TopLevelDestination
import com.betatech.mycityapp.ui.MyCityApp
import com.betatech.mycityapp.utils.assertCurrentRouteName
import com.betatech.mycityapp.utils.onNodeWithStringId
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
        navController.assertCurrentRouteName(TopLevelDestination.HOME.name)
    }

    @Test
    fun myCityNavHost_verifyTitleInAppBar() {
        composeTestRule.onNodeWithStringId(R.string.home).assertExists()
    }

    @Test
    fun myCityNavHost_clickOnSearch_navigateToSearchScreen(){
        composeTestRule.onNodeWithContentDescription(composeTestRule.activity.getString(TopLevelDestination.SEARCH.text)).performClick()
        navController.assertCurrentRouteName(TopLevelDestination.SEARCH.name)
    }
}