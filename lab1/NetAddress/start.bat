javac -d build/ src/main/java/net/address/*.java
IF ERRORLEVEL 1 GOTO error

java -cp build/ net.address.App 192.168.1.2 255.255.254.0
ECHO Successful
PAUSE
EXIT

:error
ECHO An error was found
PAUSE