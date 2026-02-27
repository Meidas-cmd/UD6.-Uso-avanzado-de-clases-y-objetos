package Práctica_2_Sistema_modernización;

import java.sql.SQLOutput;
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

    public void calentar(){

        System.out.println("El " + this.getNombre() + " esta haciendo ejercicios de calentamiento: ");
    }
    public void descansar(){

        System.out.println("El " + this.getNombre() + " esta descansando");

    }
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

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " esta concentrandose para jugar el partido");
    }

    @Override
    public void viajar(String ciudad) {

        System.out.println("El jugador " + getNombre() + " esta viajando a " + ciudad);

    }

    @Override
    public void celebrarGol() {

        System.out.println("El jugador " + getNombre() + " esta gritando el gol ");

    }

    @Override
    public void entrenar() {
        System.out.println("El jugador " + getNombre() + " esta escuchando las indicaciones del entrenador");
    }

    @Override
    public void jugarPartido(String rival) {


        System.out.println("El jugador " + getNombre() + " jugara contra " + rival);
    }
}
