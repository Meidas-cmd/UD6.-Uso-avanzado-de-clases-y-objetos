package Carrefour;

public class Reponedor extends Persona{

    private String pasillo;

    public Reponedor(int codigo, String nombre, double sueldo, String pasillo) {
        super(codigo, nombre, sueldo);
        this.pasillo = pasillo;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }

    @Override
    public void trabajar() {
        System.out.println("Reponiendo productos...");
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("El pasillo asignada es : " + pasillo);
    }

    @Override
    public String toString() {
        return "Reponedort{" +
                "pasillo='" + pasillo + '\'' +
                '}';
    }

}
