package Práctica_2_Sistema_modernización;

public class DorsalExistente extends RuntimeException {

    public DorsalExistente() {
        super("El dorsal ya existe dentro del equipo");
    }
}
