package com.example.navigationincompose.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import com.example.navigationincompose.AUTHENTICATION_ROUTE
import com.example.navigationincompose.Screen
import com.example.navigationincompose.screen.LoginScreen
import com.example.navigationincompose.screen.SignUpScreen


fun NavGraphBuilder.authNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Login.route,
        route = AUTHENTICATION_ROUTE
    ){
        composable(
            route = Screen.Login.route,
        ){
            LoginScreen(navHostController = navController)
        }
        composable(
            route = Screen.SignUp.route
        ){
            SignUpScreen(navHostController = navController)
        }
    }

}