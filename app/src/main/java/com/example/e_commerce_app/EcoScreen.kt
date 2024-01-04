package com.example.e_commerce_app

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce_app.ui.E_commerceViewModel
import com.example.e_commerce_app.ui.SecondPage
import com.example.e_commerce_app.ui.frontPage
import com.example.e_commerce_app.ui.thirdLayer
import java.lang.reflect.Modifier
import androidx.navigation.NavHost as NavHost1


enum class EcoScreen(@StringRes val title: Int){
    Start(R.string.app),
    SignUp(R.string.details),
    Order(R.string.order)
}

@Composable
fun EcoApp(
    navController: NavHostController = rememberNavController()

    ){


    NavHost(
            navController = navController,
            startDestination = EcoScreen.Start.name,
        ) {
            composable(route = EcoScreen.Start.name) {
                frontPage(
                    onNextButtonClicked = {
                        navController.navigate(EcoScreen.SignUp.name)
                    }
                )
            }

            composable(route = EcoScreen.SignUp.name) {

                SecondPage(
                    onNextButtonClicked = {
                        navController.navigate(EcoScreen.Order.name)
                    }
                )

            }

            composable(route = EcoScreen.Order.name) {

                thirdLayer()

            }

        }
    }

