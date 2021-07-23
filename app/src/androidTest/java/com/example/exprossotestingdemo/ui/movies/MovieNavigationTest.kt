package com.example.exprossotestingdemo.ui.movies

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.exprossotestingdemo.R
import kotlinx.android.synthetic.main.fragment_movie_detail.view.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MovieNavigationTest {

    @Test
    fun testMovieFragmentNavigation() {

        //SETUP
        val activitySceanrio = ActivityScenario.launch(MainActivity::class.java)

        //nav to director fragment
        onView(withId(R.id.movie_directiors)).perform(click())

        // verify
        onView(withId(R.id.movie_directior_parent)).check(matches(isDisplayed()))

        pressBack()

        // verify
        onView(withId(R.id.fragment_movie_Detail_parent)).check(matches(isDisplayed()))

        //nav to star actors frgament
        onView(withId(R.id.movie_star_actors)).perform(click())

        //verify
        onView(withId(R.id.fragement_start_actor_parent)).check(matches(isDisplayed()))


    }
}