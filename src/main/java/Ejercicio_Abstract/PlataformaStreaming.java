package Ejercicio_Abstract;

import java.util.ArrayList;

public class PlataformaStreaming {
    public static void main(String[] args) {

        ArrayList <Suscripcion> listaPlanes = new ArrayList<Suscripcion>();

        PlanGratis plang = new PlanGratis("Plan Gratis",0.00);
        PlanBasico planb = new PlanBasico("Plan Basico",9.99);
        PlanPremium planp = new PlanPremium("Plan Premium",14.99);
        PlanFamiliar planf = new PlanFamiliar("Plan Familiar",19.99);

       listaPlanes.add(planb);
       listaPlanes.add(planf);
       listaPlanes.add(plang);
       listaPlanes.add(planp);

        for (Suscripcion s : listaPlanes){

            s.mostrarInfo();
            s.obtenerBeneficios();
        }



    }
}
