/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1;

import java.util.Iterator;
import topico1.Descuento.Context;
import topico1.Descuento.DescuentoStrategy;
import topico1.MetodoPago.MetodoPago;
import topico1.MetodoPago.PagoFactory;
import topico1.Descuento.*;
import topico1.MetodoPago.*;

/**
 *
 * @author usuario
 */
public class Carrito {

    public long id;
    public Lista productos;  //items añadidos al carrito
    public MetodoPago metodo; //modo de pago
    public float total;

    public Carrito(Singleton singleton, String metodo) {
        this.id = singleton.returnNumeroTransaccion() + 1;
        this.metodo = new PagoFactory().getPaymentMethod(metodo);
        this.productos = new Lista();
        this.total = getTotal();
    }

    public void addProducto(Producto item) {
        productos.addItem(item);
    }

    public Lista getProductos() {
        return productos;
    }

    public void setTotal() {
        Context context;
        DescuentoStrategy strategy;

        if (this.metodo.getClass() == PagoEfectivo.class) {
            strategy = new EfectivoStrategy();
            context = new Context(this.productos, strategy);
            total = context.getTotal();
        } else {
            if (this.metodo.getClass() == PagoPayPal.class) {
                strategy = new PayPalStrategy();
                context = new Context(this.productos, strategy);
                total = context.getTotal();
            } else {
                strategy = new TarjetaStrategy();
                context = new Context(this.productos, strategy);
                total = context.getTotal();
            }
        }
    }

    public float getTotal() {
        return total;
    }

    public float getSubTotal() {
        Iterator<Producto> it = productos.iterator();
        float subtotal = 0;
        while (it.hasNext()) {
            subtotal += it.next().getPrecio();
        }
        return subtotal;
    }

    public String mostrarLista() {

        String res = "";

        if (productos == null) {
            return "";
        } else {
            Iterator<Producto> it = productos.iterator();

            while (it.hasNext()) {

                res += "\n" + it.next().toString();
            }

            return res;
        }
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {

        return "Número de carrito: " + id + "\n"
                + "Productos: " + mostrarLista() + "\n"
                + "Modo de pago: " + metodo + "\n"
                + "Subtotal: " + getSubTotal() + "\n"
                + "Total a pagar: " + total;
    }

}
