/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1.MetodoPago;

/**
 *
 * @author usuario
 */
public class PagoTarjeta extends MetodoPago {

    private String nombre;
    private long numero;
    private String fechaVencimiento;
    private String nombreTitular;

    public PagoTarjeta() {
        nombre = "Pago Tarjeta";
        numero = 0;
        fechaVencimiento = "";
        nombreTitular = "";
    }

    public PagoTarjeta(String nombre, long numero, String fechaVencimiento, String nombreTitular) {
        this.nombre = nombre;
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.nombreTitular = nombreTitular;
    }

    public String getNombre() {
        return nombre;
    }

    public long getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public void setFechaVencimiento(String fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    @Override
    public String toString() {
        return "PagoTarjeta{" + "nombre=" + nombre + ", numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + ", nombreTitular=" + nombreTitular + '}';
    }

}
