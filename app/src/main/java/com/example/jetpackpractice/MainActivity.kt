package com.example.jetpackpractice

import ButtonWithInput
import SimpleTextInput
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackpractice.practice.EachRecy
import com.example.jetpackpractice.practice.ListAndItems
import com.example.jetpackpractice.practice.Login_Ui1
import com.example.jetpackpractice.practice.MoviesAndTVShowsScreen
import com.example.jetpackpractice.practice.MultiChoiceInput
import com.example.jetpackpractice.practice.MyApp
import com.example.jetpackpractice.practice.Recycle
import com.example.jetpackpractice.practice.SidebarExample
import com.example.jetpackpractice.practice.UserInput

import com.example.jetpackpractice.ui.theme.JetpackPracticeTheme
import com.example.jetpackpractice.utils.User
import com.example.jetpackpractice.utils.dummyData

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackPracticeTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                   // ListAndItems(modifier = Modifier.padding(innerPadding))
                   // SimpleTextInput(modifier = Modifier.padding(innerPadding))
                   // ButtonWithInput(modifier = Modifier.padding(innerPadding))
                   // MultiChoiceInput()
                   // SidebarExample()
                  //  UserInput(modifier = Modifier.padding(innerPadding))
                   // MoviesAndTVShowsScreen()
                    //Login_Ui1()
               //  Recycle(users = dummyData()) // pass here data class method
                    MyApp()

                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackPracticeTheme {
        Greeting("Android")
    }
}