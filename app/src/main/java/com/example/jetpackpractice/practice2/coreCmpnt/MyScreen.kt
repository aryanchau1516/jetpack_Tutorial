package com.example.jetpackpractice.practice2.coreCmpnt



import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.yourapp.ui.components.CustomAppHeader

//@Preview(showBackground = true)
@Composable
fun SomeScreen() {
    Scaffold(
        topBar = {
            SimpleAppHeader("this","hello","good")
//            CustomAppHeader(
//                title = "My Screen",
//                navigationIcon = {
//                    IconButton(onClick = {}) {
//                        Icon(
//                            imageVector = Icons.Default.ArrowBack,
//                            contentDescription = "Back"
//                        )
//                    }
//                },
//                actions = {
//                    IconButton(onClick = { /* Do something */ }) {
//                        Icon(
//                            imageVector = Icons.Default.MoreVert,
//                            contentDescription = "Menu"
//                        )
//                    }
//                }
//            )
        }
    ) {
        // Screen Content

        Text(modifier = Modifier.padding(it), text = " Hello")
    }
}
