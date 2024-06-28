package com.betatech.mycityapp.ui

import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.betatech.mycityapp.ui.utils.MyCityNavigationType
import com.betatech.mycityapp.ui.utils.NavigationItemContent

@Composable
fun MyCityHomeScreen(
    modifier: Modifier
) {
    // TODO: Show either list View or List+Detail view in expanded state
    CategoryListScreen()
}

