plugins {
    id("java")
    `maven-publish` // Add this line to apply the maven-publish plugin
}

group = "com.github.Jigar-23"
version = "1.0.0"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform()
}

publishing {
    publications {
        create<MavenPublication>("mavenJava") {
            from(components["java"])
            // Define your POM information
            pom {
                name.set("jigar-lib")
                description.set("This is a library of mine")
                url.set("https://github.com/Jigar-23/jigar-lib")
                licenses {
                    license {
                        name.set("The Apache License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }
                developers {
                    developer {
                        id.set("Jigar-23")
                        name.set("Jigar")
                        email.set("Pulkit10112@gmail.com")
                    }
                }
                scm {
                    connection.set("scm:git:git://github.com/Jigar-23/jigar-lib.git")
                    developerConnection.set("scm:git:ssh://github.com/Jigar-23/jigar-lib.git")
                    url.set("https://github.com/Jigar-23/jigar-lib/")
                }

            }
        }
    }
    repositories {
        maven {
            url = uri("https://jitpack.io")
            credentials {
                username = "Jigar-23"  // Your GitHub username
                password = "jp_auvmfu70aj57gvbo5nmraeh8i4"  // Your JitPack access token
            }
        }
    }
}
