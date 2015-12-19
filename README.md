Kotlin Test Sample
===================================================

This is very simple project for Android App using [Kotlin](https://github.com/JetBrains/kotlin) and [Espresso](https://developer.android.com/intl/ja/tools/testing-support-library/index.html#Espresso). It also includes an unit test case which doesn't require Android UI.

All codes are written in Kotlin.

## You can see...

- how to implement UI tests using Espresso and logic tests using JUnit4
- fundamental of Kotlin language

## version

- Kotlin: 1.0.0-beta-3595
- Espresso: 2.2.1 (espresso-core)

## Test target

A calculator that can be addition only..

<img src="screen.png" width="384">

## Usage

### Use Android Studio

|   |UI Test (use Espresso)|Logic Test (use JUnit4)|
|---|----------------------|-----------------------|
|1. Set Test Artifact in Build Variants|Set `Android Instrumentation Tests`<br/><br/>![Espresso](espresso.png)|Set `Unit Tests`<br/><br/>![UnitTest](unittest.png)|
|2. Do tests|Run task `connectedCheck`<br/><br/>![Run Task](runtask.png)|Open project tree and right click at `CalculatorTest` and select `Run "CalculatorTest"`<br/><br/>![Run Unit Test](runjunit.png)|
||||
|target path|`src/androidTest/kotlin`|`src/test/kotlin`|
|dependencies|`androidTestCompile`|`testCompile`|

## License

MIT