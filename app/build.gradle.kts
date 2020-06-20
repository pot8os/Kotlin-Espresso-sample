plugins {
  id("com.android.application")
  kotlin("android")
  kotlin("kapt")
}

android {
  compileSdkVersion(29)

  defaultConfig {
    applicationId = "net.pot8os.kotlintestsample"
    minSdkVersion(23)
    targetSdkVersion(29)
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_1_8
    targetCompatibility = JavaVersion.VERSION_1_8
  }

  buildTypes {
    getByName("release") {
      proguardFiles(getDefaultProguardFile("proguard-android.txt"), "proguard-rules.pro")
    }
  }

  sourceSets {
    getByName("main") {
      java.srcDirs("src/main/kotlin")
    }
    getByName("test") {
      java.srcDirs("src/test/kotlin", "src/testShared/kotlin")
    }
    getByName("androidTest") {
      java.srcDirs("src/androidTest/kotlin", "src/testShared/kotlin")
    }
  }

  kotlinOptions {
    jvmTarget = "1.8"
  }

  buildFeatures.dataBinding = true

  packagingOptions {
    exclude("META-INF/proguard/androidx-annotations.pro")
  }

  testOptions {
    // To run Android relevant tests under test dir.
    // See also http://robolectric.org/migrating/#project-configuration
    unitTests.isIncludeAndroidResources = true
  }
}

dependencies {
  kotlin()
  compat()
  fragment()
  layout()
  viewmodel()
  test()
}

repositories {
  google()
  jcenter()
}
