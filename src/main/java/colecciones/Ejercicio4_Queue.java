package colecciones;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Ejercicio4_Queue {
    static Scanner entrada = new Scanner(System.in);
    static Deque<String> lista = new LinkedList<>();
    public static void main(String[] args) {


        menu();
    }

    public static void menu(){

        System.out.println("===LISTA DE LA COMPRA===");
        System.out.println("1-Añadir producto al final");
        System.out.println("2-Eliminar primer producto");
        System.out.println("3-Eliminar producto por nombre");
        System.out.println("4-Ver primer producto");
        System.out.println("5-Buscar producto");
        System.out.println("6-Mostrar lista actual");
        System.out.println("X-Salir");
        System.out.print("Seleccione una opcion:");
        String opc = entrada.nextLine();
        System.out.println("================================");

        opc(opc);
    }

    public static void opc(String opc){

        switch (opc.toUpperCase()){
            case "1":
                opc1();
                break;
            case"2":
                opc2();
                break;

            case"3":
                opc3();
                break;

            case"4":
                    opc4();
                 break;

            case"5":
                    opc5();
                break;

            case"6":

                break;
            case"X":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Esa opcion no existe");
                System.out.println("Saliendo...");
                break;


        }

    }

    public static void opc1(){
        System.out.print("Producto a añadir: ");
        String res = entrada.nextLine();
        lista.offerLast(res);
        menu();
    }

    public static void opc2(){
        if (!lista.isEmpty()) {
            System.out.println("Eliminando primer producto: " + lista.pollFirst());
        }else {
            System.out.println("No se puede eliminar el primer producto debido a qye no hay ninguno...");
        }
        menu();

    }

    public static void opc3(){
        System.out.println("Que producto quieres elimianr de la lista:");
        String prod = entrada.nextLine();
        if (lista.contains(prod)){
            lista.remove(prod);
            System.out.println("Producto eliminado...");
        }else{
            System.out.println("El producto no existe en la lista...");
        }
        menu();
    }

    public static void opc4(){

        System.out.println("Primer producto de la lista: " + lista.peekFirst());

        menu();
    }
    public static void opc5(){
        System.out.println("Que producto quieres buscar: ");
        String producto = entrada.nextLine();


        if (lista.contains(producto)) {
            System.out.println("Si esta el producto en la lista:");
        }else{
            System.out.println("El producto no esta en la lista...");
        }

        menu();

        }

        public static void opc6(){

        

        }

    }


