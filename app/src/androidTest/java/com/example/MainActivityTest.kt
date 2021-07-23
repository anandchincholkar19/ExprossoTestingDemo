package com.example

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.typeText
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.exprossotestingdemo.MainActivity
import com.example.exprossotestingdemo.R
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @Test
    fun test_showDialog() {

        //GIVEN
        val activityScenario =  ActivityScenario.launch(MainActivity::class.java)
        val Expeted_NAME = "Anand"

        //Execute and verify
        onView(withId(R.id.button)).perform(click())

        onView(withText(R.string.txt_name)).check(matches(isDisplayed()))

        onView(withText(R.string.text_ok)).perform(click())

        onView(withText(R.string.txt_name)).check(matches(isDisplayed()))

        // enter same input
        onView(withId(R.id.md_input_message)).perform(typeText(Expeted_NAME))

        onView(withText(R.string.text_ok)).perform(click())

        //make sure dialog is gone

        onView(withText(R.string.txt_name)).check(doesNotExist())

        onView(withId(R.id.textView)).check(matches(withText(Expeted_NAME)))
    }


}