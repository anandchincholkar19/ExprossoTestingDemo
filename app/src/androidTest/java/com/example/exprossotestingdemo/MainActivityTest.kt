package com.example.exprossotestingdemo

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @Test
    fun test_isActivityInView() {
        //launch activity
        val activitySceanario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun test_next_button_visiblity() {
        val activitySceanario = ActivityScenario
            .launch(MainActivity::class.java)
//
//        //method 1
//        onView(withId(R.id.button_next_activity))
//            .check(matches(isDisplayed()))

        //method 2

        onView(withId(R.id.button_next_activity))
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun test_textview_visiblity(){
        val activitySceanario = ActivityScenario
            .launch(MainActivity::class.java)
        onView(withId(R.id.activity_main_title))
            .check(matches(withText(R.string.text_mainactivity)))
    }
    
}