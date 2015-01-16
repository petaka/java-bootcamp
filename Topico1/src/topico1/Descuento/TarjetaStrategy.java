/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1.Descuento;

import java.util.Iterator;
import topico1.Lista;
import topico1.Producto;

/**
 *
 * @author usuario
 */
public class TarjetaStrategy implements DescuentoStrategy {

    float total = 0, precio = 0;
    Producto actual;

    @Override
    public float calcularTotal(Lista productos) {

        Iterator<Producto> iterador = productos.iterator();
        while (iterador.hasNext()) {
            actual = iterador.next();
            precio = actual.getPrecio();
            total += precio;
        }
        total = total / 10;
        return total;

    }

}
