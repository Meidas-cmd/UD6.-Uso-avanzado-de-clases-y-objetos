package Carrefour;

import java.lang.classfile.instruction.NewMultiArrayInstruction;
import java.util.ArrayList;

public class PersonasApp {

    public static void main(String[] args) {


        Cajero jorge = new Cajero(147,"Jorge",1888);

        jorge.mostrarInfo();

        Persona manuel = new Cajero(1233,"Manuel",2);

        ArrayList<Persona> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(manuel);
        listaEmpleados.add(jorge);

//        for (Persona persona: listaEmpleados){
//
//            System.out.println(persona);
//        }

        fichar(manuel);
        fichar(jorge);
    }

    public static void fichar(Persona persona){

        System.out.println("Ficahndo...");

    }
}
