/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Oferta extends Producto {

    public List<Producto> oferta;

    public Oferta(String nombre, float precio, boolean flag) {
        super(nombre, precio, flag);
        oferta = new ArrayList<Producto>();
    }

    public void addProducto(Producto item) {
        oferta.add(item);
    }

    public String toString() {
        Iterator<Producto> it = oferta.iterator();

        StringBuilder builder = new StringBuilder("* ");
        builder.append(nombre);
        while (builder.length() < 35) {
            builder.append(".");
        }
        builder.append("$ ");
        builder.append(precio);
        builder.append("\n");
        while (it.hasNext()) {
            StringBuilder itemBuilder = new StringBuilder("");
            itemBuilder.append("    - ");
            Producto item = it.next();
            itemBuilder.append(item.getNombre());
            while (itemBuilder.length() < 35) {
                itemBuilder.append(".");
            }
            itemBuilder.append("$ ");
            itemBuilder.append(item.getPrecio());
            itemBuilder.append("\n");
            builder.append(itemBuilder.toString());
        }
        return builder.toString();
    }

}
