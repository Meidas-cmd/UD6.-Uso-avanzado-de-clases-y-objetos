package Práctica_Sistema_de_pago;

import java.util.Random;

public class Bizum extends MetodoPago{
    static Random aleatorio = new Random();


    private String telefono;
    private int pin;

    public Bizum(String telefono){

        this.telefono = telefono;
        this.pin = aleatorio.nextInt(99999,1000000);


    }

    public void validarBizum(String ttele,int pin){

        if (ttele.length()==8){
            System.out.println("");
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
        System.out.println("Procesando pago de " + importe + "€ con Bizum.");
    }
    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }

}
