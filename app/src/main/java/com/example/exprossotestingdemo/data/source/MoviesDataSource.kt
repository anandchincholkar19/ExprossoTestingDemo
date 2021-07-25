package com.example.exprossotestingdemo.data.source

import com.example.exprossotestingdemo.data.Movie

interface MoviesDataSource {
    fun getMovie(movieId: Int): Movie?
}