@Suppress("DSL_SCOPE_VIOLATION") // TODO : Remove this suppression  once the issue is fixed  KTIJ-19369
plugins {
    `kotlin-dsl`
}

group = "com.plcoding.runique.buildlogic"

dependencies {
    compileOnly(libs.android.gradlePlugin)
    compileOnly(libs.android.tools.common)
    compileOnly(libs.kotlin.gradlePlugin)
    compileOnly(libs.ksp.gradlePlugin)
    compileOnly(libs.room.gradlePlugin)
}