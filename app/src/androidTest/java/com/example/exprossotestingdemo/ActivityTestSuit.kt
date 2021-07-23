package com.example.exprossotestingdemo

import com.example.exprossotestingdemo.ui.movies.MovieDetailFragment
import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses (
    MainActivityTest::class,
    SecondaryActivityTest::class,
    MovieDetailFragment::class
)
class ActivityTestSuit