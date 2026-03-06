package colecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Ejericicio5_Queue {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        boolean estado = true;
        Deque<Character> palabra = new ArrayDeque<>();


        System.out.println("Dime una palabra y te dire si es una palabra palindromo: ");
        String pal = entrada.nextLine();

        for (int i = 0; i < pal.length(); i++) {

            palabra.offerLast(pal.charAt(i));
        }

        for (int i = 0; i < palabra.size()/2; i++) {

            if (palabra.peek() == palabra.peekLast()){
                palabra.poll();
                palabra.pollLast();
            }
            else{
                estado = false;
            }
        }


        if (estado){
            System.out.println("Es un palindromo");
        }else {
            System.out.println("No es un palindromo");
        }



    }
}
