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
public class Mail implements TransaccionObserver {

    String mail;

    public Mail() {
        mail = "direcciondemail";
    }

    public Mail(String mail) {
        this.mail = mail;
    }

    @Override
    public void doUpdate(String notification) {
        System.out.println("Se le ha enviado un mail respecto a: " + notification);
    }

}
