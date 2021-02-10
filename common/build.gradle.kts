plugins {
    kotlin("jvm")
}

group = "ru.otus"
version = "1.0"

repositories {
    mavenCentral()
}
tasks.withType<Test> {
    useJUnitPlatform()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation("io.kotest:kotest-runner-junit5:4.4.0")
}
