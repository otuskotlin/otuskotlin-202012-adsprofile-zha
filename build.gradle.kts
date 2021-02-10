plugins {
    kotlin("jvm") version "1.4.30"
}

group = "ru.otus"
version = "1.0"

repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.4.2")
}

