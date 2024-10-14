Add 

    mavenCentral()
    maven("https://jitpack.io")

in the repositories which has the structure of the kind in the build.gradle

    repositories {
    ...
    mavenCentral()
    maven("https://jitpack.io")
    
    }
Add the following dependency in build.gradle

    dependencies {
	        implementation 'com.github.Jigar-23:jigar-lib:1.0.1'
	}






