package net.pot8os.kotlintestsample

import android.support.test.espresso.Espresso.onView
import android.support.test.espresso.action.ViewActions.click
import android.support.test.espresso.assertion.ViewAssertions.matches
import android.support.test.espresso.matcher.ViewMatchers.withId
import android.support.test.espresso.matcher.ViewMatchers.withText
import android.support.test.rule.ActivityTestRule
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import java.text.DecimalFormat

/**
 * @author So Nakamura, 2015/12/19
 */
@RunWith(AndroidJUnit4::class)
class ApplicationTest {

    @Rule
    @JvmField
    val activity = ActivityTestRule<MainActivity>(MainActivity::class.java)

    @Test
    fun testAdd() {
        onView(withId(R.id.button_1)).perform(click())
        onView(withId(R.id.button_2)).perform(click())
        onView(withId(R.id.button_3)).perform(click())
        onView(withId(R.id.button_add)).perform(click())
        onView(withId(R.id.button_3)).perform(click())
        onView(withId(R.id.button_2)).perform(click())
        onView(withId(R.id.button_1)).perform(click())
        onView(withId(R.id.button_calc)).perform(click())
        onView(withId(R.id.field))
                .check(matches(withText("${123 + 321}")))
    }

    @Test
    fun testSub() {
        onView(withId(R.id.button_9)).perform(click())
        onView(withId(R.id.button_9)).perform(click())
        onView(withId(R.id.button_9)).perform(click())
        onView(withId(R.id.button_sub)).perform(click())
        onView(withId(R.id.button_3)).perform(click())
        onView(withId(R.id.button_3)).perform(click())
        onView(withId(R.id.button_3)).perform(click())
        onView(withId(R.id.button_calc)).perform(click())
        onView(withId(R.id.field))
                .check(matches(withText("${999 - 333}")))
    }

    @Test
    fun testMulti() {
        onView(withId(R.id.button_1)).perform(click())
        onView(withId(R.id.button_0)).perform(click())
        onView(withId(R.id.button_0)).perform(click())
        onView(withId(R.id.button_multi)).perform(click())
        onView(withId(R.id.button_2)).perform(click())
        onView(withId(R.id.button_0)).perform(click())
        onView(withId(R.id.button_0)).perform(click())
        onView(withId(R.id.button_calc)).perform(click())
        val formatter = DecimalFormat("#,###")
        onView(withId(R.id.field))
                .check(matches(withText(formatter.format(100 * 200))))
    }

    @Test
    fun testDiv() {
        onView(withId(R.id.button_3)).perform(click())
        onView(withId(R.id.button_3)).perform(click())
        onView(withId(R.id.button_3)).perform(click())
        onView(withId(R.id.button_divide)).perform(click())
        onView(withId(R.id.button_1)).perform(click())
        onView(withId(R.id.button_0)).perform(click())
        onView(withId(R.id.button_0)).perform(click())
        onView(withId(R.id.button_calc)).perform(click())
        onView(withId(R.id.field))
                .check(matches(withText("${333 / 100.0}")))
    }
}