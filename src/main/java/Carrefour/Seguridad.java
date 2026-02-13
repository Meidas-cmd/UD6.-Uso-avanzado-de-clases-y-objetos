package Carrefour;

import java.util.ArrayList;

public class Seguridad extends Persona{

    private String empresa;
    ArrayList<String>  Armas;


    public Seguridad(int codigo, String nombre, double sueldo,String empresa) {
        super(codigo, nombre, sueldo);
        this.empresa = empresa;
        this.Armas = new ArrayList<>();
    }

    public ArrayList<String> getArmas() {
        return Armas;
    }

    public void setArmas(ArrayList<String> armas) {
        Armas = armas;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    @Override
    public void trabajar() {
        System.out.println("Working...");
    }

    @Override
    public void mostrarInfo(){

        super.mostrarInfo();
        System.out.println("Es de la empresa : " + empresa );
        System.out.println("El equipamiento que lleva es el siguiente:");
        for (String a : Armas){

            System.out.println("Equipamiento: " + a);

        }


    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", Armas=" + Armas +
                '}';
    }

}
