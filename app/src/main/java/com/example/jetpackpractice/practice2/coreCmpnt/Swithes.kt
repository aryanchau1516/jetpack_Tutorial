package com.example.jetpackpractice.practice2.coreCmpnt

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Switch
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun Swithes(modifier: Modifier = Modifier) {
    var swit by remember { mutableStateOf(false) }
    Switch(
        checked = swit,
        onCheckedChange = {
            swit = it
        },
        modifier = Modifier.size(20.dp).padding(40.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun Greeting(){
    Swithes(modifier = Modifier)
}