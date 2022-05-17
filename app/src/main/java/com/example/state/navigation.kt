package com.example.state

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavigationGraph(
    navController: NavHostController
){
    NavHost(
        navController = navController,
        startDestination = Routes.ScreenTwo.routes, )
    {
        composable(route = Routes.ScreenTwo.routes){
           TodoTask(navController)
        }
        composable(route = Routes.ScreenOne.routes){
            Greetings()
        }
    }
}