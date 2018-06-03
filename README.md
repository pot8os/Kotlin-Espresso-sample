Kotlin-Espresso-Sample
===================================================

[![CircleCI](https://circleci.com/gh/pot8os/Kotlin-Espresso-sample/tree/master.svg?style=svg)](https://circleci.com/gh/pot8os/Kotlin-Espresso-sample/tree/master)

It's an example project for Android Studio using [Kotlin](https://github.com/JetBrains/kotlin) and [Espresso](https://developer.android.com/intl/ja/tools/testing-support-library/index.html#Espresso) to run UI tests. It also includes typical unit tests using JUnit4.
All codes are written in Kotlin :tada:

## What you can learn from this repo

- How to implement `UI tests` using Espresso and `unit tests (without UI)` using JUnit4
- Fundamental Kotlin language and basic usage
- Thanks to RxJava, we can implement a calculator by [less than 100 lines](https://github.com/pot8os/Kotlin-Espresso-sample/blob/master/app/src/main/kotlin/net/pot8os/kotlintestsample/MainActivity.kt)! :rocket:

## Requirements

- Run with Android Studio 3.1.2 (or newer)

## The test target app

Very simple calculator :)

<img src="img/screen.png" width="384">

## Do tests

Note: You should have a connected device in advance before running `UI tests`. It doesn't matter if it's a simulator and a real one.

### Using Android Studio

|   |UI Tests (using Espresso)|Unit Tests (using JUnit4)|
|---|----------------------|-----------------------|
|gradle task name|`connectedAndroidTest`<br/><br/>![Run Task](img/uitask.png)|`testDebugUnitTest`<br/><br/>![Run Unit Test](img/unittask.png)|
|root path of test files|`src/androidTest/kotlin`<br/>![Path](img/uitest_path.png)|`src/test/kotlin`<br/>![Path](img/unittest_path.png)|
|prefix of dependencies defined in `build.gradle`|`androidTestCompile`|`testCompile`|

## License

MIT
