package ejercicio_enum;

import java.net.NoRouteToHostException;
import java.util.concurrent.CopyOnWriteArraySet;

public enum Semaforo {
    AMARILLO,ROJO,VERDE;
    public final Semaforo siguiente(){

        switch (this) {

            case AMARILLO:
                return VERDE;
            case ROJO:
                return AMARILLO;
            case VERDE:
                return ROJO;
            default:
                System.out.println("Esta opcion no existe: ");
                break;

        }


        return null;
    }
}
