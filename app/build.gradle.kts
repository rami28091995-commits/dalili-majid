plugins {
    id 'com.android.application'
}
android {
    namespace 'com.dalili.majid'
    compileSdk 34
    defaultConfig {
        applicationId "com.dalili.majid"
        minSdk 21
        targetSdk 34
        versionCode 1
        versionName "1.0"
    }
    buildTypes {
        debug {
            minifyEnabled false
        }
    }
}
dependencies {
    implementation 'androidx.appcompat:appcompat:1.6.1'
}
