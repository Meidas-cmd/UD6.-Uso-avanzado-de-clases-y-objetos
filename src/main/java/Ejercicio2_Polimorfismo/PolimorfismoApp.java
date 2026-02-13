package Ejercicio2_Polimorfismo;

import java.util.ArrayList;

public class PolimorfismoApp {


    public static void main(String[] args) {

        Desarrollador d1 = new Desarrollador();

        Diseñador d2 = new Diseñador();

        Gerente g1 = new Gerente();

        ArrayList <Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(d1);

        listaEmpleados.add(d2);

        listaEmpleados.add(g1);

        System.out.println("=== Usando el array polimofico ===");
        for (Empleado e : listaEmpleados){

            e.realizarTarea();
        }
        for (Empleado e : listaEmpleados){
            asignarTarea(e);
        }


        asignarTarea(d1);

    }



    public static void asignarTarea(Empleado empleado){

        System.out.println("Asiganando tarea al empleado...");
        empleado.realizarTarea();

    }
}
