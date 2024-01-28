import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.kotlin() {
  implementation("org.jetbrains.kotlin:kotlin-stdlib:1.9.22")
}

fun DependencyHandlerScope.fragment() {
  val version = "1.6.2"
  implementation("androidx.fragment:fragment-ktx:$version")
  debugImplementation("androidx.fragment:fragment-testing:$version")
  androidTestImplementation("androidx.fragment:fragment-testing:1.6.0")
}

fun DependencyHandlerScope.compat() {
  implementation("androidx.appcompat:appcompat:1.6.1")
}

fun DependencyHandlerScope.layout() {
  implementation("androidx.constraintlayout:constraintlayout:2.1.4")
  implementation("com.google.android.material:material:1.11.0")
}

fun DependencyHandlerScope.viewmodel() {
  implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.7.0")
}

fun DependencyHandlerScope.test() {
  // These dependencies are consumed in both unit tests and instrumented tests.
  debugImplementation("androidx.test.espresso:espresso-core:3.5.1")
  debugImplementation("androidx.test:runner:1.5.2")
  debugImplementation("androidx.test:rules:1.5.0")
  debugImplementation("androidx.test.ext:junit-ktx:1.1.5")
  // Regarding robolectric, only test target is sufficient.
  testImplementation("org.robolectric:robolectric:4.11.1")
}

private const val implementation = "implementation"
private const val debugImplementation = "debugImplementation"
private const val testImplementation = "testImplementation"
private const val androidTestImplementation = "androidTestImplementation"
