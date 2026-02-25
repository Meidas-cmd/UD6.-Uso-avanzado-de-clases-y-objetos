package Excepciones;

import java.util.zip.DataFormatException;

public class PruebaExcepciones {

    public static void main(String[] args) {


        int edad = 15;

        if (edad< 18){

            throw new EdadValida("Edad no permitida a la venta de alcohol");

        }
    }
}
