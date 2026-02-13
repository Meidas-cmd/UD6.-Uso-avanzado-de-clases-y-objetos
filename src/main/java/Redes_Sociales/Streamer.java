package Redes_Sociales;

public class Streamer extends Usuario{

    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nom_usu, int seguidores,int numero_retransmisiones, int horas_directo) {
        super(nombre, edad, nom_usu, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;

    }
    public int getNumero_retransmisiones() {
        return numero_retransmisiones;
    }

    public void setNumero_retransmisiones(int numero_retransmisiones) {
        this.numero_retransmisiones = numero_retransmisiones;
    }

    public int getHoras_directo() {
        return horas_directo;
    }

    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Informacion del Streamer: ");
        super.mostrarInfo();
        System.out.println("Retransmisiones realizadas: " + numero_retransmisiones);
        System.out.println("Horas de directo: " + horas_directo);

    }

    @Override
    public String toString() {
        return "Streamer{" +
                "numero_retransmisiones=" + numero_retransmisiones +
                ", horas_directo=" + horas_directo +
                '}';
    }
}
