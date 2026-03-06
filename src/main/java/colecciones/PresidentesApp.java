package colecciones;

public class PresidentesApp {
    public static void main(String[] args) {

        Presidentes donald = new Presidentes("Donald Trump","USA1");
        System.out.println(donald.hashCode());
        Presidentes milei = new Presidentes("Donald Trump","USA1");
        System.out.println(milei.hashCode());


        if (donald.equals(milei)){
            System.out.println("Son iguales");
        }else {

            System.out.println("No son iguales");
        }


    }
}
