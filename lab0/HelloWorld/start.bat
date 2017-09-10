javac -d build/ src/*.java
IF ERRORLEVEL 1 GOTO error

java -cp build/ volgatech.javacore2017.HelloJava
ECHO Successful
PAUSE
EXIT

:error
ECHO An error was found
PAUSE