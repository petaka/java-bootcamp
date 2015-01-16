/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1;

import TransaccionObserver.TransaccionObserver;
import TransaccionObserver.TransaccionSubject;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Lista implements TransaccionSubject {

    List<Producto> itemsLista;
    Set<TransaccionObserver> transaccionObservers;
    String notificacion = "";

    public Lista() {
        itemsLista = new ArrayList<Producto>();
        transaccionObservers = new HashSet<TransaccionObserver>();
    }

    public void addItem(Producto producto) {
        itemsLista.add(producto);
    }

    public Iterator<Producto> iterator() {
        return new ProductoIterator();
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
            TransaccionObserver transaccionObservers = it.next();
            transaccionObservers.doUpdate(notificacion);
        }
    }

    class ProductoIterator implements Iterator<Producto> {

        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if (currentIndex >= itemsLista.size()) {
                return false;
            } else {
                return true;
            }
        }

        @Override
        public Producto next() {
            return itemsLista.get(currentIndex++);
        }

        @Override
        public void remove() {
            itemsLista.remove(--currentIndex);
        }

    }

}
