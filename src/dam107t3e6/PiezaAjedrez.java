/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e6;

import dam107t3e5.*;

/**
 *
 * @author dam107
 */
public abstract class PiezaAjedrez {
    int fila;
    int columna;
    
    PiezaAjedrez(int fila, int columna){
        this.fila=fila;
        this.columna=columna;
    }
    
    public abstract boolean mover (int filaDestino, int colDestino);
    public abstract void mover (int fuera);
    public abstract void mover ();
}
