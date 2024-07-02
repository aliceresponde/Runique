plugins {
    alias(libs.plugins.runique.android.library.compose)
}

android {
    namespace = "com.plcoding.core.presentation.ui"
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.compose.ui)
    implementation(libs.androidx.compose.ui.graphics)
    implementation(libs.androidx.compose.ui.tooling.preview)
    implementation(libs.androidx.compose.material3) // expose to other modules

    implementation(projects.core.domain)
    implementation(projects.core.presentation.designsystem)
}