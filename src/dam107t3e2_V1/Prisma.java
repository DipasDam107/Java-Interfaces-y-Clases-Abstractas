/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e2_V1;

/**
 *
 * @author dam107
 */
public class Prisma extends Figura3D {
    private double longitud;
    private double ancho;
    private double altura;
    
    Prisma(double longitud, double ancho, double altura){
        this.longitud=longitud;
        this.ancho=ancho;
        this.altura=altura;
    }
    public double volumen() {
        return (ancho*longitud)*altura;
    }
    
}
