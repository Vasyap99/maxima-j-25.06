@set jp=c:\java\new\__tools\apache-maven-3.9.1\bin\

@set PATH=%PATH%;c:\java\new\__tools\apache-maven-3.9.1\bin\

@set JAVA_HOME=c:\OpenJDK\


@del dz25_06\*.class 2>nul

@%jp%mvn package

@c:\openjdk\bin\java.exe -jar c:\java\new\_maxima\dz\25.06\target\tvset-2.0-SNAPSHOT.jar


@pause