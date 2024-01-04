package com.example.e_commerce_app.ui.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Grid(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
)