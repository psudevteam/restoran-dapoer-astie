# Menghapus semua file yang sudah tercompile
sh remover.sh && echo "Test 1 Passed"
sleep 1

# Temukan semua file .java dan kemudian masukan ke sources.txt
find src -name "*.java" > src/runner/test/executeble/sources.txt && echo "Test 2 Passed"

# Compile semua file java yang sebelum nya sudah terkumpul di sorces.txt
sleep 1
javac @src/runner/test/executeble/sources.txt && echo "Test 3 Passed"

# Temukan semua file yang sudah di compile lalu kemudian masukan ke sources.txt
sleep 1
find src -name "*.class" > src/runner/test/executeble/sources.txt && echo "Test 4 Passed"

# Membuat executeble jar
sleep 1
jar cvfm src/runner/test/executeble/main.jar src/runner/test/manifest/manifest.txt @src/runner/test/executeble/sources.txt && echo "Test 5 Passed"

# Print isi dari jar
sleep 1
jar tf src/runner/test/executeble/main.jar && echo "Test 6 Passed"

# run jar
sleep 1
java -jar src/runner/test/executeble/main.jar
