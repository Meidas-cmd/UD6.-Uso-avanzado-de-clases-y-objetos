package Interfaces;

import java.util.ArrayList;

public class VoladoresApp {
    public static void main(String[] args) {

        ArrayList<SuperHeroe> listaHeroes = new ArrayList<>();

        Superman clar_kent = new Superman();
        Pajaro piolin = new Pajaro();

        Spiderman peter_parker = new Spiderman();
        piolin.volar();

        clar_kent.volar();

        clar_kent.rayoLaser();

        listaHeroes.add(clar_kent);

        listaHeroes.add(peter_parker);

        for (SuperHeroe s : listaHeroes){

            if (s instanceof  Superman){
                ((Superman) s).alientoHelado();
                ((Superman) s).rayoLaser();
                ((Spiderman) s).volar();
            }

        }
    }
}
