package com.example.state

sealed class Routes (
    val routes: String
        ){
    object ScreenOne : Routes(routes = "screen_one")
    object ScreenTwo : Routes(routes = "screen_two")

}
