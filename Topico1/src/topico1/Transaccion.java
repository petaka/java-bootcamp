/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1;

import TransaccionObserver.TransaccionObserver;
import TransaccionObserver.TransaccionSubject;
import java.util.*;

/**
 *
 * @author usuario
 */
public class Transaccion implements TransaccionSubject {

    Set<TransaccionObserver> transaccionObservers;
    long numero;
    double total;
    Carrito carrito;

    public Transaccion(Carrito carrito) {
        numero = carrito.getId();
        total = carrito.getTotal();
        this.carrito = carrito;
        transaccionObservers = new HashSet<TransaccionObserver>();
    }

    @Override
    public void addObserver(TransaccionObserver transaccionObserver) {
        transaccionObservers.add(transaccionObserver);
    }

    @Override
    public void removeObserver(TransaccionObserver transaccionObserver) {
        transaccionObservers.remove(transaccionObserver);
    }

    @Override
    public void doNotify() {
        Iterator<TransaccionObserver> it = transaccionObservers.iterator();
        while (it.hasNext()) {
            TransaccionObserver cartObserver = it.next();
            cartObserver.doUpdate("Numero de transaccion: " + numero);
        }
    }
}
