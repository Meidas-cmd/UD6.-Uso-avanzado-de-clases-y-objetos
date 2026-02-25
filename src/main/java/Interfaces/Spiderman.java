package Interfaces;

public class Spiderman extends SuperHeroe implements Volador{
    @Override
    public void volar() {
        System.out.println("Volando con la telaraña");
    }
}
