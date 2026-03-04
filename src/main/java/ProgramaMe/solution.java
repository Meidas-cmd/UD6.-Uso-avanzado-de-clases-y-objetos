package ProgramaMe;

import java.util.ArrayList;
import java.util.Stack;

public class solution {

    static java.util.Scanner entrada;

    public static boolean casoDePrueba() {
        if (!entrada.hasNext())
            return false;
        else {
            Stack<Character> pila = new Stack<>();
            boolean estado = true;
            String exp = entrada.nextLine();
            for (int i = 0; i < exp.length(); i++) {
            if (exp.charAt(i) == '(' || exp.charAt(i) == '[' || exp.charAt(i) == '{'){

                pila.push(exp.charAt(i));


            } else if (exp.charAt(i) == ')' || exp.charAt(i) == ']' || exp.charAt(i) == '}') {

                if (!pila.isEmpty()){
                    if (pila.peek() == '(' && exp.charAt(i) == ')'){
                        pila.pop();
                    } else if (pila.peek() == '[' && exp.charAt(i) == ']') {
                        pila.pop();
                    } else if (pila.peek() == '{' && exp.charAt(i) == '}') {
                        pila.pop();
                    }else {
                        estado = false;
                    }
                }else {
                    estado = false;
                }
            }
            }

            if (estado && pila.isEmpty()){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }




            return true;
        }
    }

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }

}