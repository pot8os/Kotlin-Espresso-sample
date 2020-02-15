package net.pot8os.kotlintestsample

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.lang.IllegalArgumentException
import java.math.BigDecimal
import java.text.DecimalFormat
import java.util.*

/**
 * @author So Nakamura, 2020-Feb-15
 */
class CalculatorViewModel : ViewModel() {

  data class State(
    val current: BigDecimal = BigDecimal.ZERO,
    val memory: Stack<BigDecimal> = Stack(),
    val figure: Figure = Figure.NONE
  )

  private val formatter =
    DecimalFormat(FORMAT).apply {
      minimumFractionDigits = 0
      maximumFractionDigits = 8
    }

  private var state = State()
    set(value) {
      field = value
      _displayValue.value = formatter.format(value.current)
    }

  private val _displayValue = MutableLiveData<String>()
  val displayValue: LiveData<String>
    get() = _displayValue

  init {
    state = state.copy()
  }

  fun onClickedDigit(key: Int) {
    state = state.copy(
      current = MAX.min(state.current.multiply(10.toBigDecimal()).plus(key.toBigDecimal()))
    )
  }

  fun onClickedAllClear() {
    state = state.copy(
      current = BigDecimal.ZERO,
      memory = Stack(),
      figure = Figure.NONE
    )
  }

  fun onClickedEqual() {
    state = if (!state.memory.isEmpty()) {
      state.copy(
        current = state.figure.calc(state.memory.pop(), state.current),
        figure = Figure.NONE
      )
    } else {
      state.copy(
        figure = Figure.NONE
      )
    }
  }

  fun onClickedSign(char: Char) {
    val figure = when (char) {
      '+' -> Figure.SUM
      '-' -> Figure.SUB
      '*' -> Figure.MUL
      '/' -> Figure.DIV
      else -> throw IllegalArgumentException(char.toString())
    }
    state = if (!state.memory.isEmpty()) {
      state.copy(
        current = BigDecimal.ZERO,
        memory = state.figure.calc(state.memory.pop(), state.current).let { state.memory },
        figure = figure
      )
    } else {
      state.copy(
        current = BigDecimal.ZERO,
        memory = state.memory.push(state.current).let { state.memory },
        figure = figure
      )
    }
  }

  companion object {
    private const val FORMAT = "#,###.#"
    private val MAX = BigDecimal(999_999_999_999)
  }
}
