package Práctica_Sistema_de_pago;

import java.util.Scanner;

public class Paypal extends MetodoPago{
    static Scanner entrada = new Scanner(System.in);



    private String cuenta;
    private double saldo;

    public Paypal(String cuenta){

          this.cuenta=cuenta;
          this.saldo=23;

    }
    public String validarPayPal(String cuenta){
        String formato = "[_%]+@[_%.-]+.com";
        String validado = "";
        if (cuenta.matches(formato)){

            validado = cuenta;
            return validado;

        }else {
            System.out.println("Formato incorrecto:");
            System.out.println("Vuelve a intentarlo: ");
            String res = entrada.nextLine();
            validarPayPal(res);

        }

        return validado;
    }

    public boolean validarImporte(double importe){
        boolean estado = false;
        if (importe <=saldo){

            estado = true;
        }
        return estado;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = validarPayPal(cuenta);
    }


    @Override
    public void proceasrPago(double importe) {
        if (validarImporte(importe)) {
            System.out.println("Procesando pago de " + importe + "€ con Paypal");
        } else {
            System.out.println("El proceso de pago no es posible debido a saldo insuficiente.");
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
