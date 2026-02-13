package Ejercicio_Abstract;

public  abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan, double precio){

        this.nombrePlan = nombrePlan;
        this.precio = precio;

    }

    public void mostrarInfo(){

        System.out.println("Plan: " + nombrePlan );
        System.out.println("Precio: " + precio+ "€");

    }

    public  void  obtenerBeneficios(){

        System.out.println("Beneficios del plan: ");
    }


    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Suscripcion{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }
}
