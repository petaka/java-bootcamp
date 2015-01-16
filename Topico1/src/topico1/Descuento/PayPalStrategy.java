/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1.Descuento;

import java.util.Iterator;
import topico1.Lista;
import topico1.Producto;

public class PayPalStrategy implements DescuentoStrategy {

    Producto actual;
    float total = 0, menor = 1000000, precio = 0;

    @Override
    public float calcularTotal(Lista productos) {

        Iterator<Producto> iterador = productos.iterator();

        while (iterador.hasNext()) {
            actual = iterador.next();
            precio = actual.getPrecio();

            if (menor > precio) {
                menor = precio;
            }
            total += precio;
        }
        total = total - menor;
        return total;
    }

}
