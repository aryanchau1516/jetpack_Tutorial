package com.example.jetpackpractice.screens

import androidx.compose.foundation.Image

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.jetpackpractice.R

@Preview(showBackground = true)
@Composable
fun LazyColumnss(modifier: Modifier = Modifier) {
   RecyCleView(users = dummyData())
}

@Composable
fun EachRow(modifier: Modifier = Modifier, user: User) {
    Card(
        modifier = Modifier.padding(vertical = 8.dp, horizontal = 8.dp).fillMaxWidth(),
        shape = RoundedCornerShape(CornerSize(10.dp)),
        elevation = CardDefaults.cardElevation(3.dp) // ✅ This is correct in Material3
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.eght), contentDescription = "image",
                modifier = Modifier.size(65.dp)
                    .padding(8.dp)
                    .align(Alignment.CenterVertically)
                    .clip(RoundedCornerShape(CornerSize(10.dp)))
            )
            Text(text = user.description,modifier= Modifier.padding(8.dp))
        }
    }
}


@Composable
fun RecyCleView(users:List<User>) {
    LazyColumn{
        items(users) {user->
            EachRow(

                user =user
            )
        }
    }
}