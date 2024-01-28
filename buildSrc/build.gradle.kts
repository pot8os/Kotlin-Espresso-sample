plugins {
  `kotlin-dsl`
}

allprojects {
  repositories {
    google()
    mavenCentral()
  }
}

dependencies {
  implementation("com.android.tools.build:gradle:8.2.2")
  implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.9.22")
}
