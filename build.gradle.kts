plugins {
    kotlin("multiplatform") version "1.7.0"
}

group = "net.ormr"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

kotlin {
    mingwX64 {
        binaries {
            executable {
                entryPoint = "main"
            }
        }
    }

    sourceSets {
        val mingwX64Main by getting {
            dependencies {
                implementation("com.github.ajalt.clikt:clikt:3.5.0")
            }
        }
    }
}
