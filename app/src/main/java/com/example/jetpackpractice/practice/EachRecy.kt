package com.example.jetpackpractice.practice

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jetpackpractice.R
import com.example.jetpackpractice.utils.User

@Composable
fun EachRecy(user: User) {
    Card(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp).fillMaxWidth(),
        shape = RoundedCornerShape(CornerSize(10.dp)),
    ) {
        Row(modifier = Modifier.padding(5.dp)) {
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Description of the image",
                modifier = Modifier
                    .padding(8.dp)
                    .align(Alignment.CenterVertically).size(80.dp)
                    .clip(RoundedCornerShape(CornerSize(10.dp)))
            )
            Text(text = user.description, modifier = Modifier.padding(8.dp))
        }
    }
}

@Composable
fun Recycle(users: List<User>) {
    LazyColumn (modifier = Modifier.padding(10.dp)){
        items(users) { user -> // Use 'items()' instead of 'item()'
            EachRecy(user)
        }
    }
}
