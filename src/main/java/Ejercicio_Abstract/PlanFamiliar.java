package Ejercicio_Abstract;

public  class PlanFamiliar extends Suscripcion{


    public PlanFamiliar(String nombrePlan, double precio) {
        super(nombrePlan, precio);
    }

    public void mostrarInfo(){

        super.mostrarInfo();

    }

    public void obtenerBeneficios(){

        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");

    }

}
