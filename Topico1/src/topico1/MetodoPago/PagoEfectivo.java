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
public class PagoEfectivo extends MetodoPago {

    private String nombre;

    public PagoEfectivo() {
        this.nombre = "Pago Efectivo";
    }

    public PagoEfectivo(String name) {
        this.nombre = name;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "PagoEfectivo{" + "nombre=" + nombre + '}';
    }

}
