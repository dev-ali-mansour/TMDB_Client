package dev.alimansour.tmdbclient.domain.model

/**
 * TMDB Client Android Application developed by: Ali Mansour
 * Copyright © 2020 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- TMDB Client IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
data class MovieList(val movies: List<Movie>) {
    data class Movie(
        val id: Int,
        val overview: String,
        val posterPath: String,
        val releaseDate: String,
        val title: String,
        val popularity: Double
    )
}