/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e3_V1;

import dam107t3e2_V1.*;

/**
 *
 * @author dam107
 */
public class Esfera extends Figura3D{
 private double radio;
 
    Esfera(double radio){
        this.radio=radio;
    }
    
    @Override
    public double volumen() {
        return (4/3)*PI*Math.pow(radio,2);
    }

    @Override
    public double superficie() {
       return 4*PI*Math.pow(radio,2);
    }
 
}
