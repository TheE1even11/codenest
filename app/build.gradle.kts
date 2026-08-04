plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.theeleven11.codenest"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.theeleven11.codenest"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "0.1.0"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
        isCoreLibraryDesugaringEnabled = true
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    implementation("androidx.core:core-ktx:1.13.1")
    implementation("androidx.appcompat:appcompat:1.7.0")
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")

    // Sora Editor - Kod editörü kütüphanesi
    implementation("io.github.Rosemoe.sora-editor:editor:0.23.3")
    implementation("io.github.Rosemoe.sora-editor:language-textmate:0.23.3")

    // Core library desugaring için gerekli
    coreLibraryDesugaring("com.android.tools:desugar_jdk_libs:2.0.4")
}
