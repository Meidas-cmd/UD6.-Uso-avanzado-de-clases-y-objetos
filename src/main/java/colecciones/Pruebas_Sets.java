package colecciones;

import java.util.*;

public class Pruebas_Sets {
    public static void main(String[] args) {


        String  maleante[] = {"Christian","Joaquin","Carlos","David G"};

        HashSet<String> lista = new HashSet<>(Arrays.asList(maleante));
        LinkedHashSet<String> lista2 = new LinkedHashSet<>(Arrays.asList(maleante));
        TreeSet<String> lista3 = new TreeSet<>(Arrays.asList(maleante));


        System.out.println(lista);

        System.out.println(lista2);

        System.out.println(lista3);
    }

}
