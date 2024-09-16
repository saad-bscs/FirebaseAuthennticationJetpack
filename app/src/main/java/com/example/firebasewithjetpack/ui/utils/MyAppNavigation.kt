package com.example.firebasewithjetpack.ui.utils

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.firebasewithjetpack.ui.viewModel.AuthViewModel
import com.example.firebasewithjetpack.ui.pages.HomePage
import com.example.firebasewithjetpack.ui.pages.LoginPage
import com.example.firebasewithjetpack.ui.pages.SignUpPage

@Composable
fun MyAppNavigation(modifier: Modifier = Modifier, authViewModel: AuthViewModel) {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Routes.loginScreen, builder = {

        composable(Routes.loginScreen) {
            LoginPage(modifier, navController, authViewModel)
        }

        composable(Routes.signUpScreen) {
            SignUpPage(modifier, navController, authViewModel)
        }

        composable(Routes.homeScreen) {
            HomePage(modifier, navController, authViewModel)
        }

    })
}