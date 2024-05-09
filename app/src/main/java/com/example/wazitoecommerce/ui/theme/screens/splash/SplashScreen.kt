package com.example.wazitoecommerce.ui.theme.screens.splash



import android.annotation.SuppressLint
import android.widget.ResourceCursorTreeAdapter
import android.window.SplashScreenView
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ROUT_LOGIN

import com.example.wazitoecommerce.ui.theme.WazitoECommerceTheme
import com.example.wazitoecommerce.ui.theme.brown
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun SplashScreen(navController:NavHostController) {
    Column(modifier = Modifier
        .clickable {navController.navigate(ROUT_LOGIN)}
        .fillMaxSize()
        .background(brown)
        .paint(painterResource(id = R.drawable.img)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val coroutine = rememberCoroutineScope()
        coroutine.launch {
            delay(1000)
            navController.navigate(ROUT_LOGIN)
        }

        Text(text = "Poultry Management")

        val mContext = LocalContext.current

       Image(painter = painterResource(id = R.drawable.img_1) ,
           contentDescription = "",
           modifier = Modifier.size(1000.dp))
        
        
        


    }
}


@Composable
@Preview(showBackground = true)
fun SplashScreenPreview(){
    WazitoECommerceTheme {
        SplashScreen(navController = rememberNavController())
    }
}