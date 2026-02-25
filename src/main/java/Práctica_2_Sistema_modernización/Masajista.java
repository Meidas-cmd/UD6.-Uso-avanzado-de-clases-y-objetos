package Práctica_2_Sistema_modernización;

public class Masajista extends MutxamelFC implements FuncionesIntegrantes{


    private String titulacion;
    private int anosExperencias;

    public Masajista(String nombre, int edad,String titulacion,int anosExperencias) {
        super(nombre, edad);

        this.titulacion = titulacion;
        this.anosExperencias = anosExperencias;

    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperencias() {
        return anosExperencias;
    }

    public void setAnosExperencias(int anosExperencias) {
        this.anosExperencias = anosExperencias;
    }

    @Override
    public String toString() {
        return "Masajista{" +
                "titulacion='" + titulacion + '\'' +
                ", anosExperencias=" + anosExperencias +
                '}';
    }
    public void darMasaje(Jugador jugador){

        System.out.println("Dando masaje a " + jugador);

    }

    @Override
    public void concentrarse() {
        System.out.println("El masajista" + getNombre() + " esta concetrandose para su proximo masaje ");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + getNombre() + " esta viajando a " + ciudad + " para ir con su equipo");
    }

    @Override
    public void celebrarGol() {

        System.out.println("El masajista " + getNombre() + " celebra el gol desde el vestuario");
    }
}
