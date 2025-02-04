package com.example.jetpackpractice.practice

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun MoviesAndTVShowsScreen() {
    var selectedTab by remember { mutableStateOf("Movies") }
    var isLoading by remember { mutableStateOf(true) }

    // Simulate data loading
    LaunchedEffect(Unit) {
        delay(2000) // Simulate a network call
        isLoading = false
    }

    Column(modifier = Modifier.fillMaxSize()) {
        // Toggle Buttons
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            ToggleButton(
                text = "Movies",
                isSelected = selectedTab == "Movies",
                onClick = { selectedTab = "Movies"; isLoading = true }
            )
            ToggleButton(
                text = "TV Shows",
                isSelected = selectedTab == "TV Shows",
                onClick = { selectedTab = "TV Shows"; isLoading = true }
            )
        }

        // Content Area
        if (isLoading) {
            ShimmerEffect()
        } else {
            // Replace with actual data display
            ContentDisplay(selectedTab)
        }
    }
}

@Composable
fun ToggleButton(text: String, isSelected: Boolean, onClick: () -> Unit) {
    val backgroundColor = if (isSelected) Color.Blue else Color.Gray
    val textColor = if (isSelected) Color.White else Color.Black

    Box(
        modifier = Modifier
            .clickable(onClick = onClick)
            .background(backgroundColor, RoundedCornerShape(8.dp))
            .padding(16.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(text = text, color = textColor)
    }
}

@Composable
fun ShimmerEffect() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
    ) {
        // Shimmer effect can be implemented using a gradient or animation
        // Here we just show a placeholder
        Text(
            text = "Loading...",
            modifier = Modifier.align(Alignment.Center),
            style = TextStyle(
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black // Customize the color if needed
            )
        )
    }
}

@Composable
fun ContentDisplay(selectedTab: String) {
    // Replace this with actual content based on selectedTab
    Text(
        text = "Displaying $selectedTab",
        modifier = Modifier.fillMaxSize(),
        style = TextStyle(
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black // Customize the color if needed
        ),
        color = Color.Black,
        textAlign = androidx.compose.ui.text.style.TextAlign.Center
    )
}

@Composable
@Preview(showBackground = true)
fun PreviewMoviesAndTVShowsScreen() {
    MoviesAndTVShowsScreen()
}