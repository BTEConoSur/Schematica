plugins {
    java
}

group = "com.bteconosur.common"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
    implementation("com.google.code.gson:gson:2.7")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}