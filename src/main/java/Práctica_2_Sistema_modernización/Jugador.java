package Práctica_2_Sistema_modernización;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements FuncionesIntegrantes,AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;
    static ArrayList<Jugador> listaDorsales= new ArrayList<>();

    public Jugador(String nombre, int edad, Equipos categoria,int dorsal,Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.posicion = posicion;
        setDorsal(dorsal);

    }


    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    /****
     * En este set hay un par de modificaciones para comprobar que el dorsal no ha sido asignado ya ha otro jugador.
     * @author JorgeC.G.
      * @param dorsal
     */
    public void setDorsal(int dorsal) {
            boolean estado = false;

            try {
                for (Jugador j : listaDorsales) {
                    if (dorsal == j.getDorsal() && categoria == j.getCategoria()) {
                        estado = true;
                    }

                }

                if (estado){
                    throw new DorsalExistente();
                }else {

                    listaDorsales.add(this);
                    this.dorsal = dorsal;
                }
            } catch (DorsalExistente e) {
                System.out.println(e.getMessage());
            }

    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }


    /****
     * En este metodo lo usamos para mostrar un mensaje personalizado del calentamiento para los jugadores
     * @author JorgeC.G.
     */
    public void calentar(){

        System.out.println("El " + this.getNombre() + " esta haciendo ejercicios de calentamiento: ");
    }

    /****
     * Este metodo muestra un mensaje personalizado para esta clase de la accion descansar
     * @author JorgeC.G.
     */
    public void descansar(){

        System.out.println("El " + this.getNombre() + " esta descansando");

    }

    /****
     * Metdodo solo para la clase Jugador que muestra por pantalla un mensaje de marcar gol
     * @author JorgeC.G.
     */
    public void marcarGol(){

        System.out.println("El "+ this.getNombre() + " ha marcado un gol");
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                '}';
    }

    /****
     * Metodo que se obtiene de la interfaz FuncionesIntegrantes donde modificamos el mensaje de concentrarse
     * @author JorgeC.G
     */

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " esta concentrandose para jugar el partido");
    }

    /****
     * Metodo tambien obtenido de la interfaz FuncionesIntegrantes donde recogemos un String que seria el destino para que aparezca el mensaje por pantalla personalizado.
     * @author JorgeC.G.
     * @param ciudad
     */

    @Override
    public void viajar(String ciudad) {

        System.out.println("El jugador " + getNombre() + " esta viajando a " + ciudad);

    }

    /****
     * Metodo heredado de FuncionesIntegrantes donde lo modificamos para personalizar el mensaje que mostraremos al llamarlo.
     * @author JorgeC.G.
     */

    @Override
    public void celebrarGol() {

        System.out.println("El jugador " + getNombre() + " esta gritando el gol ");

    }

    /****
     * Metodo de la interfaz AccionesDeportivas la cual modificaremos para personalizarlo hacia la Clase Jugador donde mostraremos un mensaje.
     * @author JorgeC.G.
     */

    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " esta escuchando las indicaciones del entrenador");
    }


    /****
     * Metodo proveniente de la interfaz AccionesDeportivas donde recibiremos un String que es el rival al que nos enfrentamos y mostramos un mensaje del jugador y su rival.
     * @param rival
     * @author JorgeC.G.
     */
    @Override
    public void jugarPartido(String rival) {


        System.out.println("El jugador " + getNombre() + " jugara contra " + rival);
    }
}
