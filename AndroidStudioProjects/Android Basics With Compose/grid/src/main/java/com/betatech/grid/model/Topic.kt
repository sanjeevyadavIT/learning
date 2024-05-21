package com.betatech.grid.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val title: Int,
    val numberOfCourses: Int,
    @DrawableRes val icon: Int
)
