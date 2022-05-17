package com.example.state

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import java.lang.reflect.Modifier

@Composable
fun TodoTask(
    navController: NavHostController
){
    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                       Text(text = "State")
                },
                actions = {
                    IconButton(onClick = {
                        navController.navigate(Routes.ScreenOne.routes)
                    }) {
                        Icon(imageVector = Icons.Filled.ArrowForward,
                            contentDescription = "")
                    }
                }
            )
        },

    ) {
        var count = 0

        Column(

        ) {
            Text(text = "This are $count tasks")

            Button(onClick = { count++ }) {
                Text(text = "Add Task")
            }
        }
    }
}
