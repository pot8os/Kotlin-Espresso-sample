Kotlin-Espresso-Sample
===================================================

[![Build Status](https://travis-ci.org/pot8os/Kotlin-Espresso-sample.svg)](https://travis-ci.org/pot8os/Kotlin-Espresso-sample)

This is a simple project for Android Studio using [Kotlin](https://github.com/JetBrains/kotlin) and [Espresso](https://developer.android.com/intl/ja/tools/testing-support-library/index.html#Espresso). It also includes typical unit tests using JUnit4.

All codes are written in Kotlin.

## You can learn from this repo:

- How to implement `UI tests` using Espresso and `logic tests (without UI)` using JUnit4
- Fundamental Kotlin language

## Used version

- Kotlin: 1.0.6
- Espresso: 2.2.2 (espresso-core)

## An app as a test target

A simple calculator

<img src="img/screen.png" width="384">

## Do tests

Note: You should have a connected device in advance before running `UI tests`. It doesn't matter if it's a simulator and a real one.

### Using Android Studio

|   |UI Tests (using Espresso)|Logic Tests (using JUnit4)|
|---|----------------------|-----------------------|
|gradle task name|`connectedAndroidTest`<br/><br/>![Run Task](img/uitask.png)|`testDebugUnitTest`<br/><br/>![Run Unit Test](img/unittask.png)|
|root path of test files|`src/androidTest/kotlin`<br/>![Path](img/uitest_path.png)|`src/test/kotlin`<br/>![Path](img/unittest_path.png)|
|prefix of dependencies defined in `build.gradle`|`androidTestCompile`|`testCompile`|

## License

MIT
