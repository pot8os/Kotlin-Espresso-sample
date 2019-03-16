package net.pot8os.kotlintestsample

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.rule.ActivityTestRule
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import java.text.DecimalFormat

/**
 * The codebase of this class is all the same with [ApplicationTest] other than a line that starts with `@RunWith`.
 * Robolectric 4 supports running AndroidTest code as unit testing. You don't need to run an emulator anymore!
 *
 * @author So Nakamura, 2019-Mar-16
 */
@RunWith(RobolectricTestRunner::class)
class EmulatedApplicationTest {

  @get:Rule
  val activity = ActivityTestRule(MainActivity::class.java)

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
