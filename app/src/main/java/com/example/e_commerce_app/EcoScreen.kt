package com.example.e_commerce_app

import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce_app.ui.E_commerceViewModel


enum class EcoScreen(@StringRes val title: Int){
    Start(R.string.app),
    SignUp(R.string.details),
    Order(R.string.order)
}

@Composable
fun EcoApp(
    viewModel: E_commerceViewModel = viewModel(),
    navController: NavHostController = rememberNavController()

    ){


}