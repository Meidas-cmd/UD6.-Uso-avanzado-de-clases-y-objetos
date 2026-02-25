package Simulación_de_Cajero_Automático;

public class LimiteMinimo extends RuntimeException {
    public LimiteMinimo() {
        super("Tienes que poner un importe superior a 0:");
    }
}
