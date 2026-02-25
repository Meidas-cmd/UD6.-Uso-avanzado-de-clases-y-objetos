package Ejercicio_Dispositivos_Inteligentes;

public abstract class Dispositivo {




    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre, boolean estado) {
        this.nombre = nombre;
        this.estado = estado;
    }

    public abstract void encender();

    public   void apagart(Dispositivo d){

        if (d.getEstado()){
            d.setEstado(false);
            System.out.println(nombre + " apagando...");
        }else {
            System.out.println(nombre + " ya esta apagado...");
        }
    }

    public void mostrarEstado(Dispositivo d){
        System.out.println("El estado actual del dispositivo es  " + d.getEstado() );
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}
