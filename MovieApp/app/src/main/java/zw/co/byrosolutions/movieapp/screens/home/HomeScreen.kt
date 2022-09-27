package zw.co.byrosolutions.movieapp.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import zw.co.byrosolutions.movieapp.model.Movie
import zw.co.byrosolutions.movieapp.model.getMovies
import zw.co.byrosolutions.movieapp.navigation.MovieScreens
import zw.co.byrosolutions.movieapp.widgets.MovieRow

@Composable
fun HomeScreen(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(
                backgroundColor = Color.LightGray,
                elevation = 5.dp
            ) {
                Text(text = "Movies")
            }
        },
    ) {
        MainContent(navController = navController)
    }
}

@Composable
fun MainContent(
    navController: NavController,
    movieList: List<Movie> = getMovies()
) {
    Surface(color = MaterialTheme.colors.background) {
        Column(modifier = Modifier.padding(12.dp)) {
            LazyColumn(content = {
                items(items = movieList) {
                    MovieRow(movie = it) { movie ->
                        // Log.d("Movie", " : $movie")
                        navController.navigate(route = MovieScreens.DetailsScreen.name + "/$movie")
                    }
                }
            })
        }
    }
}