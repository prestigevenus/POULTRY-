package com.example.wazitoecommerce.ui.theme.screens.reports


import android.content.Intent
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.MainActivity
import com.example.wazitoecommerce.R
import com.example.wazitoecommerce.navigation.ROUT_DETAILS
import com.example.wazitoecommerce.navigation.ROUT_LOGIN
import com.example.wazitoecommerce.navigation.ROUT_SIGNUP
import com.example.wazitoecommerce.ui.theme.lGreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ReportsScreen(navController:NavHostController) {

    val mContext = LocalContext.current

    Column (modifier = Modifier
        .clickable {navController.navigate(ROUT_DETAILS)}

        .fillMaxSize()
        .verticalScroll(rememberScrollState())) {


        TopAppBar(
            title = { Text(text = "Reports", color = Color.White) },
            colors = TopAppBarDefaults.mediumTopAppBarColors(lGreen),
            navigationIcon = {
                IconButton(onClick = {
                    mContext.startActivity(Intent(mContext, MainActivity::class.java))
                }) {
                    Icon(
                        imageVector = Icons.Default.ArrowBack,
                        contentDescription = "menu", tint = Color.White
                    )
                }

            },
            actions = {
                IconButton(onClick = {
                    val shareIntent = Intent(Intent.ACTION_SEND)
                    shareIntent.type = "text/plain"
                    shareIntent.putExtra(Intent.EXTRA_TEXT, "Check out this is a cool content")
                    mContext.startActivity(Intent.createChooser(shareIntent, "Share"))
                }) {
                    Icon(
                        imageVector = Icons.Default.Notifications,
                        contentDescription = "Notify", tint = Color.White
                    )
                }

            }

        )


        //End of Top App bar


        Spacer(modifier = Modifier.height(20.dp))

        Row( modifier = Modifier.padding(start = 20.dp)) {
            Column {

                Text(text = "")
            }
            Spacer(modifier = Modifier.width(100.dp))

        }//End Row
        Spacer(modifier = Modifier.height(20.dp))


        //cards columns start
        Column(modifier = Modifier.padding(start = 20.dp)) {
            Row {

                //First Card
                val mContext = LocalContext.current
                Card (modifier = Modifier
                    .clickable {
                        navController.navigate(ROUT_LOGIN)

                        Toast
                            .makeText(
                                mContext, "Go to inventory screen",
                                Toast.LENGTH_SHORT
                            )
                            .show()

                    }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.invent),
                            contentDescription = "Inventory",
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.height(780.dp))


                        Text(
                            text = "Inventory",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card


                Card (modifier = Modifier
                    .clickable {
                        mContext.startActivity(
                            Intent(
                                mContext,
                                MainActivity::class.java
                            )
                        )
                    }
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.trans),
                            contentDescription = "Electronics",
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.height(780.dp))

                        Text(
                            text = "Transactions",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 1
            Spacer(modifier = Modifier.height(25.dp))

            //Row 2
            Row {

                //First Card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.crack),
                            contentDescription = "egg",
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.height(780.dp))

                        Text(
                            text = "Egg Reduction",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }
                }
                Spacer(modifier = Modifier.width(30.dp))

                //second card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.hen),
                            contentDescription = "Flock",
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.height(780.dp))

                        Text(
                            text = "Flock Reduction",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
            } // End of Row 2
            Spacer(modifier = Modifier.height(25.dp))

            //Row 3
            Row {

                //First Card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp,)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.feeds),
                            contentDescription = "amazon",
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.height(780.dp))

                        Text(
                            text = "Farmsetup",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )

                    }




                }
                Spacer(modifier = Modifier.width(30.dp))
                //second card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)){



                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.eg),
                            contentDescription = "egg",
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.height(780.dp))

                        Text(
                            text = "Egg Production",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )
                    }
                }
            } // End of Row 3

            Spacer(modifier = Modifier.height(30.dp))

            Row {
                //second card
                Card (modifier = Modifier
                    .size(width = 150.dp, height = 150.dp)
                    .shadow(10.dp)) {


                    Box(
                        modifier = Modifier.fillMaxWidth(),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.aidkit),
                            contentDescription = "health",
                            modifier = Modifier.size(50.dp)
                        )

                        Spacer(modifier = Modifier.height(780.dp))

                        Text(
                            text = "Health",
                            fontSize = 20.sp,
                            textAlign = TextAlign.Center,

                            modifier = Modifier
                                .fillMaxWidth()
                                .align(Alignment.BottomCenter)

                        )
                    }
                }
            }

        }

    }


}


@Preview(showBackground = true)
@Composable
fun ReportsScreenPreview() {
    ReportsScreen(rememberNavController())
}