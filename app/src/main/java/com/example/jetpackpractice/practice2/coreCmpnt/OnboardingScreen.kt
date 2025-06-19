package com.example.jetpackpractice.practice2.coreCmpnt

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.tooling.preview.Preview
import com.example.jetpackpractice.R

@Preview(showBackground = true)
@Composable
fun OnboardingScreen() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0x6AE3FFF7) // light peach background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp),
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.eght), // Add your image in res/drawable
                contentDescription = "Illustration",
                modifier = Modifier
                    .size(220.dp)
                    .padding(top = 40.dp)
                    .clip(CircleShape)
                    .background(Color.White)
            )
            Text(
                text = "Welcome to Haptive",
                style = MaterialTheme.typography.titleLarge.copy(
                    fontWeight = FontWeight.Bold,
                    color = Color.Black
                ),
                modifier = Modifier.padding(top = 24.dp)
            )

            Text(
                text = "Your self-improvement journey starts here. Build long-lasting habits and achieve your goals",
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = Color.Gray,
                    textAlign = TextAlign.Center
                ),
                modifier = Modifier
                    .padding(horizontal = 20.dp, vertical = 12.dp)
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                modifier = Modifier.padding(vertical = 16.dp)
            ) {
                repeat(3) { index ->
                    Box(
                        modifier = Modifier
                            .size(if (index == 1) 12.dp else 8.dp)
                            .padding(4.dp)
                            .clip(CircleShape)
                            .background(if (index == 1) Color(0xFFFF6D00) else Color.Gray)
                    )
                }
            }
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 30.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                OutlinedButton(
                    onClick = { /* Skip Logic */ },
                    shape = RoundedCornerShape(50),
                    modifier = Modifier.weight(1f),
                    colors = ButtonDefaults.outlinedButtonColors(
                        contentColor = Color.Blue  // Text and icon color
                    ),
                    border = ButtonDefaults.outlinedButtonBorder.copy(
                        brush = SolidColor(Color.Blue)
                    )
                ) {
                    Text("Skip")
                }

                Spacer(modifier = Modifier.width(16.dp))

                Button(
                    onClick = { /* Get Started Logic */ },
                    shape = RoundedCornerShape(50),
                    colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFFF6D00)),
                    modifier = Modifier.weight(1f)
                ) {
                    Text("Get Started", color = Color.White     )
                }
            }

        }
    }
}
