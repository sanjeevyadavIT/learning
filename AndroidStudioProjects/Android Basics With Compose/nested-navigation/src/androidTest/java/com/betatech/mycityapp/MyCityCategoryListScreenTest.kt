package com.betatech.mycityapp

import androidx.activity.ComponentActivity
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createAndroidComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.betatech.mycityapp.model.Category
import com.betatech.mycityapp.ui.MyCityCategoryListScreen
import org.junit.Before
import org.junit.Rule
import org.junit.Test

class MyCityCategoryListScreenTest {

    @get:Rule
    val composeRule = createAndroidComposeRule<ComponentActivity>()

    @Before
    fun setupCategoryListScreen(){
        val categoryList = listOf(
            Category(
                id = 1,
                title = "Food",
                thumbnail = "image"
            )
        )

        composeRule.setContent {
            MyCityCategoryListScreen(
                windowSize = WindowWidthSizeClass.Compact,
                categoryList = categoryList,
                selectedCategoryId = 0,
                onCategoryClicked = {}
            )
        }
    }

    @Test
    fun categoryListScreen_is_displayed(){
        composeRule.onNodeWithText("Food").assertIsDisplayed()
    }
}