package com.example.navigationincompose

import android.util.Log
import androidx.navigation.*
import androidx.navigation.compose.composable
import com.example.navigationincompose.screen.DetailsScreen
import com.example.navigationincompose.screen.HomeScreen

fun NavGraphBuilder.homeNavGraph(
    navController: NavHostController
){
    navigation(
        startDestination = Screen.Home.route,
        route = HOME_ROUTE
    ){
        composable(
            route = Screen.Home.route
        ){
            HomeScreen(navController)
        }
        composable(
            route = Screen.Detail.route,
            arguments = listOf(
                navArgument(DETAIL_ARGUMENT_KEY) {
                    type = NavType.IntType
                },
                navArgument(DETAIL_ARGUMENT_KEY2){
                    type = NavType.StringType
                }
            )
        ){
            Log.d("Args", "the argument is ${it.arguments?.getInt(DETAIL_ARGUMENT_KEY)}")
            Log.d("Args", "the argument is ${it.arguments?.getString(DETAIL_ARGUMENT_KEY2)}")

            DetailsScreen(navController)
        }
    }
}