package com.betatech.mycityapp.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector
import com.betatech.mycityapp.R

enum class TopLevelDestination(
    val icon: ImageVector,
    @StringRes val text: Int
) {
    HOME(
        icon = Icons.Default.Home,
        text = R.string.home
    ),
    SEARCH(
        icon = Icons.Default.Search,
        text = R.string.search
    ),
    PROFILE(
        icon = Icons.Default.Person,
        text = R.string.profile
    )
}