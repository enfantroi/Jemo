plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("kotlin-kapt")
    id("kotlin-android")
    id("dagger.hilt.android.plugin")
}

android {
    namespace = "com.example.wmad"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.wmad"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildFeatures {
        //dataBinding = true
       viewBinding = true
    }
    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    implementation(libs.androidx.legacy.support.v4)
    implementation(libs.androidx.fragment.ktx)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //hilt dependencies
    implementation(libs.hilt.android)
    kapt(libs.hilt.compiler)

    //retrofit
    implementation(libs.retrofit)
    // gson converter
    implementation(libs.converter.gson)
    //loging interceptor
    implementation ("com.squareup.okhttp3:logging-interceptor:4.12.0")
    //progress bar
    implementation(libs.kprogresshud)
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    implementation(libs.koin.android)

    implementation(libs.androidx.lifecycle.livedata.ktx) // LiveData
    implementation(libs.androidx.databinding.runtime) // databinding
    implementation (libs.ssp.android)
    implementation (libs.sdp.android)
    implementation ("com.robertlevonyan.view:CustomFloatingActionButton:3.1.5")
    implementation ("com.squareup.retrofit2:converter-scalars:2.9.0")
    implementation ("androidx.room:room-runtime:2.6.1")
    kapt ("androidx.room:room-compiler:2.6.1")

    implementation ("com.google.android.gms:play-services-location:21.3.0")
    // Room coroutine support
    implementation ("androidx.room:room-ktx:2.6.1")
    implementation ("org.jetbrains.kotlinx:kotlinx-coroutines-android:1.7.3")
    implementation ("com.github.dhaval2404:imagepicker:2.1")
    implementation ("de.hdodenhof:circleimageview:3.1.0")
    implementation ("com.github.dhaval2404:imagepicker:2.1")
}