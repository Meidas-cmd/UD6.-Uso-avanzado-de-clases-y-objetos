package Práctica_Sistema_de_pago;
/**
 * Clase abstracta que define la estructura base para los diferentes métodos de pago.
 * @author Jorge Cuartero Giner
 * @version 1.0
 */
public abstract class MetodoPago {


    /**
     * Procesa el pago de un importe específico.
     * @param importe Cantidad de dinero a procesar en la transacción.
     */
    public abstract void proceasrPago(double importe);




}
