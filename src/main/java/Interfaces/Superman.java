package Interfaces;

public class Superman extends SuperHeroe implements Volador,Ataques{


    @Override
    public void volar() {
        System.out.println("Sobrevolando la ciudad en busca de malos.");
    }

    @Override
    public void rayoLaser() {
        System.out.println("Te desintegro...");
    }

    @Override
    public void alientoHelado() {
        System.out.println("Hice hielo...");
    }
}
