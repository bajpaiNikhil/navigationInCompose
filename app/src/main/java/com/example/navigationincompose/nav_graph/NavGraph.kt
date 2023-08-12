package com.example.navigationincompose.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.*
import androidx.navigation.compose.NavHost
import com.example.navigationincompose.HOME_ROUTE
import com.example.navigationincompose.ROOT_ROUTE
import com.example.navigationincompose.Screen
import com.example.navigationincompose.homeNavGraph

@Composable
fun SetUpNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = HOME_ROUTE,
        route = ROOT_ROUTE
    ) {
        homeNavGraph(navController = navController)
        authNavGraph(navController = navController)
    }
}