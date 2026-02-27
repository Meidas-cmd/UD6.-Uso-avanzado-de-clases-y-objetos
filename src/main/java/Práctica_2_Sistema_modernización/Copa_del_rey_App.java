package Práctica_2_Sistema_modernización;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Copa_del_rey_App {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Entrenador> listaEntrenadores = new ArrayList<>();
    public static void main(String[] args) {



        Jugador jugador1 = new Jugador("Jorge",21,Equipos.ALEVÍN,21,Posiciones.PORTERO);
        Jugador jugador2 = new Jugador("Jorge",21,Equipos.ALEVÍN,21,Posiciones.PORTERO);

        Entrenador  entrenador = new Entrenador("Entrenador",32,Equipos.BENJAMIN,"4-3-3");

        System.out.println(jugador1.getDorsal());
        System.out.println(jugador2.getDorsal());



        menuMantenimiento();

    }
    public static void menuMantenimiento(){

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

    public static void opcionesMantenimiento(String opc){

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
                consultarEquipos();
                break;
            case"X":
                System.out.println("Saliendo... ");
                break;


        }


    }

    public static void consultarEquipos(){
        int id = 0;

        System.out.println("Eqquipos: ");
        for (Equipos eq1 : Equipos.values()){

            System.out.println("Id del equipo: " + id + ",  Equipo: " + eq1.name());

        }

        System.out.println("Cual elijes: ");
        Equipos equipo = Equipos.valueOf(entrada.nextLine());


        for (Jugador j : Jugador.listaDorsales){
            if (equipo == j.getCategoria()){
                System.out.println("Jugador: " + j.getNombre() + "- Dorsal: " + j.getDorsal() + "- pertenece al equipo.");
            }
        }
    }



    public static void menuMantenimientoEntrenadores(){

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

    public static void opcMantenimientoEntrenador(String opc2){

        switch (opc2){

            case "1":
                añadirEntrenadorlista();
                menuMantenimientoEntrenadores();
                break;
            case "2":
                modificarEntrenador();
                menuMantenimientoEntrenadores();
                break;
            case "X":
                System.out.println("Volviendo...");
                menuMantenimiento();
                break;
            default:
                System.out.println("Esa opcion no existe...");



        }
    }

    public static void modificarEntrenador(){

        int ids = 0;

        System.out.println(" === Mantenimiento de Jugadores ===");
        System.out.println(" ");
        System.out.println("¿De que entrenador quieres hacer cambios?");
        System.out.println(" ");
        for (Entrenador e : listaEntrenadores){

            System.out.println("Id del entrenador: " + ids +"Nombre: "  + e.getNombre() + " Edad: " + e.getEdad() + ", Equipo: " + e.getEquipo() + ", FormacionPreferiada: " + e.getFormacionPreferida());

        }
        System.out.println(" ");
        System.out.println("================================");
        String en = entrada.nextLine();
        opcModificarEntrenador(en);

    }

    public static void opcModificarEntrenador(String e){

        String dato = "";

        System.out.println("=== Mantenimiento de Entrenadores. Modificar datos de Entrenador existente ===");
        System.out.println(" ");
        System.out.println("Modificando jugador: " + listaEntrenadores.get(Integer.parseInt(e)).toString());
        System.out.println(" ");
        System.out.println("¿Que dato quieres modificar? [Nombre,Edad,Equipo,Formacion]");
        System.out.println(" ");
        System.out.println("========================");
        System.out.print("Selecciona una opción --> ");
        String res = entrada.nextLine();


        switch (res.toLowerCase()){

            case "nombre":
                System.out.println("Introduce el nuevo nombre del entrenador:");
                dato = entrada.nextLine();
                listaEntrenadores.get(Integer.parseInt(e)).setNombre(dato);
                break;

            case "edad":
                System.out.println("Introduce la nueva edad del entrenador:");
                dato = entrada.nextLine();
                listaEntrenadores.get(Integer.parseInt(e)).setEdad(Integer.parseInt(dato));
                break;

            case "equipo":
                boolean est = false;
                System.out.println("Introduce el nuevo Equipo del entrenador: ");
                dato = entrada.nextLine();
                for (Equipos eq : Equipos.values()){
                    if (eq.name().equalsIgnoreCase(dato)){
                        est = true;
                       }
                }
                if (est){
                    System.out.println("Actualizando equipo...");
                    listaEntrenadores.get(Integer.parseInt(e)).setEquipo(Equipos.valueOf(dato.toUpperCase()));
                }else{
                    System.out.println("El equipo no existe dentro de nuestros datos, intentelo de nuevo");
                    opcModificarEntrenador(e);
                }

                break;

            case "formacion":
                System.out.println("Introduce la nueva formacion preferiada del entrenador FORMATO-->N-N-N");
                dato = entrada.nextLine();
                listaEntrenadores.get(Integer.parseInt(e)).setFormacionPreferida(dato);
                break;

            case"x":
                System.out.println("Volviendo atras...");
                menuMantenimientoEntrenadores();
                break;

            default:
                System.out.println("Ese atributo no existe intentalo de nuevo:");
                opcModificarEntrenador(e);
                break;
        }


    }


    public static void añadirEntrenadorlista(){
        boolean est = true;
        Equipos equip = null;

        System.out.println("Dime el nombre del nuevo entrenador: ");
        String nom = entrada.next();
        entrada.nextLine();
        System.out.println("Dime la edad del entrenador: ");
        int ed = entrada.nextInt();
        entrada.nextLine();
        while (est) {
            System.out.println("Dime de que equipo es el entrenador (BENJAMIN, ALEVÍN, INFANTIL, CADETE, JUVENIL, SENIOR):");
            String equi = entrada.nextLine().toUpperCase();

            try {
                equip = Equipos.valueOf(equi);
                est = false;
            } catch (IllegalArgumentException e) {
                System.out.println("Equipo no válido. Inténtalo otra vez.");
            }
        }
        System.out.println("Dime su formacion preferida:N-N-N");
        String form = entrada.next();
        entrada.nextLine();
        Entrenador ente = new Entrenador(nom,ed,equip,form);
        listaEntrenadores.add(ente);
    }
}
