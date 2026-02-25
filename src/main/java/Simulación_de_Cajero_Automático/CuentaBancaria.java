package Simulación_de_Cajero_Automático;

public class CuentaBancaria {


    private double saldo;

    public CuentaBancaria (double saldo){

        this.saldo = saldo;


    }


    public void ingresasDinero(double ingreso){
        if (ingreso > 3000){
            throw new DepositoMaximoException();
        }else if (ingreso <= 0 ){
            throw new LimiteMinimo();
        }
        else{
            saldo += ingreso;
            System.out.println("Ingreso realizado correctamente: ");
            System.out.println("Saldo total:" + saldo);
        }
    }
    public void retirarDinero(double retirar){
        if (retirar > saldo) {
        throw new SaldoInsuficienteException();
        } else if (retirar > 600) {
        throw  new LimiteDiarioException();
        }else if (retirar <= 0 ){
            throw new LimiteMinimo();
        } else {
            saldo -= retirar;
            System.out.println("Retirada realizada correctamente: ");
            System.out.println("Saldo total:" + saldo);
        }
    }

    public void consultarSaldo(){

        System.out.println("El saldo total es " + saldo);
    }

}
