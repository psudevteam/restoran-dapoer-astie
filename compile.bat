del */*/*/*/*.class

dir /s /B *.java > src/runner/main/source/sources.txt

javac @src/runner/main/source/sources.txt

dir /s /B *.class > src/runner/main/source/sources.txt

jar cvfm main.jar src/runner/main/manifest/manifest.txt @src/runner/main/source/sources.txt

jar tf main.jar

