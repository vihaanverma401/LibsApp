pluginManagement {
    repositories {
        gradlePluginPortal()
        google()
        mavenCentral()
    }
}

plugins {
    id("com.gradle.enterprise") version "3.9"
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        mavenLocal()
//        maven {
//            url = uri("https://maven.pkg.github.com/vihaanverma401/LibsApp")
//            credentials {
//                def props = new Properties()
//                file("local.properties").withInputStream { props.load(it) }
//                username = System.getenv('GITHUB_USER') ?: props.getProperty('GITHUB_USER')
//                password = System.getenv('GITHUB_PERSONAL_ACCESS_TOKEN') ?: props.getProperty('GITHUB_PERSONAL_ACCESS_TOKEN')
//            }
//        }
    }
}

//
//gradleEnterprise {
//    buildScan {
//        termsOfServiceUrl = "https://gradle.com/terms-of-service"
//        termsOfServiceAgree = "yes"
//    }
//}

rootProject.name = "LibsApp"
include(":app")
include(":adsSdk")
include(":utils")
