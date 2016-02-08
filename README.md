Kotlin Test Sample
===================================================

[![Build Status](https://travis-ci.org/pot8os/Kotlin-test-sample.svg)](https://travis-ci.org/pot8os/Kotlin-test-sample)

This is a simple project for Android Studio using [Kotlin](https://github.com/JetBrains/kotlin) and [Espresso](https://developer.android.com/intl/ja/tools/testing-support-library/index.html#Espresso). It also includes an unit test case which doesn't require Android UI.

All codes are written in Kotlin.

## You can learn

- How to implement UI tests using Espresso and logic tests using JUnit4
- Fundamental Kotlin language

## Used version

- Kotlin: 1.0.0-beta-3595
- Espresso: 2.2.1 (espresso-core)

## Test target

A (bad) calculator that can be addition only..

<img src="screen.png" width="384">

## Run tests

Note: You have to connect a device as test target in advance. Both of simulator and real are good.

### Use Android Studio

|   |UI Test (use Espresso)|Logic Test (use JUnit4)|
|---|----------------------|-----------------------|
|gradle task|`connectedCheck`<br/><br/>![Run Task](runtask.png)|`testDebugUnitTest`<br/><br/>![Run Unit Test](runjunit.png)|
|corresponded `Test Artifact` in `Build Variants`|`Android Instrumentation Tests`<br/><br/>![Espresso](espresso.png)|`Unit Tests`<br/><br/>![UnitTest](unittest.png)|
|path of test files|`src/androidTest/kotlin`|`src/test/kotlin`|
|prefix of dependencies in `build.gradle`|`androidTestCompile`|`testCompile`|

## License

MIT
