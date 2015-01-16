/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topico1.MetodoPago;

/**
 *
 * @author usuario
 */
public class PagoFactory {

    public MetodoPago getPaymentMethod(String tipo) {

        if (tipo.equalsIgnoreCase("efectivo")) {

            return new PagoEfectivo();

        } else {
            if (tipo.equalsIgnoreCase("paypal")) {

                return new PagoPayPal();
            } else {
                return new PagoTarjeta();

            }
        }
    }

}
