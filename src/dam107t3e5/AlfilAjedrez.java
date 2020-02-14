/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e5;

/**
 *
 * @author dam107
 */
public class AlfilAjedrez extends PiezaAjedrez{
    
    AlfilAjedrez(){
        super(0, 0);
    }
    
    @Override
    public boolean mover(int filaDestino, int colDestino) {
        if(Math.abs(fila-filaDestino)==Math.abs(columna-colDestino))
             return true;
        else
             return false;
    }
    
}
