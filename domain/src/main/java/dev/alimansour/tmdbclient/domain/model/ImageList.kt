package dev.alimansour.tmdbclient.domain.model

/**
 * TMDB Client Android Application developed by: Ali Mansour
 * Copyright © 2020 Ali Mansour. All Rights Reserved.
 * This file may not be redistributed in whole or significant part.
 * ----------------- TMDB Client IS FREE SOFTWARE ------------------
 * https://www.alimansour.dev   |   dev.ali.mansour@gmail.com
 */
data class ImageList(var images: List<Image>, var id: Int) {
    data class Image(
        var width: Int,
        var height: Int,
        var voteCount: Int,
        var voteAverage: Double,
        var filePath: String,
        var aspectRatio: Double
    )
}