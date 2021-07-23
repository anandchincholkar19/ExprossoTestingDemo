package com.example.exprossotestingdemo.ui.movies

import org.junit.runner.RunWith
import org.junit.runners.Suite

@RunWith(Suite::class)
@Suite.SuiteClasses (
    DirectorsFragmentTest::class,
    MovieDetailFragmentTest::class,
    StarActorsFragmentTest::class,
    MovieNavigationTest::class
)
class MovieFragmentTestSuite {
}