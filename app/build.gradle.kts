plugins {
  id("com.android.application")
  kotlin("android")
  id("com.google.devtools.ksp") version "1.9.22-1.0.17" apply false
}

android {
  namespace = "net.pot8os.kotlintestsample"
  compileSdk = 34

  defaultConfig {
    applicationId = "net.pot8os.kotlintestsample"
    minSdk = 23
    targetSdk = 34
    versionCode = 1
    versionName = "1.0"
    testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
  }

  compileOptions {
    sourceCompatibility = JavaVersion.VERSION_17
    targetCompatibility = JavaVersion.VERSION_17
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
    jvmTarget = "17"
  }

  buildFeatures.dataBinding = true
  packaging {
    resources {
      excludes += setOf("META-INF/proguard/androidx-annotations.pro")
    }
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
  mavenCentral()
}
