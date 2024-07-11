plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.darazinternassignment2"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.darazinternassignment2"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.constraintlayout)
    implementation(libs.lifecycle.livedata.ktx)
    implementation(libs.lifecycle.viewmodel.ktx)
    implementation(libs.navigation.fragment)
    implementation(libs.navigation.ui)
    implementation(libs.activity)
    testImplementation(libs.junit)
    implementation("androidx.navigation:navigation-fragment:2.7.6")
    implementation("androidx.navigation:navigation-ui:2.7.6")
    //glide
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    annotationProcessor ("com.github.bumptech.glide:compiler:4.16.0")
    implementation("androidx.cardview:cardview:1.0.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
    //circle kre dhekanor jnno object ke
    //circle imageview
    implementation ("de.hdodenhof:circleimageview:2.2.0")
    //------for gif
    implementation ("pl.droidsonroids.gif:android-gif-drawable:1.2.15")

    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}