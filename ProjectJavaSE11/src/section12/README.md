#Section 12:Understanding Modules
>cd C:\Program Files\Java\jdk-11.0.7\bin
C:\Program Files\Java\jdk-11.0.7\bin>java.exe --list-modules

bin>java.exe --describe-module java.logging 

bin>jdeps.exe --print-module-deps -m java.sql
bin>jdeps.exe --print-module-deps --module java.sql

bin>jdeps.exe --print-module-deps --module java.sql.rowset