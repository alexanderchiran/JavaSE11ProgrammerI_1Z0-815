java --module-path out\production -m MiModulo1/modular.HelloWorld

# Shows dependencies of org.module.global
production>jdeps -v org.module.global
production>jdeps -verbose org.module.global
>jdeps -v -m java.sql

>jdeps -s org.module.global
>jdeps -summary org.module.global
>jdeps -summary org.module.global org.module.util 
>jdeps -summary  org.module.global org.module.util org.module.base
