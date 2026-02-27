package Práctica_2_Sistema_modernización;
/**
 * Clase que representa a los acompañantes de los jugadores, heredando de MutxamelFC.
 * @author JorgeC.G.
 */
public class Acompañante extends MutxamelFC implements FuncionesIntegrantes {

    private Jugador integrante;
    private String parentesco;

    /**
     * Constructor de la clase Acompañante para inicializar sus atributos y los de la superclase.
     * @param nombre
     * @param edad
     * @param integrante
     * @param parentesco
     * @author JorgeC.G.
     */
    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.parentesco = parentesco;
        this.integrante = integrante;
    }

    public Jugador getIntegrante() { return integrante; }
    public void setIntegrante(Jugador integrante) { this.integrante = integrante; }
    public String getParentesco() { return parentesco; }
    public void setParentesco(String parentesco) { this.parentesco = parentesco; }

    /**
     * Método propio de la clase Acompañante que muestra un mensaje de apoyo al equipo.
     * @author JorgeC.G.
     */
    public void animarEquipo() {
        System.out.println("El " + this.getNombre() + "esta animando con todas sus fuerzas");
    }

    @Override
    public String toString() {
        return "Acompañante{" + "integrante=" + integrante + ", parentesco='" + parentesco + '\'' + '}';
    }

    /**
     * Metodo que se obtiene de la interfaz FuncionesIntegrantes donde personalizamos el mensaje de concentrarse para el acompañante.
     * @author JorgeC.G.
     */
    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + getNombre() + " se concentra viendo el partido");
    }

    /**
     * Metodo obtenido de la interfaz FuncionesIntegrantes que recibe el destino para mostrar el mensaje de viaje personalizado.
     * @param ciudad
     * @author JorgeC.G.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + getNombre() + " viaja a " + ciudad + " para apoyar a " + getIntegrante());
    }

    /**
     * Metodo heredado de FuncionesIntegrantes modificado para mostrar cómo celebra el gol el acompañante.
     * @author JorgeC.G.
     */
    @Override
    public void celebrarGol() {
        System.out.println("El acompañante " + getNombre() + " celebra el gol de " + getIntegrante());
    }
}