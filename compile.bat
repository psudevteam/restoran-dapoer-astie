# removing previously compiled files
del */*/*/*.class

# find all java files and output the names to sources.txt
find -name "*.java" > src/main/source/sources.txt

# compile all!
javac @src/main/source/sources.txt

# get compiled files and now output to sources.txt
find -name "*.class" > src/main/source/sources.txt

# create jar
jar cvfm main.jar src/main/manifest/manifest.txt @src/main/source/sources.txt

# get contents of jar
jar tf main.jar

