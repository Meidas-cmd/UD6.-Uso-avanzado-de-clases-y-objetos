package Práctica_Sistema_de_pago;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{
    static Random aleatorio = new Random();
    static Scanner entrada = new Scanner(System.in);


    private String telefono;
    private int pin;

    public Bizum(String telefono){

        this.telefono = telefono;
        this.pin = aleatorio.nextInt(100000,1000000);
        System.out.println("El pin es: " + pin);


    }

    public boolean validarBizum() {

        if (telefono == null || !telefono.matches("\\d{9}")) {
            System.out.println("Teléfono no válido. Debe tener 9 dígitos.");
            return false;
        }

        System.out.print("Introduce el PIN de 6 dígitos: ");
        int pinIntroducido = entrada.nextInt();

        if (pinIntroducido == pin) {
            System.out.println("Bizum validado correctamente.");
            return true;
        } else {
            System.out.println("PIN incorrecto.");
            return false;
        }
    }



    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public void proceasrPago(double importe) {
        if(validarBizum()){
            System.out.println("Procesando pago de " + importe + "€ con Bizum.");
        } else {
            System.out.println("No se pudo procesar el pago.");
        }
    }
    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }

}
