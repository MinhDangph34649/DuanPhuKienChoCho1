plugins {
    alias(libs.plugins.androidApplication)
}

android {
    namespace = "com.example.duancho"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.duancho"
        minSdk = 26
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
        dataBinding = true
    }
}

dependencies {
    // Thư viện Picasso cho việc tải và hiển thị hình ảnh từ Internet
    implementation("com.squareup.picasso:picasso:2.71828")


    // Các thư viện cơ bản cho ứng dụng Android
    implementation(libs.appcompat)
    implementation(libs.material)
    implementation(libs.activity)
    implementation(libs.constraintlayout)

    // Thư viện cho testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.ext.junit)
    androidTestImplementation(libs.espresso.core)
}
