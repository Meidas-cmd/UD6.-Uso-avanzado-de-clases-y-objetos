package Ejercicio_Abstract;

public class PlanPremium extends Suscripcion{
    public PlanPremium(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }
    public void mostrarInfo(){

        super.mostrarInfo();

    }

    public void obtenerBeneficios(){

        System.out.println("Acceso a todo el contenido en alta definición y descargas offline.");

    }
}
