package com.example.extremesport.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.extremesport.R

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun OmOssScreen() {
    val snackbarHostState = remember { SnackbarHostState() }
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp

    Scaffold(
        snackbarHost = { SnackbarHost(snackbarHostState) },
    ) {
        Box(
            modifier = Modifier.fillMaxSize()
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
                        .offset(x = (-17).dp),
                )
                Text(
                    text = "Om oss",
                    fontSize = 30.sp,
                    color = Color.White,
                    modifier = Modifier
                            .offset(y = (-30).dp)
                )
            }
            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(screenHeight-150.dp)
                    .padding(20.dp)
                    .offset(y = 100.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painterResource(id = R.drawable.ifibygg),
                        contentDescription = "Bilde av hele ifi bygget",
                    )
                    Text(
                        text = "(Bilde over institutt for informatikk)",
                        fontSize = 15.sp
                    )
                    Spacer(modifier = Modifier.padding(15.dp))
                   Text(
                       text = "Vi er utviklerene av applikasjonen JumpTime, og kommer fra en bakgrunn innen informatikk fra UiO. Denne applikasjonen er vårt IN2000 prosjekt."
                   )
                }
            }
        }
    }
}