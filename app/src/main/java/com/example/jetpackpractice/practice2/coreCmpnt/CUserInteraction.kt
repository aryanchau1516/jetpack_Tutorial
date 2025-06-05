package com.example.jetpackpractice.practice2.coreCmpnt

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.text.selection.DisableSelection
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CUserInteraction(modifier: Modifier = Modifier) {

    SelectionContainer {
        Column {
            Text(text = "This is selectable..")
            Text(text = "This is selectable..")
            Text(text = "This is selectable..")
            Text(text = "This is selectable..")
            DisableSelection {
                Text(text = "This is not selectable..")
                Text(text = "This is not selectable..")
                Text(text = "This is not selectable..")
            }
        }
    }
}


//
//@Preview(showBackground = true)
//@Composable
//fun Greeting() {
//    CUserInteraction()
//}
