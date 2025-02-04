package com.example.jetpackpractice.practice

import androidx.compose.foundation.layout.Column
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Password
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Preview(showBackground = true)
@Composable
fun Login_Ui1() {
    val userName = remember { mutableStateOf("") }
    val passWord = remember { mutableStateOf("") }
        Column {
            Text(text ="Hello Again!", color = Color.Red, fontSize = 23.sp, fontWeight = FontWeight.Bold)
            Text(text ="Welcome Noida", color = Color.Red, fontSize = 23.sp, fontWeight = FontWeight.Bold)
            Text(text ="Blog!", color = Color.Red, fontSize = 23.sp, fontWeight = FontWeight.Bold)

            OutlinedTextField(
                value = userName.value,
                onValueChange = {
                    userName.value=it
                },
                leadingIcon = {
                    Icon(Icons.Default.Person,contentDescription = null)
                }, label = {
                    Text(text ="Username")
                },
                placeholder = {
                    Text("Enter Name")
                }
            )
            OutlinedTextField(
                value = passWord.value,
                onValueChange = {
                    passWord.value=it
                },

                leadingIcon = {
                    Icon(Icons.Default.Password,contentDescription = null)
                },
                label = {
                    Text(text = "Passward")
                },
                placeholder = {
                    Text(text = "Enter Passward")
                }
            )

            OutlinedButton(onClick = {}){
                Text(text = "Login")
            }
        }
}