package hilos;

import java.util.ArrayList;
import java.util.List;

public class UsoHilos {
    public static void main(String[] args) {
        System.out.println("Hilo principal iniciando.");
        List<Datos> titulosSinHaircut = new ArrayList<>();

        for (int i=0;i<=10;i++){
            titulosSinHaircut.add(new Datos("# "+i,i*1000));
        }

        UsoHilos usoHilos = new UsoHilos();
        for (Datos datos:titulosSinHaircut) {
            usoHilos.instanciaHiloHaircutFijo(datos);
        }

//        for (int i=0; i<50;i++){
//            System.out.print(".");
//        }
//        try{
//            Thread.sleep(100);
//        }catch (InterruptedException exc){
//            System.out.println("Hilo principal interrumpido.");
//        }
        System.out.println("Hilo principal finalizado.");
    }

    private void instanciaHiloHaircutFijo(Datos datos){
        Procesos.setSumar();
        System.out.println("Numero de procesos: "+Procesos.getContador());
        while (Procesos.getContador()>3){
            System.out.print("-");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("");
        //Primero, construye un objeto MiHilo.
        HaircutFijoNegocio mh=new HaircutFijoNegocio(datos);

        //Luego, construye un hilo de ese objeto.
        Thread nuevoh=new Thread(mh);

        //Finalmente, comienza la ejecución del hilo.
        nuevoh.start();
    }
}
