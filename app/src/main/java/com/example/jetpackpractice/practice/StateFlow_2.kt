package com.example.jetpackpractice.practice

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.unit.dp

class StateFlow_2 : ViewModel() {
    private val _fruits = MutableStateFlow(listOf("Apple", "Banana", "Mango"))
    val fruits: StateFlow<List<String>> = _fruits  // Read-only StateFlow

    fun addFruit(newFruit: String) {
        if (newFruit.isNotBlank()) {  // Avoid empty input
            _fruits.update { it + newFruit }
        }
    }
}





@Composable
fun MyApp(viewModel: StateFlow_2 = viewModel()) {
    val fruitList by viewModel.fruits.collectAsState()  // Observe StateFlow
    var inputText by remember { mutableStateOf("") }  // Holds user input

    Column(modifier = Modifier.padding(16.dp)) {
        OutlinedTextField(
            value = inputText,
            onValueChange = { inputText = it },
            label = { Text("Enter fruit name") },
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(8.dp))

        Button(
            onClick = {
                viewModel.addFruit(inputText)
                inputText = ""  // Clear text field after adding
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Add Fruit")
        }

        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(fruitList) { fruit ->
                Text(text = fruit, modifier = Modifier.padding(8.dp))
            }
        }
    }
}