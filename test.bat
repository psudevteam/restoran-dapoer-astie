del */*/*/*/*.class

dir /s /B *.java > src/runner/test/source/sources.txt

javac @src/runner/test/source/sources.txt

dir /s /B *.class > src/runner/test/source/sources.txt

jar cvfm main.jar src/runner/test/manifest/manifest.txt @src/runner/test/source/sources.txt

jar tf src/runner/test/executeble/main.jar

jar src/runner/test/executeble/main.jar

