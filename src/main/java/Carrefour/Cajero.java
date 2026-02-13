package Carrefour;

import java.util.Scanner;

public class Cajero extends Persona{

    static  Scanner entrada = new Scanner(System.in);


    private int caja;



    public Cajero(int codigo, String nombre, double sueldo) {
        super(codigo, nombre, sueldo);
        setCaja();
    }

    @Override
    public void trabajar() {
        System.out.println("Cobrando...");
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja() {
        System.out.println("Introduce en que caja te han asignado:");
        int caja = entrada.nextInt();
        this.caja = caja;
        entrada.nextLine();
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("La caja asignada es : " + caja);

    }

    @Override
    public String toString() {
        return "Cajero{" +
                "caja=" + caja +
                '}';
    }
}
