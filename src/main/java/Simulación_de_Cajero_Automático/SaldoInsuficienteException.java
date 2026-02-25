package Simulación_de_Cajero_Automático;

public class SaldoInsuficienteException extends RuntimeException {

    public SaldoInsuficienteException() {

        super("Estas intentado retirar mas del saldo que tiene la cuenta:");

    }


}
