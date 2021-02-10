plugins {
    kotlin("multiplatform")
}

group = "ru.otus"
version = "1.0"

repositories {
    mavenCentral()
}

kotlin {
    /* Targets configuration omitted. 
    *  To find out how to configure the targets, please follow the link:
    *  https://kotlinlang.org/docs/reference/building-mpp-with-gradle.html#setting-up-targets */
    jvm {
        withJava()
    }

    mingwX64 {

    }

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
            }
        }
        val commonTest by getting {
            dependencies {
                implementation(kotlin("test-common"))
                implementation(kotlin("test-annotations-common"))
                implementation("io.kotest:kotest-assertions-core:4.4.0")
                implementation("io.kotest:kotest-property:4.4.0")
            }
        }

        val jvmMain by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val jvmTest by getting {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        val mingwX64Main by getting {
            dependencies {
                implementation(kotlin("stdlib"))
            }
        }
        val mingwX64Test by getting {
            dependencies {
                implementation(kotlin("test"))
            }
        }

    }
}