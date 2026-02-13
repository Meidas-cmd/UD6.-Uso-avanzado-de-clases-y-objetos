package Redes_Sociales;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> listaColaboraciones;

    public Influencer(String nombre, int edad, String nom_usu, int seguidores) {
        super(nombre, edad, nom_usu, seguidores);
        listaColaboraciones = new ArrayList<>();
    }

    public ArrayList<String> getListaColaboraciones() {
        return listaColaboraciones;
    }

    public void setListaColaboraciones(ArrayList<String> listaColaboraciones) {
        this.listaColaboraciones = listaColaboraciones;
    }

    public void agregarColaboracion(String colaboracion){

        listaColaboraciones.add(colaboracion);

    }
    @Override
    public void mostrarInfo(){
        System.out.println("Informacion del Influencer: ");
        super.mostrarInfo();
        System.out.print("Colaboraciones: " );
        for (String c : listaColaboraciones){
            System.out.println(c);

        }

    }

}
