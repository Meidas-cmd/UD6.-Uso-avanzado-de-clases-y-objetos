package Práctica_2_Sistema_modernización;

public class Entrenador  extends MutxamelFC implements FuncionesIntegrantes,AccionesDeportivas{



    private Equipos equipo;
    private  String formacionPreferida;

    public Entrenador(String nombre, int edad,Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }
    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {

        this.equipo = equipo;

    }

    public String getFormacionPreferida() {


        return formacionPreferida;


    }


    public void setFormacionPreferida(String formacionPreferida) {

        try {
            if (formacionPreferida.matches("\\d-\\d-\\d")){
                this.formacionPreferida = formacionPreferida;
            }else {
                throw new FormacionExeption();
            }
        } catch (FormacionExeption e) {
            System.out.println(e.getMessage());
        }



    }

    public void planificarEntrenamiento(){

        System.out.println(this.getNombre() + " esta planificando el siguiente entrenamiento");

    }

    public void hacerCambios(){

        System.out.println("Esta realizando cambios");
    }
    @Override
    public String toString() {
        return "Entrenador{" +
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println(getNombre() + "esta concentrandose con su maximo esfuerzo");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(getNombre() + " esta viajando a " + ciudad );
    }

    @Override
    public void celebrarGol() {

        System.out.println("El entrenador" + getNombre() + " celebra el gol con todas sus fuerzas");

    }


    @Override
    public void entrenar() {
        System.out.println("El entrenador " + getNombre() + " esta dando indicaciones al equipo " + getEquipo());
    }

    @Override
    public void jugarPartido(String rival) {

        System.out.println("El entrenador esta dirigiendo el parrtido contra " + rival);
    }
}
