package com.example.jetpackpractice.practice
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.rememberDrawerState
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.IconButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.mutableStateOf
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SidebarExample() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val coroutineScope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            // Sidebar content
            Column {
                Text("Item 1", style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(16.dp))
                Text("Item 2", style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(16.dp))
                Text("Item 3", style = MaterialTheme.typography.bodyLarge, modifier = Modifier.padding(16.dp))
            }
        },
        content = {
            // Main content area
            Scaffold(
                topBar = {
                    TopAppBar(
                        title = { Text("Sidebar Example") },
                        navigationIcon = {
                            IconButton(onClick = {
                                coroutineScope.launch {
                                    drawerState.open() // Launch coroutine to open the drawer
                                }
                            }) {
                                Icon(imageVector = Icons.Default.Menu, contentDescription = "Open Drawer")
                            }
                        }
                    )
                },
                content = { paddingValues ->
                    // Main content goes here
                    Text("Main content goes here", modifier = Modifier.fillMaxSize().padding(paddingValues))
                }
            )
        }
    )
}

@Preview
@Composable
fun PreviewSidebarExample() {
    SidebarExample()
}


//@Composable
//fun UserInput() {
//    var text = remember { mutableStateOf("") }
//
//    TextField(
//        value = text,
//        onValueChange = { text = it },
//        label = { Text("Enter your name") }
//    )
//}


@Composable
fun UserInput(modifier: Modifier = Modifier) {
    val text = remember { mutableStateOf("") }

    TextField(
        value = text.value,
        onValueChange = { text.value = it },
        label = { Text("Enter your name") }
    )
}
