package colecciones;

import java.util.HashMap;

public class AceptaElReto_Mapas_Toro {
    static java.util.Scanner entrada;

    public static boolean casoDePrueba() {

        HashMap<String,String>  notas  = new HashMap<>();
        int veces = entrada.nextInt();
        entrada.nextLine();

        if (veces <= 0)
        return false;
        else {
            for (int i = 0; i < veces; i++) {
                String nom = entrada.nextLine();
                String nota = entrada.nextLine().toUpperCase();
                if (notas.containsKey(nom)){
                    if (nota.equals("CORRECTO")){
//                        notas.put(nom,)
                    }
                }

            }

            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        entrada = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main
}
