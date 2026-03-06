package colecciones;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio1_Set {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("Escribe una frase: ");
        String frase = entrada.nextLine();

        HashSet<String> lista = new HashSet<>(Arrays.asList(frase.split(" ")));

        System.out.println("Palabras unicas: " + lista);


    }
}
