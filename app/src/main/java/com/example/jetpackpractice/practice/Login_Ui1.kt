package com.example.jetpackpractice.practice

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun Login_Ui1() {
    val userName = remember { mutableStateOf("") }
    val passWord = remember { mutableStateOf("") }
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = com.example.jetpackpractice.R.drawable.back),
            contentDescription = "Background",
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        Column(modifier = Modifier.fillMaxSize().padding(20.dp)) {
            Column (modifier = Modifier.fillMaxSize().padding(20.dp),
                verticalArrangement = Arrangement.Top, horizontalAlignment = Alignment.CenterHorizontally) {
                Text(
                    text = "Hello Again!",
                    color = Color.Red,
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Welcome Noida",
                    color = Color.Red,
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Blog!",
                    color = Color.Red,
                    fontSize = 23.sp,
                    fontWeight = FontWeight.Bold
                )

                OutlinedTextField(
                    value = userName.value,
                    onValueChange = {
                        userName.value = it
                    }, shape = RoundedCornerShape(20.dp),  colors = OutlinedTextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White
                    ),
                    leadingIcon = {
                        Icon(Icons.Default.Person, contentDescription = null)
                    }, label = {
                        Text(text = "Username")
                    },
                    placeholder = {
                        Text("Enter Name")
                    }
                )
                OutlinedTextField(
                    value = passWord.value,
                    onValueChange = {
                        passWord.value = it
                    },  shape = RoundedCornerShape(20.dp),colors = OutlinedTextFieldDefaults.colors( unfocusedContainerColor = Color.Magenta,
                        focusedContainerColor = Color.White),

                    leadingIcon = {
                        Icon(Icons.Default.Password, contentDescription = null)
                    },
                    label = {
                        Text(text = "Passward")
                    },
                    placeholder = {
                        Text(text = "Enter Passward")
                    }
                )

                OutlinedButton(onClick = {}) {
                    Text(text = "Login")
                }
            }
        }
    }
}