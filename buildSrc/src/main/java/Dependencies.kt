object AndroidDependencies {
    // Android - Main
    const val coreLib = "androidx.core:core-ktx:${Versions.coreVersion}"
    const val appcompatLib = "androidx.appcompat:appcompat:${Versions.appcompatVersion}"
    const val coroutinesLib =
        "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Versions.coroutinesVersion}"
    const val lifecycleKtxLib =
        "androidx.lifecycle:lifecycle-runtime-ktx:${Versions.lifecycleVersion}"

    // UI
    const val materialLib = "com.google.android.material:material:${Versions.materialVersion}"
    const val constraintLib =
        "androidx.constraintlayout:constraintlayout:${Versions.constraintVersion}"

    // Navigation
    const val navFragmentLib = "androidx.navigation:navigation-fragment-ktx:${Versions.navVersion}"
    const val navUiLib = "androidx.navigation:navigation-ui-ktx:${Versions.navVersion}"
}

object HiltDependencies {
    const val hiltAndroidLib = "com.google.dagger:hilt-android:${Versions.hiltVersion}"
    const val hiltCompilerLib = "com.google.dagger:hilt-compiler:${Versions.hiltVersion}"
}

object GlideDependencies {
    const val glideLib = "com.github.bumptech.glide:glide:${Versions.glideVersion}"
    const val glideCompLib = "com.github.bumptech.glide:compiler:${Versions.glideVersion}"
}