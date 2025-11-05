pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
        // The explicit MapLibre + JitPack mirrors
        maven("https://plugins.gradle.org/m2/")
        maven("https://jitpack.io")
        maven("https://repo1.maven.org/maven2/")
        maven("https://maplibre.org/maven")
    }
}

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven("https://repo1.maven.org/maven2/")
        maven("https://maplibre.org/maven")
        maven("https://jitpack.io")
    }
}

rootProject.name = "MyApplication"
include(":app")
