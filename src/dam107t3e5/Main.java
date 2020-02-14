/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e5;

import java.util.Scanner;

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
        Scanner teclado = new Scanner(System.in);
        int fila, columna;
        
        TorreAjedrez torre = new TorreAjedrez();
         
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                tablero[i][j]='*';
            }
        }
        
        do{
            tablero[torre.fila][torre.columna]='T';
            imprimirTablero();
            do{
                System.out.println("Dime fila: ");
                fila=teclado.nextInt();
                System.out.println("Dime columna: ");
                columna=teclado.nextInt();
            }while(fila<-1 || fila>=FILAS_TABLERO || columna<0 || columna>=COLUMNAS_TABLERO );
        if(fila!=-1){
            if(torre.mover(fila, columna)) System.out.println("Movimiento correcto");
            else System.out.println("Movimiento incorrecto");
        }
        }while(fila!=-1);
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
