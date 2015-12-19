package net.pot8os.kotlintestsample

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.action.ViewActions.typeText
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.*
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.hamcrest.Matchers.startsWith
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * @author So Nakamura, 2015/12/19
 */
@RunWith(AndroidJUnit4::class)
class ApplicationTest {

    @Rule @JvmField
    public val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun basicTest() {
        onView(withId(R.id.calcButton)).perform(click())
        onView(withText(startsWith("Invalid"))).check(matches(isDisplayed()))
        onView(withId(android.R.id.button1)).perform(click())
        onView(withId(R.id.arg1)).perform(typeText("12345"))
        onView(withId(R.id.arg2)).perform(typeText("54321"))
        onView(withId(R.id.calcButton)).perform(click())
        onView(withId(R.id.answer)).check(matches(withText("66666")))
    }
}