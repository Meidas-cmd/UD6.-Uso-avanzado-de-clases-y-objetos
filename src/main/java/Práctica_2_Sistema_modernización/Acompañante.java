package Práctica_2_Sistema_modernización;

public class Acompañante extends MutxamelFC implements FuncionesIntegrantes{


    private Jugador integrante;
    private String parentesco;


    public Acompañante(String nombre, int edad,Jugador integrante,String parentesco) {
        super(nombre, edad);
        this.parentesco = parentesco;
        this.integrante = integrante;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void animarEquipo(){

        System.out.println("El " + this.getNombre() + "esta animando con todas sus fuerzas");

    }


    @Override
    public String toString() {
        return "Acompañante{" +
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + getNombre() + " se concentra viendo el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() + " viaja a " + ciudad + " para apoyar a " + getIntegrante());
    }

    @Override
    public void celebrarGol() {

        System.out.println("El acompañante " + getNombre() + " celebra el gol de " + getIntegrante());
    }
}
