/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e10;

import dam107t3e9.*;

/**
 *
 * @author dam107
 */
public class BallenaAzul implements Nadador{
    int edad;
    
    BallenaAzul(int edad){
        this.edad=edad;
    }
    
    @Override
    public double tiempoRecorrido(int metros) {
        double km=metros/1000d;
        int vel;
        if(edad>5) vel=10;
        else vel=13;  
        return km/vel;
        
    }
    
}
