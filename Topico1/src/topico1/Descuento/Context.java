/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1.Descuento;

import topico1.Lista;

/**
 *
 * @author usuario
 */
public class Context {

    public DescuentoStrategy strategy;
    public Lista productos;

    public Context(Lista productos, DescuentoStrategy strategy) {
        this.productos = productos;
        this.strategy = strategy;
    }

    public void setStrategy(DescuentoStrategy strategy) {
        this.strategy = strategy;
    }

    public Lista getProductos() {
        return productos;
    }

    public float getTotal() {
        return strategy.calcularTotal(productos);
    }

}
