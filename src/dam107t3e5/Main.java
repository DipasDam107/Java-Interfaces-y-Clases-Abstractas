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
public class Main {
    public static char [][] tablero;
    public static void main(String [] args){
        final int FILAS_TABLERO=8;
        final int COLUMNAS_TABLERO=8;
        tablero= new char[FILAS_TABLERO][COLUMNAS_TABLERO];
        
        TorreAjedrez torre = new TorreAjedrez();
        
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]='*';
            }
        }
        
        imprimirTablero();
    }
    
    public static void imprimirTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }
}
