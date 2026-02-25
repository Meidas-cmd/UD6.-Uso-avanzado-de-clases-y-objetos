package Simulación_de_Cajero_Automático;

public class LimiteDiarioException extends RuntimeException {


    public LimiteDiarioException() {


        super("Estas retirando mas del limite diario:");


    }
}
