package com.example.exprossotestingdemo

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.exprossotestingdemo.ui.movies.MainActivity
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

//    @Test
//    fun test_next_button_visiblity() {
//        val activitySceanario = ActivityScenario
//            .launch(MainActivity::class.java)
////
////        //method 1
////        onView(withId(R.id.button_next_activity))
////            .check(matches(isDisplayed()))
//
//        //method 2
//
//        onView(withId(R.id.button_next_activity))
//            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
//    }
//
//    @Test
//    fun test_textview_visiblity(){
//        val activitySceanario = ActivityScenario
//            .launch(MainActivity::class.java)
//        onView(withId(R.id.activity_main_title))
//            .check(matches(withText(R.string.text_mainactivity)))
//    }
//
//    @Test
//    fun test_navSecondaryActivity() {
//       val activitySceanario = ActivityScenario
//            .launch(MainActivity::class.java)
//        onView(withId(R.id.button_next_activity)).perform(click())
//        onView((withId(R.id.secondary))).check(matches(isDisplayed()))
//    }
//
////    @Test
////    fun test_navToMainActiivty() {
//
//        /* method 1 */
////        val activitySceanario = ActivityScenario
////            .launch(MainActivity::class.java)
////        onView(withId(R.id.button_next_activity)).perform(click())
////        onView((withId(R.id.secondary))).check(matches(isDisplayed()))
////        onView(withId(R.id.button_back)).perform(click())
////        onView(withId(R.id.main)).check(matches(isDisplayed()))
////    }
//
//    @Test
//    fun test_navToMainActiivty() {
//        /* method 2 */
//        val activitySceanario = ActivityScenario
//            .launch(MainActivity::class.java)
//        onView(withId(R.id.button_next_activity)).perform(click())
//        onView((withId(R.id.secondary))).check(matches(isDisplayed()))
//        pressBack()
//        onView(withId(R.id.main)).check(matches(isDisplayed()))
//    }
}