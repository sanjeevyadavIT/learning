package com.betatech.mycityapp.ui

import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.PermanentDrawerSheet
import androidx.compose.material3.PermanentNavigationDrawer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.betatech.mycityapp.R
import com.betatech.mycityapp.ui.utils.MyCityNavigationType
import com.betatech.mycityapp.ui.utils.NavigationItemContent

@Composable
fun MyCityHomeScreen(navigationType: MyCityNavigationType, modifier: Modifier) {
    val navigationItemContentList = listOf(
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

    val itemSelected = remember {
        mutableStateOf(navigationItemContentList[0])
    }

    if (navigationType == MyCityNavigationType.PERMANENT_NAVIGATION_DRAWER) {
        PermanentNavigationDrawer(drawerContent = {
            PermanentDrawerSheet(modifier = Modifier.width(240.dp)) {
                navigationItemContentList.forEach {
                    NavigationDrawerItem(
                        label = {
                            Text(text = it.text)
                        },
                        selected = it == itemSelected.value,
                        icon = {
                            Icon(imageVector = it.icon, contentDescription = null)
                        },
                        onClick = {
                            itemSelected.value = it
                        })
                }
            }
        }) {
            CategoryListScreen()
        }
    } else {
        CategoryListScreen()
    }
}

