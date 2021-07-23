package com.example

import android.app.Activity
import android.app.Instrumentation
import android.content.Intent
import android.graphics.BitmapFactory
import android.os.Bundle
import android.provider.MediaStore
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.Intents.intending
import androidx.test.espresso.intent.matcher.IntentMatchers.hasAction
import androidx.test.espresso.intent.rule.IntentsTestRule
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.internal.runner.junit4.AndroidJUnit4ClassRunner
import com.example.exprossotestingdemo.KEY_IMAGE_DATA
import com.example.exprossotestingdemo.MainActivity
import com.example.exprossotestingdemo.R
import org.hamcrest.Matcher
import org.hamcrest.Matchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4ClassRunner::class)
class MainActivityTest{

    @get: Rule
    val intentTestrule = IntentsTestRule(MainActivity::class.java)

    @Test
    fun test_cameraIntent_isBitmapSetToImageView() {
        // GIVEN
        val activityResule = createImageActiivtyResultStub()
        val expectedIntent :Matcher<Intent> = hasAction(MediaStore.ACTION_IMAGE_CAPTURE)
        intending(expectedIntent).respondWith(activityResule)

        // Execute and verify
        onView(withId(R.id.imageView)).check(matches(not(ImageViewDrawableMatcher.hasDrawable())))
        onView(withId(R.id.button)).perform(click())
        intending(expectedIntent)
        onView(withId(R.id.imageView)).check(matches(ImageViewDrawableMatcher.hasDrawable()))
    }

    private fun createImageActiivtyResultStub(): Instrumentation.ActivityResult {
        val bundle = Bundle()
        bundle.putParcelable(
            KEY_IMAGE_DATA,
            BitmapFactory.decodeResource(
                intentTestrule.activity.resources,
                R.drawable.ic_launcher_background
            )
        )

        val resultData = Intent()
        resultData.putExtras(bundle)
        return Instrumentation.ActivityResult(Activity.RESULT_OK, resultData)
    }

}