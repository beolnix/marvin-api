## Project description
API of [marvin](https://github.com/beolnix/marvin) bot. 
You need this API if you are going to create a plugin for marvin bot or if you want to add support of new IM protocol.

## Project details
| Version | State | Code link | Binaries
| --- | --- | --- | --- |
| 0.2 | Stable | [0.2-release](https://github.com/beolnix/marvin-api/releases/tag/0.2-release) | [marvin-api-0.2.jar](http://nexus.beolnix.com/service/local/repositories/releases/content/com/beolnix/marvin/marvin-api/0.2/marvin-api-0.2.jar) |
| 0.3-SNAPSHOT | In dev | [master](https://github.com/beolnix/marvin-api/) | |

## Requirements
#### To run
* JDK 8 only

#### To build
* JDK 8
* Gradle 2.8
* Groovy 2.4.4

## Build from source
Just execute the following command and may the force be with you:
```
gradle clean build
```

If everything is fine, you find **api-0.1.jar** in **build/libs/** 

## Interfaces
* **config** - API to work with provided configuration
* **im** - API to work with IM sessions, to send messages
* **plugin** - API to work with plugins, process messages

## Adding API to your project

### Maven
Add the following lines into the pom.xml file of your maven project:
```xml
<repositories>
    <repository>
        <id>beolnix-releases</id>
        <name>releases repo</name>
        <url>http://nexus.beolnix.com/content/repositories/releases/</url>
    </repository>
</repositories>

<dependencies>
     <dependency>
        <groupId>com.beolnix.marvin</groupId>
        <artifactId>api</artifactId>
        <version>0.1</version>
     </dependency>
</dependencies>
```

### Gradle
Or if you are using Gradle just add the following into the build.gradle of your project:
```groovy
repositories {
    maven {
        url "http://nexus.beolnix.com/content/repositories/releases/"
    }
}
dependencies {
    compile "com.beolnix.marvin:api:0.1"
}
```

## Usage example
* [maven-echo-plugin](https://github.com/beolnix/marvin-echo-plugin) - example of API usage in marvin echo-plugin
* [irc-im-session](https://github.com/beolnix/marvin/tree/master/im-sessions/marvin-irc-im-session) - example of API usage in IRC IM Session. This one adds support of IRC protocol to marvin-core
