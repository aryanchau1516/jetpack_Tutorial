package com.example.jetpackpractice

import com.example.jetpackpractice.ui.theme.JetpackPracticeTheme


import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.jetpackpractice.practice2.coreCmpnt.OnboardingScreen
import com.example.jetpackpractice.screens.LazyColumnss


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackPracticeTheme  {
                OnboardingScreen()
            }
        }
    }
}

@Composable
fun ShareCard() {
    val context = LocalContext.current
    val cardTitle = "Jetpack Compose"
    val cardDescription = "This is a sample description to share on WhatsApp."

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = cardTitle, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = cardDescription, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(12.dp))

            val messageToShare = "$cardTitle\n\n$cardDescription"

            Button(
                onClick = {
                    if (isWhatsAppInstalled(context)) {
                        shareToWhatsApp(context, messageToShare)
                    } else {
                        Toast.makeText(context, "WhatsApp is not installed.", Toast.LENGTH_SHORT).show()
                    }
                }
            ) {
                Text("Share on WhatsApp")
            }
        }
    }
}

fun shareToWhatsApp(context: Context, message: String) {
    val intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, message)
        type = "text/plain"
        `package` = "com.whatsapp"
    }

    try {
        context.startActivity(intent)
    } catch (e: ActivityNotFoundException) {
        Toast.makeText(context, "WhatsApp not installed", Toast.LENGTH_SHORT).show()
    }
}

fun isWhatsAppInstalled(context: Context): Boolean {
    return try {
        context.packageManager.getPackageInfo("com.whatsapp", 0)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }
}



/*
package com.example.whatsappshare

import android.content.ActivityNotFoundException
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.whatsappshare.ui.theme.WhatsAppShareTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WhatsAppShareTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ShareCard()
                }
            }
        }
    }
}

@Composable
fun ShareCard() {
    val context = LocalContext.current
    val cardTitle = "Jetpack Compose"
    val cardDescription = "This is a sample description to share on WhatsApp."

    Card(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = cardTitle, style = MaterialTheme.typography.titleLarge)
            Spacer(modifier = Modifier.height(8.dp))
            Text(text = cardDescription, style = MaterialTheme.typography.bodyMedium)
            Spacer(modifier = Modifier.height(12.dp))

            val messageToShare = "$cardTitle\n\n$cardDescription"

            Button(
                onClick = {
                    if (isWhatsAppInstalled(context)) {
                        shareToWhatsApp(context, messageToShare)
                    } else {
                        Toast.makeText(context, "WhatsApp is not installed.", Toast.LENGTH_SHORT).show()
                    }
                }
            ) {
                Text("Share on WhatsApp")
            }
        }
    }
}

fun shareToWhatsApp(context: Context, message: String) {
    val intent = Intent().apply {
        action = Intent.ACTION_SEND
        putExtra(Intent.EXTRA_TEXT, message)
        type = "text/plain"
        `package` = "com.whatsapp"
    }

    try {
        context.startActivity(intent)
    } catch (e: ActivityNotFoundException) {
        Toast.makeText(context, "WhatsApp not installed", Toast.LENGTH_SHORT).show()
    }
}

fun isWhatsAppInstalled(context: Context): Boolean {
    return try {
        context.packageManager.getPackageInfo("com.whatsapp", 0)
        true
    } catch (e: PackageManager.NameNotFoundException) {
        false
    }
}

 */