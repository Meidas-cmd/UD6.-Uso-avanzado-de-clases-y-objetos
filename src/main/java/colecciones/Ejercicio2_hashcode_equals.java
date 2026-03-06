package colecciones;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Ejercicio2_hashcode_equals {

    static Queue<Persona_Ej3> cola = new LinkedList<>();
    static Random aleatorio = new Random();

    public static void main(String[] args) {
        double dinero = 0;
        generarCola();
        System.out.println(cola);


        while (!cola.isEmpty()){

            if (cola.poll().getEdad() >= 3){

                dinero += 1;
            } else if (cola.poll().getEdad() >=11) {

                dinero+=2.5;

            }else if (cola.poll().getEdad() >= 18){

                dinero+=3.5;
            }

        }


        System.out.println(dinero);

    }


    public static void generarCola(){

        int max_personas = aleatorio.nextInt(251);

        for (int i = 0; i < max_personas; i++) {

            cola.offer(new Persona_Ej3(aleatorio.nextInt(97)+3));

        }


    }
}
