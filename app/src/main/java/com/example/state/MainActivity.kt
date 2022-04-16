package com.example.state

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.state.ui.theme.StateTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            StateTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
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

      ){}

}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    StateTheme {
        Greeting()
    }
}