package com.betatech.mycityapp.navigation

import androidx.annotation.StringRes
import com.betatech.mycityapp.R

sealed class HomeLevelDestination(val route: String, @StringRes val resourceId: Int) {
    data object HomeScreen : HomeLevelDestination("HomeScreen", R.string.home)
    data object DetailScreen : HomeLevelDestination("DetailScreen", R.string.detail)
}