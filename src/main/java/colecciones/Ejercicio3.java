package colecciones;

import java.util.Stack;

public class Ejercicio3 {

    public static void main(String[] args) {

        String expression = ")";


        if (esBalanceado(expression)){
            System.out.println("BIEN");
        }else {
            System.out.println("MALAMENTE TRA TRA");
        }

    }

    public static boolean esBalanceado(String expression){

        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {

            if (expression.charAt(i) == '(') {
                pila.push(expression.charAt(i));
            } else if (expression.charAt(i) == ')') {

                if (pila.contains('(')) {
                    pila.pop();
                }else{
                    return false;
                }
            }
        }


        if (pila.isEmpty()){
            return true;
        }else {
            return false;
        }
    }
}
