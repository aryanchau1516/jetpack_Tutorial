package com.example.jetpackpractice.practice

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp


class FruitViewModel : ViewModel() {
    private val _fruits = MutableStateFlow(listOf("Apple", "Banana", "Mango"))  // ✅ StateFlow List
    val fruits: StateFlow<List<String>> = _fruits  // ✅ Expose as Read-Only StateFlow

    fun addFruit(newFruit: String) {
        _fruits.update { it + newFruit }  // ✅ Add new fruit dynamically
    }
}



@Composable
fun FruitListScreen(viewModel: FruitViewModel = viewModel()) {
    val fruitList by viewModel.fruits.collectAsState()  // ✅ Collect StateFlow in Compose

    Column(modifier = Modifier.padding(16.dp)) {
        Button(onClick = { viewModel.addFruit("Orange") }) {
            Text("Add Orange")
        }

        LazyColumn {
            items(fruitList) { fruit ->
                Text(text = fruit, modifier = Modifier.padding(8.dp))
            }
        }
    }
}
