/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details take a look at the 'Building Java & JVM projects' chapter in the Gradle
 * User Manual available at https://docs.gradle.org/7.5.1/userguide/building_java_projects.html
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:31.0.1-jre")
    implementation("io.javalin:javalin:5.3.2")
    implementation("com.fasterxml.jackson.core:jackson-databind:2.14.0")
    implementation("org.slf4j:slf4j-simple:2.0.3")
}

application {
    // Define the main class for the application.
    mainClass.set("givemesomerest.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}
