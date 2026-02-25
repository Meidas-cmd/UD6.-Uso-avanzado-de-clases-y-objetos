package ejercicio_enum;

public class SemaforoApp {
    public static void main(String[] args) {

        Semaforo estado = Semaforo.AMARILLO;


        for (int i = 0; i < 10; i++) {

                System.out.println("El color del semaforo es " + estado.name());
                estado = estado.siguiente();


        }




    }
}
