package colecciones;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ejercicio3_Mapeo {
    static  HashMap<String,Double> dana = new HashMap<>();
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {



        System.out.println("**********REGISTRO DE TEMPERATURAS********");

        while(true) {
            System.out.println("Elige una opcion [insertar,consultar,mostrar,salir]: ");

            String opc = entrada.nextLine().toLowerCase();

            switch (opc){
                case "insertar":
                    insertar();

                    break;
                case "actualizar":
                    actualizar();
                    break;

                case "consultar":
                    consultar();
                    break;
                case"mostrar":
                    mostrar();
                    break;

                case"salir":
                    return;

                default:
                    System.out.println("No existe esa opcion elige otra: ");
                    break;




            }
            System.out.println("***Mapita***");
            for (Map.Entry<String,Double> m : dana.entrySet()){


                System.out.println(m.getKey() + " - " + m.getValue());

            }

        }



    }

    public static void insertar(){

        System.out.println("Introduce los datos: [ciudad/temperatura]");
        String ciudad[] = entrada.nextLine().split("/");

        dana.put(ciudad[0],Double.valueOf(ciudad[1]));

    }

    public static void actualizar(){


    }

    public static void consultar(){



    }

    public static void mostrar(){


    }

}
