package Práctica_2_Sistema_modernización;

import java.util.ArrayList;
import java.util.Scanner;

public class Copa_del_rey_App {
    static Scanner entrada = new Scanner(System.in);
    ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
    public static void main(String[] args) {



        Jugador jugador1 = new Jugador("Jorge",21,Equipos.ALEVÍN,21,Posiciones.PORTERO);
        Jugador jugador2 = new Jugador("Jorge",21,Equipos.ALEVÍN,21,Posiciones.PORTERO);

        Entrenador  entrenador = new Entrenador("Entrenador",32,Equipos.BENJAMIN,"4-3-3");

        System.out.println(jugador1.getDorsal());



    }
    public void menuMantenimiento(){

        System.out.println("=== App de mantenimiento del Mutxamel FC ===");
        System.out.println(" ");
        System.out.println("[1] - Mantenimiento de jugadores ");
        System.out.println("        Dentro podremos añadir jugadores, modificar datos y añadir acompañantes (solo seniors).(el unico disponible)");
        System.out.println("[2] - Mantenimiento de entrenadores (añadir-modificar-salir");
        System.out.println("        Dentro podremos añadir entrenadores y modificar sus datos.");
        System.out.println("[3] - Mantenimiento masajista (añadir-modificar datos-salir)");
        System.out.println("        Dentro podremos añadir masajistas y modificar sus datos.");
        System.out.println("[4] - Consultar equipos");
        System.out.println("        Dentro se deben listar los tipos de equipos del club y elegir uno.");
        System.out.println("[X] - Salir");
        System.out.println(" ");
        System.out.println("========================");
        System.out.println(" ");
        System.out.println("Selecciona una opcion -->");
        String opc = entrada.nextLine();
        opcionesMantenimiento(opc);

    }

    public void opcionesMantenimiento(String opc){

        switch (opc){

            case "1":
                System.out.println("Esta opcion no esta disponible todavia...");
                break;
            case "2":
                menuMantenimientoEntrenadores();
                break;
            case"3":
                System.out.println("Esta opcion no esta disponible en estos momentos...");
                break;
            case "4":

                break;
            case"X":
                System.out.println("Saliendo... ");
                break;


        }


    }



    public void menuMantenimientoEntrenadores(){

        System.out.println("=== Mantenimiento de Jugadores ===");
        System.out.println(" ");
        System.out.println("[1] - Añadir nuevo entrenador");
        System.out.println("[2] - Modificar datos de entrenador existente:");
        System.out.println("[X] - Salir");
        System.out.println(" ");
        System.out.println("==========");
        System.out.println("Selecciona una opcion -> ");
        String opc2 = entrada.nextLine();

        opcMantenimientoEntrenador(opc2);

    }

    public void opcMantenimientoEntrenador(String opc2){

        switch (opc2){

            case "1":
                añadirEntrenadorlista();
                menuMantenimientoEntrenadores();
                break;
            case "2":

                menuMantenimientoEntrenadores();
                break;
            case "X":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Esa opcion no existe...");



        }
    }

    public void modificarEntrenador(){


    }

    public void añadirEntrenadorlista(){

        System.out.println("Dime el nombre del nuevo entrenador: ");
        String nom = entrada.next();
        entrada.nextLine();
        System.out.println("Dime la edad del entrenador: ");
        int ed = entrada.nextInt();
        entrada.nextLine();
        System.out.println("Dime de que equipo es el entrenador(BENJAMIN,ALEVÍN,INFANTIL,CADETE,JUVENIL,SENIOR):");
        Equipos equip = Equipos.valueOf(entrada.next());
        entrada.nextLine();
        System.out.println("Dime su formacion preferida:N-N-N");
        String form = entrada.next();
        entrada.nextLine();
        Entrenador ente = new Entrenador(nom,ed,equip,form);
        listaEntrenadores.add(ente);
    }
}
