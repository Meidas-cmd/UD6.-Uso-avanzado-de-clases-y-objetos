package colecciones;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Ejercicio3_Colas {

    public static void main(String[] args) {

        Queue<String> spotify = new LinkedList<>();
        spotify.offer("Bandolero");
        spotify.offer("Hello Coto");
        spotify.offer("Rockstar");

        System.out.println("Canciones de la playlist: " + spotify);

        while(!spotify.isEmpty()) {
            System.out.println("Reproduciendo : " + spotify.poll());
            System.out.println("Canciones de la playlist: " + spotify);

        }
        System.out.println("Ya no hay canciones...");

    }
}
