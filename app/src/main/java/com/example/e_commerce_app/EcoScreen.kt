package com.example.e_commerce_app

import android.app.appsearch.AppSearchResult.RESULT_OK
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.annotation.StringRes
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.e_commerce_app.presentation.sign_in.GoogleAuthUiClient
import com.example.e_commerce_app.presentation.sign_in.SignInViewModel
import com.example.e_commerce_app.ui.SecondPage
import com.example.e_commerce_app.ui.frontPage
import com.example.e_commerce_app.ui.thirdLayer
import kotlinx.coroutines.coroutineScope


enum class EcoScreen(@StringRes val title: Int){
    Start(R.string.app),
    SignUp(R.string.details),
    Order(R.string.order)
}


@Composable
fun EcoApp(
    navController: NavHostController = rememberNavController(),

    ){

        val navController = rememberNavController()
    NavHost(
            navController = navController,
            startDestination = EcoScreen.Start.name,
        ) {
            composable(route = EcoScreen.Start.name) {

                val viewModel = viewModel<SignInViewModel>()
                val state by viewModel.state.collectAsStateWithLifecycle()

                val launcher = rememberLauncherForActivityResult(
                    contract = ActivityResultContracts.StartIntentSenderForResult(),
                    onResult = {


                    }
                )



                frontPage(
                    state = state,
                    onSignInClick ={

                    },

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

