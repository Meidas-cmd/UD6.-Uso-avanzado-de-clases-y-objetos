package Práctica_Sistema_de_pago;

import com.sun.security.jgss.GSSUtil;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class TarjetaCredito extends MetodoPago{
    private final String[] tipos = {"VISA","MASTERCARD","MAESTRO"};

    private String nro_tarjeta;
    private String tipo;


    public TarjetaCredito(String nro_tarjeta, String tipo){

        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;

    }



    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }
    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public boolean validarTarjeta() {
        if (nro_tarjeta.length() == 16){
            for (int i = 0; i < tipos.length; i++) {
                if (tipo.equals(tipos[i])){
                    System.out.println("El tipo de tarjeta esta dentro de los valores permitidos");
                    return true;
                }
            }
        }else{

            System.out.println("El numero de la tarjeta no esta con los valores establecidos.");
            return false;
        }
        return false;
    }


    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "tipos=" + Arrays.toString(tipos) +
                ", nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }

    @Override
    public void proceasrPago(double importe) {
        if(validarTarjeta()){
            System.out.println("Procesando pago de " + importe + "€ con tarjeta de credito " + tipo);
        } else {
            System.out.println("Tarjeta no válida");
        }

    }
}
