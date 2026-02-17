package Práctica_Sistema_de_pago;

import java.util.Scanner;
/**
 * Clase principal que gestiona la lógica de la tienda, la interacción con el usuario y el flujo de pago.
 * @author Jorge Cuartero Giner
 * @version 1.0
 */
public class Tienda {

    static Scanner entrada = new Scanner(System.in);
    /**
     * Solicita al usuario el importe y ejecuta la lógica de procesamiento del pago.
     * @param metodo Instancia de la clase MetodoPago (Tarjeta, PayPal o Bizum).
     * @author Jorge Cuartero Giner
     * @version 1.0
     */
    public static void realizarPago(MetodoPago metodo) {

        System.out.print("Introduce el importe a pagar: ");
        double importe = entrada.nextDouble();
        entrada.nextLine();

        metodo.proceasrPago(importe);
    }
    /**
     * Muestra el menú de selección, recoge la opción del usuario e instancia el método de pago elegido.
     * @author Jorge Cuartero Giner
     * @version 1.0
     */
    public static void iniciarPago() {

        System.out.println("Seleccione el método de pago:");
        System.out.println("1. Tarjeta de Crédito");
        System.out.println("2. PayPal");
        System.out.println("3. Bizum");

        String opcionTexto = entrada.nextLine();
        int opcion;

        try {
            opcion = Integer.parseInt(opcionTexto);
        } catch (NumberFormatException e) {
            System.out.println("El método de pago no existe.");
            return;
        }
        MetodoPago metodo = null;

        switch (opcion) {

            case 1:
                metodo = crearTarjeta();
                break;

            case 2:
                metodo = crearPayPal();
                break;

            case 3:
                metodo = crearBizum();
                break;

            default:
                System.out.println("Opción no válida.");
                return;
        }

        if (metodo != null) {
            realizarPago(metodo);
        }
    }



    private static MetodoPago crearTarjeta() {

        System.out.print("Introduce número de tarjeta (16 dígitos): ");
        String numero = entrada.nextLine();

        System.out.print("Introduce tipo (VISA, MASTERCARD, MAESTRO): ");
        String tipo = entrada.nextLine();

        TarjetaCredito tarjeta = new TarjetaCredito(numero, tipo);

        if (tarjeta.validarTarjeta()) {
            return tarjeta;
        } else {
            System.out.println("Tarjeta no válida. Pago cancelado.");
            return null;
        }
    }

    private static MetodoPago crearPayPal() {

        System.out.print("Introduce correo PayPal: ");
        String correo = entrada.nextLine();

        Paypal paypal = new Paypal(correo);

        return paypal; // La validación se hará en procesarPago()
    }

    private static MetodoPago crearBizum() {

        System.out.print("Introduce número de teléfono (9 dígitos): ");
        String telefono = entrada.nextLine();

        Bizum bizum = new Bizum(telefono);

        if (bizum.validarBizum()) {
            return bizum;
        } else {
            System.out.println("Bizum no válido. Pago cancelado.");
            return null;
        }
    }
}
