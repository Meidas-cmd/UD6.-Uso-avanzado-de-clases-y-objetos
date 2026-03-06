package colecciones;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class Linked_List {

    public static void main(String[] args) {

        Deque<String> cola = new LinkedList<>();

        cola.poll();


        cola.offer("Blessd");
        cola.offer("Yatra");
        cola.offer("Shakira");
        cola.offer("Morat");
        System.out.println("===========");

        System.out.println(cola.poll());
        System.out.println(cola.peek());

        cola.offerFirst("Pirlo");

        System.out.println("===========");

        System.out.println(cola.peek());
        System.out.println(cola.pollLast());

        System.out.println("==========");
        System.out.println("ArrayBlockingQueue");
        Queue<String> cola2 = new ArrayBlockingQueue<>(2);

        cola2.offer("Juan");
        cola2.offer("Jorge");
        cola2.offer("Adrian");

        System.out.println(cola2);








    }



}
