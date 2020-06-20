import org.gradle.kotlin.dsl.DependencyHandlerScope

fun DependencyHandlerScope.kotlin() {
  implementation("org.jetbrains.kotlin:kotlin-stdlib:1.3.72")
}

fun DependencyHandlerScope.fragment() {
  val version = "1.2.5"
  implementation("androidx.fragment:fragment-ktx:$version")
  debugImplementation("androidx.fragment:fragment-testing:$version")
}

fun DependencyHandlerScope.compat() {
  implementation("androidx.appcompat:appcompat:1.1.0")
}

fun DependencyHandlerScope.layout() {
  implementation("androidx.constraintlayout:constraintlayout:1.1.3")
  implementation("com.google.android.material:material:1.1.0")
}

fun DependencyHandlerScope.viewmodel() {
  implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.2.0")
}

fun DependencyHandlerScope.test() {
  // These dependencies are consumed in both unit tests and instrumented tests.
  debugImplementation("androidx.test.espresso:espresso-core:3.2.0")
  debugImplementation("androidx.test:runner:1.2.0")
  debugImplementation("androidx.test:rules:1.2.0")
  debugImplementation("androidx.test.ext:junit-ktx:1.1.1")
  // Regarding robolectric, only test target is sufficient.
  testImplementation("org.robolectric:robolectric:4.3.1")
}

private const val implementation = "implementation"
private const val debugImplementation = "debugImplementation"
private const val testImplementation = "testImplementation"
