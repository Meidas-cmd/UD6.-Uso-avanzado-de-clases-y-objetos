package Ejercicio_Dispositivos_Inteligentes;

public class ParlanteInteligente extends Dispositivo{
    public ParlanteInteligente(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void encender() {
        if (getEstado()){
            System.out.println("El parlante ya está encendido.");
        }else {
            System.out.println("Activando parlante con comando de voz...");
            setEstado(true);
        }
    }
}
