package com.example.jetpackpractice.screens

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LoginUi(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    var text1 by remember { mutableStateOf("") }
    var text2 by remember { mutableStateOf("") }
    fun logged(name: String, password : String){
        if(name == "Aryan"&& password == "1234"){
            Toast.makeText(context,"logged !!", Toast.LENGTH_SHORT).show()
        }
        else{
            Toast.makeText(context,"wrong credential", Toast.LENGTH_SHORT).show()
        }
    }
    Column(modifier= Modifier.fillMaxSize().padding(20.dp), verticalArrangement = Arrangement.Center) {
        Text(
            text = "Hello Again !", style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                fontFamily = FontFamily.Monospace
            )
        )
        Text(
            text = "Welcome", style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                fontFamily = FontFamily.Monospace
            )
        )
        Text(
            text = "Back", style = TextStyle(
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                fontFamily = FontFamily.Monospace
            )
        )
        OutlinedTextField(
            value = text1,
            onValueChange = {
                text1 = it
            },
            placeholder = {
                Text(text = "Enter user name")
            },
            label = {
                Text(text = "Username")
            }, leadingIcon = {
                Icon(Icons.Default.Person, contentDescription = "person")
            },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedTextField(
            value = text2,
            onValueChange = {
                text2 = it
            },
            label = {
                Text(text = "Password")
            },
            placeholder = {
                Text(text = "Enter Password")
            },
            leadingIcon = {
                Icon(Icons.Default.Password, contentDescription = "person")
            },
            modifier = Modifier.fillMaxWidth()
        )
        OutlinedButton(onClick = {logged(text1,text2)},modifier = Modifier.fillMaxWidth().padding(10.dp)) {
            Text(text = "Login")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Greet(modifier: Modifier = Modifier) {
    LoginUi()
}