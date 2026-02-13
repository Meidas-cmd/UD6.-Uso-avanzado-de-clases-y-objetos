package Redes_Sociales;

public class Basico extends Usuario{
    public Basico(String nombre, int edad, String nom_usu, int seguidores) {
        super(nombre, edad, nom_usu, seguidores);
    }
    @Override
    public void mostrarInfo(){
        System.out.println("Informacion del basico:");
        super.mostrarInfo();

    }
}
