plugins {
    alias(libs.plugins.compose.compiler)
}

android {
    namespace = "taiwan.no.one.sake"
}

dependencies {
    implementation(libs.core.ktx)
    testImplementation(libs.junit.junit)
    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
