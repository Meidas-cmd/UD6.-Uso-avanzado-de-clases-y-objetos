package Práctica_2_Sistema_modernización;

public class AppMutxamelFC {
    public static void main(String[] args) {

        Jugador jugador1 = new Jugador("Jorge",21,Equipos.SENIOR,23,Posiciones.PORTERO);
        Jugador jugador2 = new Jugador("Jorge",21,Equipos.SENIOR,21,Posiciones.PORTERO);
        Jugador jugador3 = new Jugador("Jorge",21,Equipos.SENIOR,25,Posiciones.PORTERO);
        Jugador jugador4 = new Jugador("Jorge",21,Equipos.SENIOR,26,Posiciones.PORTERO);


        Entrenador pep = new Entrenador("Pepe",34,Equipos.SENIOR,"4-3-2");

        Masajista christian = new Masajista("Christian",45,"Tiutlos?",3);

        Acompañante mama = new Acompañante("Madre de christian",34,jugador4,"Pareja");

        System.out.println("==========================");
        jugador1.concentrarse();
        pep.concentrarse();
        christian.concentrarse();
        mama.concentrarse();
        System.out.println("==========================");

        jugador3.entrenar();
        pep.entrenar();
        System.out.println("==========================");

        christian.darMasaje(jugador2);
        System.out.println("==========================");

        jugador4.viajar("Madrid");
        pep.viajar("Madrid");
        christian.viajar("Madrid");
        mama.viajar("Madrid");
        System.out.println("==========================");

        pep.planificarEntrenamiento();
        System.out.println("==========================");

        jugador3.entrenar();
        pep.entrenar();
        System.out.println("==========================");

        jugador3.descansar();
        System.out.println("==========================");

        jugador1.calentar();
        System.out.println("==========================");

        jugador2.jugarPartido("Albacete");
        System.out.println("==========================");

        mama.animarEquipo();
        System.out.println("==========================");

        pep.hacerCambios();
        System.out.println("==========================");

        jugador3.marcarGol();
        System.out.println("==========================");

        jugador3.celebrarGol();
        pep.celebrarGol();
        mama.celebrarGol();
        christian.celebrarGol();
        System.out.println("==========================");

        christian.darMasaje(jugador2);
        christian.darMasaje(jugador1);
        christian.darMasaje(jugador4);
        System.out.println("==========================");

        jugador4.viajar("Mutxamel");
        pep.viajar("Mutxamel");
        christian.viajar("Mutxamel");
        mama.viajar("Mutxamel");
        System.out.println("==========================");

        jugador3.descansar();
        jugador1.descansar();
        System.out.println("==========================");

    }
}
