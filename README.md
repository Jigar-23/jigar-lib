Add the following

    mavenCentral()
    maven { url = uri("https://jitpack.io") }

in the repositories which has the structure of the following kind in the build.gradle

    repositories {
    ...
    mavenCentral()
    maven { url = uri("https://jitpack.io") }

    
    }

for groovy dsl 
    repositories {
    ...
    mavenCentral()
    maven { url 'https://jitpack.io' }

    
    }

    
Add the following dependency in build.gradle

    dependencies {
	        implementation 'com.github.Jigar-23:jigar-lib:1.0.3'
	}






