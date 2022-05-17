package com.example.state

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.state.ui.theme.StateTheme
import kotlin.random.Random

@Composable
fun Greetings() {
    val color = remember {
        mutableStateOf(Color.Yellow)
    }
    Box(modifier = Modifier
        .fillMaxSize()
        .background(color.value)
        .clickable {
            color.value = Color(
                Random.nextFloat(),
                Random.nextFloat(),
                Random.nextFloat(),
                1f
            )
        }

    )
    {
        /*Text(text = "CLICK ME",
            textAlign = TextAlign.Center,
            fontSize = 30.sp,
            fontWeight = FontWeight.ExtraBold)
    }
    var text = remember {
        mutableStateOf("")
    }.toString()
    val correct :   String
    val incorrect : String
    val colorValue : Color = color.value

    var result = if (colorValue.equals(color)){
        correct = "CORRECT"
    }
    else{
        incorrect = "INCORRECT.TRY AGAIN"

    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Color is ", fontSize = 50.sp, fontWeight = FontWeight.Bold)
        TextField(
            value = text,
            onValueChange = {text = it},
            label = {
                Text(text = "Color Name")
            }
        )
        Button(onClick = { }) {
            Spacer(modifier = Modifier.height(20.dp))
            Text(text = "SUBMIT")

        } 8*/
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StateTheme {
       Greetings()
    }
}