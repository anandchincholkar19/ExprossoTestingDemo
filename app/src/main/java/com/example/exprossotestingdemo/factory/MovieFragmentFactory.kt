package com.example.exprossotestingdemo.factory

import androidx.fragment.app.FragmentFactory
import com.example.exprossotestingdemo.ui.movies.DirectorsFragment
import com.example.exprossotestingdemo.ui.movies.MovieDetailFragment
import com.example.exprossotestingdemo.ui.movies.StarActorsFragment

class MovieFragmentFactory  : FragmentFactory(){

    private val TAG: String = "AppDebug"

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when(className){

            MovieDetailFragment::class.java.name -> {
                MovieDetailFragment()
            }

            DirectorsFragment::class.java.name -> {
                DirectorsFragment()
            }

            StarActorsFragment::class.java.name -> {
                StarActorsFragment()
            }

            else -> {
                super.instantiate(classLoader, className)
            }
        }
}
