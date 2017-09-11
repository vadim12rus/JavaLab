javac -d build/ src/main/java/volgatech/javacore2017/*.java
IF ERRORLEVEL 1 GOTO error

java -cp build/ volgatech.javacore2017.App  "./resource/words.txt" 2
ECHO Successful
PAUSE
EXIT

:error
ECHO An error was found
PAUSE