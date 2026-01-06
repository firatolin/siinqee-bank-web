@echo off
echo ========================================
echo SINQEE BANK - Simple Maven Wrapper
echo ========================================
echo.

REM Set Java path
set JAVA_EXE=C:\Program Files\Java\jdk-21\bin\java.exe

REM Check Java
if not exist "%JAVA_EXE%" (
    echo ERROR: Java not found at %JAVA_EXE%
    pause
    exit /b 1
)

echo Java found: %JAVA_EXE%
echo.

REM Check wrapper JAR
if not exist ".mvn\wrapper\maven-wrapper.jar" (
    echo Downloading Maven Wrapper...
    REM Simple download command
    powershell -Command "Invoke-WebRequest -Uri 'https://repo.maven.apache.org/maven2/io/takari/maven-wrapper/0.5.6/maven-wrapper-0.5.6.jar' -OutFile '.mvn\wrapper\maven-wrapper.jar'"
)

REM Run Maven
echo Starting Maven...
"%JAVA_EXE%" -jar ".mvn\wrapper\maven-wrapper.jar" %*
