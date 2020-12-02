
package com.mycompany.encuentradescuento;

/**
 *
 * @author Rafa
 */
public class Descuentos {
    public double discount (int precio, int porcentaje) {
        return precio - ((precio * porcentaje)/100);
    }
}