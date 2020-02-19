/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e12;

/**
 *
 * @author dam107
 */
public interface Habitacion {
    final double PRECIO_LOWCOST=50;
    final double PRECIO_DOBLE=100;
    final double INCREMENTO_SALIDA_DOBLE=0.2;
    final double PRECIO_SUIT=150;
    double checkOut();
    boolean checkIn();
    
}
