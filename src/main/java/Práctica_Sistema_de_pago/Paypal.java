package Práctica_Sistema_de_pago;

import java.util.Scanner;
/**
 * Implementación de pago a través de la plataforma PayPal con validación de saldo.
 * @author Jorge Cuartero Giner
 * @version 1.0
 */
public class Paypal extends MetodoPago{
    static Scanner entrada = new Scanner(System.in);



    private String cuenta;
    private double saldo;

    public Paypal(String cuenta){

          this.cuenta=cuenta;
          this.saldo=23;

    }
    /**
     * Valida el formato del correo electrónico mediante una expresión regular y comprueba el saldo.
     * @param importe Cantidad que se desea pagar.
     * @return true si el email es válido y el importe no supera el saldo disponible.
     */
    public boolean validarPayPal(double importe){
        String formato = "^[\\w.-]+@[\\w.-]+\\.com$"; //Formato pedido a chatgpt
        if (!cuenta.matches(formato)){
            System.out.println("Formato de la cuenta incorreccto no lo cumples:");
            return false;
        }
        if (importe > saldo) {
            System.out.println("Importe superior al saldo.");
            return false;
        }

        return true;

    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }


    @Override
    public void proceasrPago(double importe) {
        if (validarPayPal(importe)) {
            System.out.println("Procesando pago de " + importe + "€ con Paypal");
        } else {
            System.out.println("No es posible realizar el pago con Paypal.");
        }
    }
    @Override
    public String toString() {
        return "Paypal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
