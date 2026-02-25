package Simulación_de_Cajero_Automático;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {

        super("Has intentado hacer un ingreso superior del limite permitido: ");

    }
}
