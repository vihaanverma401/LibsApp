buildscript {
    ext {
//        compose_version = '1.0.1'
        compose_version = '1.1.0-alpha04'
    }
}// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id 'com.android.application' version '7.1.1' apply false
    id 'com.android.library' version '7.1.1' apply false
    id 'org.jetbrains.kotlin.android' version '1.5.30' apply false
}

task clean(type: Delete) {
    delete rootProject.buildDir
}