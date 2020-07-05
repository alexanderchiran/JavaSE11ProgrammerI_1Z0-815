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


