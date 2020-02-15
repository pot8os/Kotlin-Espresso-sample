package net.pot8os.kotlintestsample

import android.os.Build
import androidx.test.ext.junit.runners.AndroidJUnit4
import net.pot8s.kotlintestsample.CalculatorSpec
import org.junit.runner.RunWith
import org.robolectric.annotation.Config

/**
 * @author So Nakamura, 2020-Feb-15
 */
@RunWith(AndroidJUnit4::class)
@Config(
  sdk = [Build.VERSION_CODES.P]
)
class RobolectricCalculatorTest : CalculatorSpec()
