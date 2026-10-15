package com.example.myapplication

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(context : Context) {
    var navController = rememberNavController()
    NavHost(navController = navController, startDestination = "Login")
    {
        composable("Login") {
            LoginActivityUI(context, navController)
        }


        composable("SignUp")
        {
            RegisterUi(context, navController)
        }
    }

}

