package net.pot8s.kotlintestsample

import androidx.fragment.app.testing.launchFragmentInContainer
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import net.pot8os.kotlintestsample.CalculatorFragment
import net.pot8os.kotlintestsample.R
import org.junit.Test
import java.text.DecimalFormat

/**
 * @author So Nakamura, 2020-Feb-15
 */
abstract class CalculatorSpec {

  @Test
  fun testSum() {
    launchFragmentInContainer<CalculatorFragment>()
    onView(withId(R.id.button_1)).perform(click())
    onView(withId(R.id.button_2)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_sum)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_2)).perform(click())
    onView(withId(R.id.button_1)).perform(click())
    onView(withId(R.id.button_calc)).perform(click())
    onView(withId(R.id.field)).check(matches(withText("${123 + 321}")))
  }

  @Test
  fun testSub() {
    launchFragmentInContainer<CalculatorFragment>()
    onView(withId(R.id.button_9)).perform(click())
    onView(withId(R.id.button_9)).perform(click())
    onView(withId(R.id.button_9)).perform(click())
    onView(withId(R.id.button_sub)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_calc)).perform(click())
    onView(withId(R.id.field)).check(matches(withText("${999 - 333}")))
  }

  @Test
  fun testMul() {
    launchFragmentInContainer<CalculatorFragment>()
    onView(withId(R.id.button_1)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_mul)).perform(click())
    onView(withId(R.id.button_2)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_calc)).perform(click())
    val formatter = DecimalFormat("#,###")
    onView(withId(R.id.field)).check(matches(withText(formatter.format(100 * 200))))
  }

  @Test
  fun testDiv() {
    launchFragmentInContainer<CalculatorFragment>()
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_3)).perform(click())
    onView(withId(R.id.button_div)).perform(click())
    onView(withId(R.id.button_1)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_0)).perform(click())
    onView(withId(R.id.button_calc)).perform(click())
    onView(withId(R.id.field)).check(matches(withText("${333 / 100.0}")))
  }
}
