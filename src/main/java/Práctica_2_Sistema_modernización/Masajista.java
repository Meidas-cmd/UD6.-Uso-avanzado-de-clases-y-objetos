package Práctica_2_Sistema_modernización;
/**
 * Clase que define al Masajista del club, encargada del bienestar físico, heredando de MutxamelFC.
 * @author JorgeC.G.
 */
public class Masajista extends MutxamelFC implements FuncionesIntegrantes {

    private String titulacion;
    private int anosExperencias;

    /**
     * Constructor para inicializar los datos del masajista.
     * @param nombre
     * @param edad
     * @param titulacion
     * @param anosExperencias
     * @author JorgeC.G.
     */
    public Masajista(String nombre, int edad, String titulacion, int anosExperencias) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperencias = anosExperencias;
    }

    public String getTitulacion() { return titulacion; }
    public void setTitulacion(String titulacion) { this.titulacion = titulacion; }
    public int getAnosExperencias() { return anosExperencias; }
    public void setAnosExperencias(int anosExperencias) { this.anosExperencias = anosExperencias; }

    /**
     * Método exclusivo de Masajista que recibe un objeto Jugador para mostrar la acción de masaje.
     * @param jugador
     * @author JorgeC.G.
     */
    public void darMasaje(Jugador jugador) {
        System.out.println("Dando masaje a " + jugador);
    }

    /**
     * Metodo de FuncionesIntegrantes que personaliza el mensaje de concentración previo al trabajo.
     * @author JorgeC.G.
     */
    @Override
    public void concentrarse() {
        System.out.println("El masajista" + getNombre() + " esta concetrandose para su proximo masaje ");
    }

    /**
     * Metodo de FuncionesIntegrantes para indicar el traslado del masajista con el equipo.
     * @param ciudad
     * @author JorgeC.G.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + getNombre() + " esta viajando a " + ciudad + " para ir con su equipo");
    }

    /**
     * Metodo heredado de FuncionesIntegrantes para mostrar la celebración del gol desde su posición.
     * @author JorgeC.G.
     */
    @Override
    public void celebrarGol() {
        System.out.println("El masajista " + getNombre() + " celebra el gol desde el vestuario");
    }
}