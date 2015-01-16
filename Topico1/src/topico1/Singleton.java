/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1;

/**
 *
 * @author usuario
 */
public class Singleton {

    private static Singleton singleton = null;
    private int numeroTransaccion = 0;

    private Singleton() {

    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

    public int returnNumeroTransaccion() {
        return numeroTransaccion;
    }
}
