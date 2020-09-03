package hilos;

//Crea un hilo implementando Runnable.

//Los objetos de MiHilo se pueden ejecutar en sus propios hilos
// porque MiHilo implementa Runnable.
class HaircutFijoNegocio implements Runnable {
    Datos datos ;

    HaircutFijoNegocio(Datos datos){
       this.datos = datos;
    }
    //Punto de entrada del hilo
    //Los hilos comienzan a ejecutarse aquí
    @Override
    public void run(){
        System.out.println("Comenzando Hilo "+datos.getNombre());

        try {
            for (int contar=0; contar<10; contar++){
                Thread.sleep(datos.getMileSegundos());
                asignarHaircutFijo(contar);
            }
        }catch (InterruptedException exc){
            System.out.println("Hilo "+datos.getNombre() + "Interrumpido.");
        }
        System.out.println("Terminando Hilo "+datos.getNombre());
        Procesos.setRestar();
    }

    /**
     * Inicia todo el proceso de calculo haircut Fijo
     * @param contar
     */
    public void asignarHaircutFijo(int contar){
        System.out.println("Hilo "+datos.getNombre()+", el recuento "+contar);
    }
}