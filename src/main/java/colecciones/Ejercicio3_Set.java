package colecciones;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ejercicio3_Set {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        String res = "";
        HashSet<String> historial = new LinkedHashSet<>();
        int count = 0;


        while(!res.equalsIgnoreCase("salir")){
           System.out.println("Escribe una URL visita (o salir para terminar): ");
           res = entrada.nextLine();
           if (!res.equalsIgnoreCase("salir")){
               historial.add(res);
           }
       }


        System.out.println("Historail de navegacion: ");
        for (String h : historial){

            count++;
            System.out.println(count + "." + h);

        }





    }
}
