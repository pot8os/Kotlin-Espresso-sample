# Kotlin-Espresso-Sample

[![CircleCI](https://circleci.com/gh/pot8os/Kotlin-Espresso-sample/tree/master.svg?style=svg)](https://circleci.com/gh/pot8os/Kotlin-Espresso-sample/tree/master)

This is MVP project for Android that uses [Kotlin](https://github.com/JetBrains/kotlin) and [Espresso](https://developer.android.com/intl/ja/tools/testing-support-library/index.html#Espresso) together to run instrument tests. Moreover, it has a test code that implements [Robolectric 4](http://robolectric.org/) that **supports running Instrumentation Tests as unit tests**! :tada:

## What you can learn from this project

- How to write `UI tests` using Espresso and `unit tests` using Robolectric :tada:
- Fundamental and practical way how to write Kotlin
- Thanks to RxJava, it gets a calculator by [less than 100 lines](https://github.com/pot8os/Kotlin-Espresso-sample/blob/master/app/src/main/kotlin/net/pot8os/kotlintestsample/MainActivity.kt) :rocket:

## Requirements

- Run with Android Studio 3.5.0 (or newer)

## Target app

No need to explain about usage since you know it well :)

<img src="img/screen.png" width="384">

## Run tests

You have to have a connected device in advance in order to run `UI tests`. It doesn't matter if it's a simulator and a real one.

### Using Android Studio

|   |UI Tests (using Espresso)|Unit Tests (using JUnit4)|
|---|----------------------|-----------------------|
|Gradle task name|`connectedAndroidTest`<br/><br/>![Run Task](img/uitask.png)|`testDebugUnitTest`<br/><br/>![Run Unit Test](img/unittask.png)|
|Location of test code|`src/androidTest/kotlin`<br/>![Path](img/uitest_path.png)|`src/test/kotlin`<br/>![Path](img/unittest_path.png)|
|Prefix of dependencies defined in `build.gradle`|`androidTestCompile`|`testCompile`|

## License

MIT
