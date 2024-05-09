package com.example.wazitoecommerce.navigation

import android.window.SplashScreen
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.wazitoecommerce.ui.theme.screens.dashboard.DashBoardScreen
import com.example.wazitoecommerce.ui.theme.screens.dashboard.InventoryScreen
import com.example.wazitoecommerce.ui.theme.screens.details.DetailsScreen
import com.example.wazitoecommerce.ui.theme.screens.diseases.DiseaseScreen
import com.example.wazitoecommerce.ui.theme.screens.farmsetup.FarmSetupScreen
import com.example.wazitoecommerce.ui.theme.screens.home.HomeScreen
import com.example.wazitoecommerce.ui.theme.screens.login.LoginScreen
import com.example.wazitoecommerce.ui.theme.screens.products.AddProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.products.ViewProductsScreen
import com.example.wazitoecommerce.ui.theme.screens.reports.ReportsScreen
import com.example.wazitoecommerce.ui.theme.screens.signup.SignupScreen
import com.example.wazitoecommerce.ui.theme.screens.splash.SplashScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    navController:NavHostController = rememberNavController(),
    startDestination:String = ROUT_SPLASH
){
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier){
        composable(ROUT_LOGIN){
            LoginScreen(navController = navController)
        }
        composable(ROUT_SIGNUP){
            SignupScreen(navController = navController)
        }
        composable(ROUT_HOME){
            HomeScreen(navController = navController)
        }
        composable(ROUT_ADD_PRODUCTS){
            AddProductsScreen(navController = navController)
        }
        composable(ROUT_VIEW_PRODUCTS){
            ViewProductsScreen(navController = navController)
        }
        composable(ROUT_SPLASH){
           SplashScreen(navController = navController)
        }
        composable( ROUT_DASHBOARD){
       DashBoardScreen(navController = navController)
        }
        composable( ROUT_FARMSETUP){
            FarmSetupScreen(navController = navController)

        }
        composable( ROUT_DISEASE){
            DiseaseScreen(navController = navController)

        }
        composable( ROUT_REPORT){
            ReportsScreen(navController = navController)

        }
        composable( ROUT_INVENTORY){
            InventoryScreen(navController = navController)

        }
        composable( ROUT_DETAILS){
            DetailsScreen(navController = navController)

        }




    }
}


