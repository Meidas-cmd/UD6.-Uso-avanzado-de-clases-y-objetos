package Simulación_de_Cajero_Automático;

import java.util.Scanner;

public class CajeroApp {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        CuentaBancaria usu1 = new CuentaBancaria(0);
        menuCajero(usu1);
    }

    public static void menuCajero(CuentaBancaria usu){
        boolean estado = true;
        System.out.println("=== Cajero Automático ===");
        System.out.println("[1]. Consultar saldo");
        System.out.println("[2]. Ingresar saldo");
        System.out.println("[3]. Retirar saldo");
        System.out.println("[X]. Salir");
        System.out.print("Seleccione una opcion:");
        String opc = entrada.next();
        switch (opc.toUpperCase()){
            case "1":
                usu.consultarSaldo();
                break;
            case "2":
                System.out.println("De cuanto es el importe del ingreso: ");
                double importe = entrada.nextDouble();
                usu.ingresasDinero(importe);

                break;
            case "3":
                System.out.println("De cuanto es el importe de la retirada: ");
                double retiro = entrada.nextDouble();
                usu.retirarDinero(retiro);

                break;
            case "X":
                System.out.println("Saliendo del cajero...");
                estado = false;
                break;
            default:
                System.out.println("Esa opcion no existe:");
                System.out.println("Volviendo al menu...");

        }
        if (estado){
            menuCajero(usu);
        }
    }
}
