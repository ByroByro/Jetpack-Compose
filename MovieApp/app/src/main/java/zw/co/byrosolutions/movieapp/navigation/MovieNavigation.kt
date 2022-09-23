package zw.co.byrosolutions.movieapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import zw.co.byrosolutions.movieapp.screens.details.DetailsScreen
import zw.co.byrosolutions.movieapp.screens.home.HomeScreen

@Composable
fun MovieNavigation() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = MovieScreens.HomeScreen.name
    ) {
        composable(MovieScreens.HomeScreen.name) {
            // here we pass where this lead us to
            HomeScreen(navController)
        }

        composable(
            MovieScreens.DetailsScreen.name + "/{movie}",
            arguments = listOf(navArgument(name = "movie") {
                type =
                    NavType.StringType
            })
        ) { backStackEntry ->
            // here we pass where this lead us to
            DetailsScreen(navController, backStackEntry.arguments?.getString("movie"))
        }
    }
}