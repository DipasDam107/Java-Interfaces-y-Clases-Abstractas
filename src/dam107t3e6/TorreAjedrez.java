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
public class TorreAjedrez extends PiezaAjedrez {
    
    TorreAjedrez(int fila, int columna){
        super(fila, columna);
    }
    
    @Override
    public boolean mover(int filaDestino, int colDestino) {
        if(filaDestino==this.fila || colDestino==this.columna){
            this.fila=filaDestino;
            this.columna=colDestino;
            return true;
        }
        else return false;
           
    }
    
    @Override
    public void mover(int fuera) {
            this.columna=fuera;
            this.fila=fuera;    
    }
    
     @Override
    public void mover() {
            this.columna=0;
            this.fila=0;      
    }
    
}
