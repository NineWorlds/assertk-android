import org.gradle.api.JavaVersion.VERSION_1_8
import org.jetbrains.kotlin.config.KotlinCompilerVersion.VERSION

plugins {
  id("com.android.library")
  kotlin("android")
}

android {
  compileSdkVersion(29)

  defaultConfig {
    minSdkVersion(15)
    targetSdkVersion(29)
  }

  compileOptions {
    sourceCompatibility = VERSION_1_8
    targetCompatibility = VERSION_1_8
  }

  kotlinOptions {
    jvmTarget = VERSION_1_8.toString()
  }
}

dependencies {

  implementation(kotlin("stdlib-jdk8", VERSION))

  implementation("androidx.annotation:annotation:1.1.0")
  implementation("com.willowtreeapps.assertk:assertk-jvm:0.22")
}