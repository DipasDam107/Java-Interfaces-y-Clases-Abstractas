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
public class Esfera extends Figura3D{
 private static final double PI = 3.1416;
 private double radio;
 
    Esfera(double radio){
        this.radio=radio;
    }
    
    public double volumen() {
        return (4/3)*PI*Math.pow(radio,2);
    }
 
}
