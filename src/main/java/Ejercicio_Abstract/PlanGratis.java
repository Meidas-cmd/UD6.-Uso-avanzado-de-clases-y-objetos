package Ejercicio_Abstract;

public class PlanGratis extends Suscripcion{
    public PlanGratis(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    public void mostrarInfo(){

        super.mostrarInfo();

    }

    public void obtenerBeneficios(){

        System.out.println("Acceso limitado con anuncios.");

    }
}
