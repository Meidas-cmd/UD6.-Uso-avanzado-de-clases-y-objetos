package enums;

import java.util.Scanner;

public class TarjetasApp {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        Tarjetas tarjeta_tipo = Tarjetas.VISA;


        System.out.println(tarjeta_tipo.ordinal());
        System.out.println("---------------------");

        System.out.println(tarjeta_tipo.name());
        System.out.println("---------------------");

        Tarjetas.values();

        System.out.println("---------------------");
        System.out.println("Tipo de tarjetas: ");

        for (Tarjetas tarjeta : Tarjetas.values()){


            System.out.println(tarjeta.name());

        }
        System.out.println("---------------------");
        System.out.println("Introduce el tipo :");
        Tarjetas tipo = Tarjetas.valueOf(entrada.next());

        System.out.println("---------------------");
        System.out.println("La tarjeta de tipo " + tipo.name() + " tiene una comision de " + tipo.getCominsion() + "€ ");

    }

}
