package colecciones;

import java.util.HashMap;
import java.util.Map;

public class AceptaElReto_Mapas {

    static java.util.Scanner entrada;

    public static boolean casoDePrueba() {


        Integer fin_num = 0;
        Integer fin_veces = 0;
        HashMap<Integer,Integer> numeros = new HashMap<>();
        int num = entrada.nextInt();
        entrada.nextLine();
        if (num <= 0)
        return false;
        else {

            String numeross = entrada.nextLine();
            for (String m : numeross.split(" ")){

                if (numeros.containsKey(Integer.parseInt(m))){
                    numeros.put(Integer.parseInt(m),numeros.get(Integer.parseInt(m))+1);
                }else {
                    numeros.put(Integer.parseInt(m),1);

                }

            }

            for (Map.Entry<Integer,Integer> m : numeros.entrySet()){

                if (m.getValue() > fin_veces){

                    fin_veces = m.getValue();
                    fin_num = m.getKey();
                }

            }

            System.out.println(fin_num);




            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    }
}
