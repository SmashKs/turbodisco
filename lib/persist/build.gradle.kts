plugins {
    id("com.google.devtools.ksp")
}

android {
    namespace = "taiwan.no1.persist"
}

dependencies {
    implementation(libs.kotlinx.datetime)

    implementation(libs.kotlinx.serialization.json)

    implementation(libs.room.runtime)
    ksp(libs.room.compiler)

    testImplementation(libs.junit.junit)

    androidTestImplementation(libs.androidx.test.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
