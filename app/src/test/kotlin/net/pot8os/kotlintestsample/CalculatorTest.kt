package net.pot8os.kotlintestsample

import com.google.common.truth.Truth.assertThat
import org.junit.Test
import java.math.BigDecimal

/**
 * @author So Nakamura, 2015/12/19
 */
class CalculatorTest {

  @Test
  fun figureTest() {
    assertThat(
      MainActivity.Figure.ADD.calc(BigDecimal(100), BigDecimal(200))
    ).isEqualTo(BigDecimal(300))

    assertThat(
      MainActivity.Figure.SUB.calc(BigDecimal(10), BigDecimal(4))
    ).isNotEqualTo(BigDecimal(5))

    assertThat(
      MainActivity.Figure.MULTI.calc(BigDecimal(5), BigDecimal(5))
    ).isEqualTo(BigDecimal(25))

    assertThat(
      MainActivity.Figure.DIV.calc(BigDecimal(10), BigDecimal(3))
    ).isNotEqualTo(BigDecimal(3.33333333))
  }
}