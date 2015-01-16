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
public class PagoPayPal extends MetodoPago {

    private String nombre;
    private String usuario;
    private String pass;

    public PagoPayPal() {
        nombre = "Pago PayPal";
        usuario = "";
        pass = "";
    }

    public PagoPayPal(String nombre, String usuario, int numeroCuenta) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.pass = pass;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return pass;
    }

    public void setPassword(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "PagoPayPal{" + "nombre=" + nombre + ", usuario=" + usuario + ", numeroCuenta=" + pass + '}';
    }

}
