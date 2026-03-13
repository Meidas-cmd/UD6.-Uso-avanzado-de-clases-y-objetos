package colecciones;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio2_mapas {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        HashMap<Character,Integer> frase = new HashMap<>();
        System.out.println("Introduce una frase: ");
        String fra = entrada.nextLine().toLowerCase();

        for (Character pala : fra.toCharArray() ){

            if (frase.containsKey(pala)){
                frase.put(pala,frase.get(pala)+1);
            }else{
                frase.put(pala,1);
            }

            frase.put(pala,frase.getOrDefault(pala,0)+1);




        }

        for (Map.Entry<Character,Integer> m  : frase.entrySet()){
            System.out.println("La palabra " + m.getKey() + " ha salido un total de " + m.getValue());

        }




    }
}
