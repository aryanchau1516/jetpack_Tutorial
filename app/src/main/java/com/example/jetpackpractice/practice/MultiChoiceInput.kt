package com.example.jetpackpractice.practice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun MultiChoiceInput() {
    // Using remember with mutableStateOf
    val option1 = remember { mutableStateOf(false) }
    val option2 = remember { mutableStateOf(false) }

    Column(modifier = Modifier.padding(16.dp)) {
        Row {
            Checkbox(checked = option1.value, onCheckedChange = { option1.value = it })
            Text("Option 1")
        }
        Row {
            Checkbox(checked = option2.value, onCheckedChange = { option2.value = it })
            Text("Option 2")
        }
        Text("Selected Options: ${if (option1.value) "1 " else ""}${if (option2.value) "2 " else ""}")
    }
}
