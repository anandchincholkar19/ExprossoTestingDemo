package com.example

import android.view.View
import android.widget.ImageView
import androidx.test.espresso.matcher.BoundedMatcher
import org.hamcrest.Description
import java.util.regex.Matcher

object ImageViewDrawableMatcher {

    fun hasDrawable() : BoundedMatcher<View, ImageView>{
        return object :BoundedMatcher<View, ImageView>(ImageView::class.java) {
            override fun describeTo(description: Description?) {
                description?.appendText("has drwable")
            }

            override fun matchesSafely(item: ImageView?): Boolean {
                return item?.drawable !=null
            }

        }
    }
}