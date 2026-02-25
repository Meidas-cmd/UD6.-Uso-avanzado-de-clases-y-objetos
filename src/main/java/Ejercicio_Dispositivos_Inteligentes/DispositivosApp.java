package Ejercicio_Dispositivos_Inteligentes;

import java.util.ArrayList;

public class DispositivosApp {
    public static void main(String[] args) {
        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();

        Televisor lg32 = new Televisor("Televisor lg 32 pulgadas xd pro max",true);

        AireAcondicionado aire = new AireAcondicionado("Soplavientos 3000 enfriador magico",false);

        ParlanteInteligente jb = new ParlanteInteligente("JB brasileiro megatron 200",false);

        listaDispositivos.add(lg32);
        listaDispositivos.add(aire);
        listaDispositivos.add(jb);

        lg32.encender();

        aire.encender();

        jb.encender();

        for (Dispositivo d : listaDispositivos){
            if (d instanceof ControlRemoto){
                ((ControlRemoto) d).sincronizar();
            }
            System.out.println("");
        }
        System.out.println("");
        for (Dispositivo d : listaDispositivos){
            d.mostrarEstado(d);
            d.apagart(d);
            System.out.println("");
        }


    }
}
