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
        for (int i = 0; i < tipos.length; i++) {

            if (tipo.equals(tipos[i])){

                this.tipo = tipo;
            }


        }

    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }
    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public void validarTarjeta() {
        boolean estado = false;
        if (nro_tarjeta.length() == 15){
            estado = true;
        }
        if (estado){
            System.out.println("El numero de la tarjeta esta correcto");
        }else{

            System.out.println("El numero de la tarjeta no esta con los valores establecidos.");
        }
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
        System.out.println("Procesando pago de " + importe + "€ con tarjeta de credito " + tipo);
    }
}
