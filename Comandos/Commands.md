# RUN Directly
C:\DEV> java Test.java


#Compile and run 
C:\DEV> javac Test.java
java -classpath C:\DEV Test

#Compile 
javac -verbose Test.java

#Delete 
del Test.class

#JAR
--compilar el jar
jar -cf Test.jar -C C:\DEV\GitHub\JavaSE11ProgrammerI_1Z0-815\ProjectJavaSE11\src Test.class

--correr el jar
java -cp Test.jar Test

--compilar con manifiesto
jar -cf Test.jar manifest.txt -C C:\DEV\GitHub\JavaSE11ProgrammerI_1Z0-815\ProjectJavaSE11\src Test.class

--correr el jar
java -jar Test.jar

# Pasar Argumentos por linea de comandos 
java PrintArgs.java paulo chiran

-- imprime tres argumentos 
java PrintArgs.java paulo chiran "hola mundo"

Printing some arguments in this code:
Argument 1: paulo
Argument 2: chiran
Argument 3: hola mundo

#Run class
java -cp  out\production\ProjectJavaSE11 garden.vegetable.VineVegetable
java -classpath  out\production\ProjectJavaSE11 garden.vegetable.VineVegetable

# Compile Class in another directory
javac -d out\build src/garden/vegetable/VineVegetable.java
--run class compiled
java -classpath  out\build\ garden.vegetable.VineVegetable


# Commands

 @<filename>                  Read options and filenames from file
  -Akey[=value]                Options to pass to annotation processors
  --add-modules <module>(,<module>)*
        Root modules to resolve in addition to the initial modules, or all modules
        on the module path if <module> is ALL-MODULE-PATH.
  --boot-class-path <path>, -bootclasspath <path>
        Override location of bootstrap class files
  --class-path <path>, -classpath <path>, -cp <path>
        Specify where to find user class files and annotation processors
  -d <directory>               Specify where to place generated class files
  -deprecation
        Output source locations where deprecated APIs are used
  --enable-preview
        Enable preview language features. To be used in conjunction with either -source or --release.
  -encoding <encoding>         Specify character encoding used by source files
  -endorseddirs <dirs>         Override location of endorsed standards path
  -extdirs <dirs>              Override location of installed extensions
  -g                           Generate all debugging info
  -g:{lines,vars,source}       Generate only some debugging info
  -g:none                      Generate no debugging info
  -h <directory>
        Specify where to place generated native header files
  --help, -help, -?            Print this help message
  --help-extra, -X             Print help on extra options
  -implicit:{none,class}
        Specify whether or not to generate class files for implicitly referenced files
  -J<flag>                     Pass <flag> directly to the runtime system
  --limit-modules <module>(,<module>)*
        Limit the universe of observable modules
  --module <module-name>, -m <module-name>
        Compile only the specified module, check timestamps
  --module-path <path>, -p <path>
        Specify where to find application modules
  --module-source-path <module-source-path>
        Specify where to find input source files for multiple modules
  --module-version <version>
        Specify version of modules that are being compiled
  -nowarn                      Generate no warnings
  -parameters
        Generate metadata for reflection on method parameters
  -proc:{none,only}
        Control whether annotation processing and/or compilation is done.
  -processor <class1>[,<class2>,<class3>...]
        Names of the annotation processors to run; bypasses default discovery process
  --processor-module-path <path>
        Specify a module path where to find annotation processors
  --processor-path <path>, -processorpath <path>
        Specify where to find annotation processors
  -profile <profile>
        Check that API used is available in the specified profile
  --release <release>
        Compile for a specific VM version. Supported targets: 6, 7, 8, 9, 10, 11
  -s <directory>               Specify where to place generated source files
  -source <release>
        Provide source compatibility with specified release
  --source-path <path>, -sourcepath <path>
        Specify where to find input source files
  --system <jdk>|none          Override location of system modules
  -target <release>            Generate class files for specific VM version
  --upgrade-module-path <path>
        Override location of upgradeable modules
  -verbose                     Output messages about what the compiler is doing
  --version, -version          Version information
  -Werror                      Terminate compilation if warnings occur

