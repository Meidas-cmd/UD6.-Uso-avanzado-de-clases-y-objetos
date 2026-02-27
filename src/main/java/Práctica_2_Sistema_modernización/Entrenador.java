package Práctica_2_Sistema_modernización;
/**
 * Clase Entrenador que gestiona la parte técnica del equipo, heredando de MutxamelFC.
 * @author JorgeC.G.
 */
public class Entrenador extends MutxamelFC implements FuncionesIntegrantes, AccionesDeportivas {

    private Equipos equipo;
    private String formacionPreferida;

    /**
     * Constructor para la clase Entrenador.
     * @param nombre
     * @param edad
     * @param equipo
     * @param formacionPreferida
     * @author JorgeC.G.
     */
    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }

    public Equipos getEquipo() { return equipo; }
    public void setEquipo(Equipos equipo) { this.equipo = equipo; }
    public String getFormacionPreferida() { return formacionPreferida; }

    /**
     * En este set comprobamos mediante un regex que la formación tenga el formato correcto (N-N-N) antes de asignarla.
     * @param formacionPreferida
     * @author JorgeC.G.
     */
    public void setFormacionPreferida(String formacionPreferida) {
        try {
            if (formacionPreferida.matches("\\d-\\d-\\d")) {
                this.formacionPreferida = formacionPreferida;
            } else {
                throw new FormacionExeption();
            }
        } catch (FormacionExeption e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Método específico del Entrenador para mostrar la acción de planificar el entrenamiento.
     * @author JorgeC.G.
     */
    public void planificarEntrenamiento() {
        System.out.println(this.getNombre() + " esta planificando el siguiente entrenamiento");
    }

    /**
     * Método para mostrar que el entrenador está gestionando cambios en el equipo.
     * @author JorgeC.G.
     */
    public void hacerCambios() {
        System.out.println("Esta realizando cambios");
    }

    /**
     * Metodo de FuncionesIntegrantes donde personalizamos el mensaje de concentración del entrenador.
     * @author JorgeC.G.
     */
    @Override
    public void concentrarse() {
        System.out.println(getNombre() + "esta concentrandose con su maximo esfuerzo");
    }

    /**
     * Metodo de FuncionesIntegrantes para mostrar el viaje del entrenador a una ciudad específica.
     * @param ciudad
     * @author JorgeC.G.
     */
    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " esta viajando a " + ciudad );
    }

    /**
     * Metodo heredado de FuncionesIntegrantes para mostrar la celebración del entrenador.
     * @author JorgeC.G.
     */
    @Override
    public void celebrarGol() {
        System.out.println("El entrenador" + getNombre() + " celebra el gol con todas sus fuerzas");
    }

    /**
     * Metodo de AccionesDeportivas donde el entrenador da las indicaciones pertinentes.
     * @author JorgeC.G.
     */
    @Override
    public void entrenar() {
        System.out.println("El entrenador " + getNombre() + " esta dando indicaciones al equipo " + getEquipo());
    }

    /**
     * Metodo de AccionesDeportivas donde se muestra al entrenador dirigiendo contra un rival.
     * @param rival
     * @author JorgeC.G.
     */
    @Override
    public void jugarPartido(String rival) {
        System.out.println("El entrenador esta dirigiendo el parrtido contra " + rival);
    }
}
