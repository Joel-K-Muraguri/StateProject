package com.example.state

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Close
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController

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
        var count by rememberSaveable {
            mutableStateOf(0)
        }
            Column(
            ) {
                if (count > 0){
                    var showTask by remember {
                        mutableStateOf(true)
                    }
                    if (showTask){
                        TodoTaskItem(
                            taskName = "Task One",
                            onClose = { showTask = false},
                            onCheckChanged = {true},
                            checked = true
                        )
                    }
                    Text(text = "These are $count tasks")
                }
                Row(
                    verticalAlignment = Alignment.CenterVertically,
                    modifier = Modifier.padding(top = 10.dp)

                ) {
                    Spacer(modifier = Modifier.height(5.dp))
                    Button(onClick = { count++ }) {
                        Text(text = "Add Task")
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = "Close Task")
                    }
                }
        }
    }
}

@Composable
fun TodoTaskItem(
    taskName: String,
    onClose: () -> Unit,
    checked: Boolean,
    onCheckChanged: (Boolean) -> Unit
   
){
    Row(
        modifier = Modifier.fillMaxWidth()
    ) {
       Text(text = taskName) 
        Spacer(modifier = Modifier.size(20.dp))
        Checkbox(
            checked = checked ,
            onCheckedChange = onCheckChanged)

        IconButton(onClick = { onClose }) {
            Icon(imageVector = Icons.Filled.Close,
                contentDescription = "")
        }
    }
    
}

@Preview
@Composable
fun TaskItemPreview(){
    TodoTaskItem(
        taskName = "Task #1",
        onClose = { }, checked = true,
        onCheckChanged = {true})
}

@Composable
fun Stateless(
    count : Int,
    onIncrement : () -> Unit
){
    Column() {
        if (count > 0){
            Text(text = "These are $count tasks")
        }
        Button(onClick = { onIncrement }) {
            Text(text = "Add Task")
        }
    }

}

@Composable
fun Stateful(){
    var count by rememberSaveable() {
        mutableStateOf(0)
    }
    Stateless(
        count = count,
        onIncrement = {count++}
    )
}