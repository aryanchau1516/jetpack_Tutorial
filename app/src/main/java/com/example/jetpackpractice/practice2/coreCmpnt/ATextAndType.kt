package com.example.jetpackpractice.practice2.coreCmpnt

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun TextAndType() {
    val rainBow = listOf(
        Color.Black,
        Color.Cyan,
        Color.Green,
        Color.Magenta,
        Color.Blue,
        Color.Red
    )
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
//        Text(
//            text = "Hello aryan ", color = Color.Blue,
//            fontSize = 22.sp, fontStyle = FontStyle.Italic,
//            style = TextStyle(
//                shadow = Shadow(color = Color.Black, blurRadius = 20f)
//            )
//        )
        Spacer(modifier = Modifier.height(5.dp))
        Text(text = buildAnnotatedString {
            append("Do not allw to dim \n")
            withStyle(
                SpanStyle(
                    brush = Brush.linearGradient(
                        colors = rainBow
                    )
                )
            ) {
                append("kaisa lge hai ye ishq sufiyana")
            }
            append("\nnot raggin")
        })
    }
}


@Composable
fun ScrollableText(modifier: Modifier = Modifier) {
    Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        Text(
            text = "hell aryan how are you to kaise hai aap".repeat(50),
            maxLines = 2,
            //modifier = Modifier.basicMarquee(), // for scroll
            fontSize = 30.sp,
            overflow = TextOverflow.Ellipsis
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun Greeting(modifier: Modifier = Modifier) {
    ScrollableText()
}