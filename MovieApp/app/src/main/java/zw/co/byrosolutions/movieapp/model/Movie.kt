package zw.co.byrosolutions.movieapp.model

data class Movie(
    val id: String,
    val title: String,
    val year: String,
    val genre: String,
    val director: String,
    val actors: String,
    val plot: String,
    val poster: String,
    val images: List<String>,
    val rating: String
)

fun getMovies(): List<Movie> {
    return listOf(
        Movie(
            "0",
            "Title 1",
            "2022",
            "action",
            "byron",
            "actor 1,actor 2",
            "this is a plot",
            "https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg",
            listOf("https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg,url2"),
            "7.3"
        ),
        Movie(
            "0",
            "Title 1",
            "2022",
            "action",
            "byron",
            "actor 1,actor 2",
            "this is a plot",
            "https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg",
            listOf("https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg,url2"),
            "7.3"
        ),
        Movie(
            "0",
            "Title 1",
            "2022",
            "action",
            "byron",
            "actor 1,actor 2",
            "this is a plot",
            "https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg",
            listOf("https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg,url2"),
            "7.3"
        ),
        Movie(
            "0",
            "Title 1",
            "2022",
            "action",
            "byron",
            "actor 1,actor 2",
            "this is a plot",
            "https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg",
            listOf("https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg,url2"),
            "7.3"
        ),
        Movie(
            "0",
            "Title 1",
            "2022",
            "action",
            "byron",
            "actor 1,actor 2",
            "this is a plot",
            "https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg",
            listOf("https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg,url2"),
            "7.3"
        ),
        Movie(
            "0",
            "Title 1",
            "2022",
            "action",
            "byron",
            "actor 1,actor 2",
            "this is a plot",
            "https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg",
            listOf("https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg,url2"),
            "7.3"
        ),
        Movie(
            "0",
            "Title 1",
            "2022",
            "action",
            "byron",
            "actor 1,actor 2",
            "this is a plot",
            "https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg",
            listOf("https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg,url2"),
            "7.3"
        ),
        Movie(
            "0",
            "Title 1",
            "2022",
            "action",
            "byron",
            "actor 1,actor 2",
            "this is a plot",
            "https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg",
            listOf("https://cdn.digitbin.com/wp-content/uploads/Top-best-Android-Apps-to-watch-and-stream-free-movies-online.jpg,url2"),
            "7.3"
        )
    )
}
