package com.example.jetpackpractice.practice2

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackpractice.R

// for resource
@Preview(showBackground = true)
@Composable
fun StringThemeColor(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center){

        Text(text = stringResource(R.string.arya), color = colorResource(R.color.yellow))
        Spacer(modifier = Modifier.height(20.dp))
        Image(painter = painterResource(R.drawable.eght), contentDescription = "image")
    }
}