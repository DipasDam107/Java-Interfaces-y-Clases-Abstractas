/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e8;

import dam107t3e3_V1.*;

/**
 *
 * @author dam107
 */
public class Cilindro implements Figura3D {
    private double radio;
    private double altura;
    
    Cilindro (double radio, double altura){
        this.radio=radio;
        this.altura=altura;
    }

    @Override
    public double volumen() {
       return PI*Math.pow(radio, 2)*altura;
    }

    @Override
    public double superficie() {
      return 2*PI*radio*altura + 2*PI*Math.pow(radio, 2);
    }
    
}
