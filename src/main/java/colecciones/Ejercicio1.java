package colecciones;

import java.util.Stack;

public class Ejercicio1 {

    public static void main(String[] args) {

        Stack<Integer> lista = new Stack<>();

        lista.push(4);
        lista.push(2);
        lista.push(12);


        while(!lista.isEmpty()){

            System.out.println(lista.pop());

        }
    }

}
