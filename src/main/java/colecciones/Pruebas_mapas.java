package colecciones;

import java.util.HashMap;
import java.util.Map;

public class Pruebas_mapas {
    public static void main(String[] args) {


        HashMap<String,String> concejales = new HashMap<>();

        concejales.put("Enrique Pastor","Juventud y tiempo libre");

        concejales.put("Monica gil cano","Familia, Juventud, Fiestas, Parques y Jardines");

        System.out.println(concejales.keySet());
        System.out.println(concejales.values());
        System.out.println(concejales.get("Enrique Pastor"));


        for (Map.Entry<String,String> m : concejales.entrySet()){


            System.out.println("El concejal " + m.getKey() + " tiene el cargo " + m.getValue() );


        }
    }
}
