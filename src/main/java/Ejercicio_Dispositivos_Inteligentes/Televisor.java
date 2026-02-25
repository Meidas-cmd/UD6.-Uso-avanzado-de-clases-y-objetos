package Ejercicio_Dispositivos_Inteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{


    public Televisor(String nombre, boolean estado) {
        super(nombre, estado);
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }

    @Override
    public void encender() {
        if (getEstado()){
            System.out.println("El televisor ya esta encendido");
        }else {
            System.out.println("Encendiendo televisor...");
            setEstado(true);
        }
    }
}
