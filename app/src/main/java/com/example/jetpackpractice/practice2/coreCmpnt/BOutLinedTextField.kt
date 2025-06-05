package com.example.jetpackpractice.practice2.coreCmpnt

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation


@Composable
fun BOutLinedTextField(modifier: Modifier = Modifier) {
    var text by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val rainBow = listOf(
        Color.Red,
        Color.Green,
        Color.Magenta,
        Color.Blue,
        Color.Green
    )
    val brush = remember {
        Brush.linearGradient(
            colors = rainBow
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("Enter your name") },
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth(),

            )

        Spacer(modifier = Modifier.height(16.dp))

        TextField(
            value = text,
            onValueChange = { text = it }, textStyle = TextStyle(brush = brush),
            label = { Text("Enter address", style = TextStyle(brush = brush)) },
            shape = RoundedCornerShape(16.dp),
            modifier = Modifier.fillMaxWidth(),
//            colors = TextFieldDefaults.textFieldColors(
//                containerColor = Color.White // background only for text box
//            )
        )

        // textFiel with passwaord
        OutlinedTextField(
            value = password,
            onValueChange = {
                password = it
            }, label = {
                Text(text = "Enter Your Password")
            },
            visualTransformation = PasswordVisualTransformation(),
            keyboardOptions = KeyboardOptions(
                keyboardType = KeyboardType.Password  // whatever we type it cnvert in password type
            )
        )

    }
}
//
//@Preview(showBackground = true)
//@Composable
//fun Greeting() {
//    BOutLinedTextField()
//}
