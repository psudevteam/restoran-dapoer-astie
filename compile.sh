# Menghapus semua file yang sudah tercompile
sh remover.sh

# Temukan semua file .java dan kemudian masukan ke sources.txt
find -name "*.java" > src/runner/main/source/sources.txt

# Compile semua file java yang sebelum nya sudah terkumpul di sorces.txt
javac @src/runner/main/source/sources.txt

# Temukan semua file yang sudah di compile lalu kemudian masukan ke sources.txt
find -name "*.class" > src/runner/main/source/sources.txt

# Membuat executeble jar
jar cvfm main.jar src/runner/main/manifest/manifest.txt @src/runner/main/source/sources.txt

# Print isi dari jar
jar tf main.jar

