package com.example.state

import androidx.compose.runtime.Composable

@Composable
fun TodoList(){
     fun todolist() = List(30){ i ->
         Todo(
             i,
             "Task $i"
         )
    }
}