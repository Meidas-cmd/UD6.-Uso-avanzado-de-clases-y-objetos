package Práctica_2_Sistema_modernización;

public class FormacionExeption extends RuntimeException {
    public FormacionExeption() {
        super("El formato de la formacion no es el correspondiente:");
    }
}
