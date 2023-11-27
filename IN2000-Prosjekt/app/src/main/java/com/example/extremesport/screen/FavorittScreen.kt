package com.example.extremesport.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extremesport.R


// This could be a setting in ArkivScreen, that toggles to only display favorited cards
@Composable
fun FavorittScreen(){
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp

    val cards = listOf(
        Card(
            stationName = "StasjonNavn",
            rating = 3,
            stationInfo = "Info om stasjon",
            isFavorite = true
        )
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter
    ) {
        Column(
            modifier = Modifier
                .background("#1C6EAE".color)
                .fillMaxWidth()
                .height(200.dp)
                .padding(16.dp)
                .offset(y = (-50).dp)
        ) {
            Image(
                painterResource(id = R.drawable.jumptime_tekst_whiteontransparent),
                contentDescription = "Logonavn",
                contentScale = ContentScale.FillWidth,
                modifier = Modifier
                    .size(130.dp)
                    .offset(x = (-17).dp)
            )
            Text(
                text = "Favoritter - <3!",
                fontSize = 30.sp,
                color = Color.White,
                modifier = Modifier.offset(y = (-55).dp)
            )
        }
        Column(
            modifier = Modifier
                .background(
                    color = Color.White,
                    RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp)
                )
                .alpha(1f)
                .clip(shape = RoundedCornerShape(topStart = 50.dp, topEnd = 50.dp))
                .padding(5.dp)
                .align(Alignment.BottomCenter)
                .height(screenHeight - 120.dp)
                .fillMaxWidth()
        ) {
            LazyColumn {
                cards.forEach {
                    item {
                        it.DisplayCard()
                    }
                }
            }
        }
    }
}