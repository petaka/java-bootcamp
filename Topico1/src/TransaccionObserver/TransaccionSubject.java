/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TransaccionObserver;

/**
 *
 * @author usuario
 */
public interface TransaccionSubject {

    public void addObserver(TransaccionObserver transaccionObserver);

    public void removeObserver(TransaccionObserver transaccionObserver);

    public void doNotify();
}
