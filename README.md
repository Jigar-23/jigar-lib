for kotlin dsl

    repositories {
    ...
    mavenCentral()
    maven { url = uri("https://jitpack.io") }

    
    }

Add the following dependency in build.gradle

    dependencies {
	        implementation 'com.github.Jigar-23:jigar-lib:1.0.3'
	}


for groovy dsl 
    
    repositories {
    ...
    mavenCentral()
    maven { url 'https://jitpack.io' }

    
    }

    
Add the following dependency in build.gradle

    dependencies {
	        implementation("com.github.Jigar-23:jigar-lib:1.0.3")
	}






