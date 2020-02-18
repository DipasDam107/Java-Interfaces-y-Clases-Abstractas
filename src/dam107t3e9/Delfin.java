/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e9;

/**
 *
 * @author dam107
 */
public class Delfin implements Nadador {
    
    
    @Override
    public double tiempoRecorrido(int metros){
        int velocidadkm = (int)(Math.random()*31)+40;
        double km = metros/1000d;
        
        
        return km/velocidadkm;
    }
}
