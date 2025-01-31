/*
 Pensando que en el futuro implementemos el juego de ajedrez para dos jugadores, se desea
crear una clase abstracta llama PiezaAjedrez, con dos atributos enteros llamados fila y columna que
representan sus coordenadas en el tablero (valores entre 0 y 7) y un método abstracto llamado
mover () al que se le pasan como parámetro la fila y columna destino de un movimiento. El método
devolver true si el movimiento se puede realizar o false si es un movimiento erróneo. Implementa
esa clase y sus subclases AlfilAjedrez y TorreAjedrez. Para simplificarlo, vamos a pensar en
movimientos en un tablero vacío, es decir solo con una pieza, la que se está movimiento.
    • Haz un programa que permita al usuario mover una pieza (Alfil o Torre) por el tablero, partiendo de
    la posición 0,0, indicando las coordenadas destino del movimiento que quiere hacer cada vez,
    terminando el programa cuando introduzca fila -1.
    • El programa tendrá una función que presente por pantalla la situación del tablero.
    • Por comodidad, puedes hacer las clases dentro del mismo fichero que el programa. 
 */
package dam107t3e5;

import java.util.Scanner;

public class Main {
    public static char [][] tablero;
    static PiezaAjedrez activa;
    static TorreAjedrez torre;
    static AlfilAjedrez alfil;
    static Scanner teclado;
    
    
    public static void main(String [] args){
        final int FILAS_TABLERO=8;
        final int COLUMNAS_TABLERO=8;
        torre = new TorreAjedrez(0,0);
        alfil = new AlfilAjedrez(0,0);
        tablero= new char[FILAS_TABLERO][COLUMNAS_TABLERO];
        teclado = new Scanner(System.in);
        
        int fila, columna=0, menu;
        do{
            menu();
            menu=teclado.nextInt();
            teclado.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if(menu==1 || menu==2){
                piezaActiva(menu);
                do{
                    llenarTablero();
                    imprimirTablero();
                    do{
                        System.out.println("Dime fila: ");
                        fila=teclado.nextInt();
                        if(fila!=-1){
                            do{
                            System.out.println("Dime columna: ");
                            columna=teclado.nextInt();
                            }while(columna<0 && columna>COLUMNAS_TABLERO);
                        }
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    }while(fila<-1 || fila>=FILAS_TABLERO);
                    if(fila!=-1){
                        if(activa.mover(fila, columna)) System.out.println("Movimiento correcto");
                        else System.out.println("Movimiento incorrecto");
                    }
                }while(fila!=-1);
            }
        }while(menu!=0 || (menu<0 || menu>2));
    }
    
    public static void menu(){
        System.out.println("-----------------------------");
        System.out.println("MENU");
        System.out.println("-----------------------------");
        System.out.println("1 - Torre");
        System.out.println("2 - Alfil");
        System.out.println("0 - Salir");
        System.out.println("-----------------------------");
        System.out.println("Dime Pieza: ");
    }
    public static void imprimirTablero(){
        System.out.println("-----------------------------");
        if(activa instanceof AlfilAjedrez) System.out.println("MOVIENDO ALFIL");
        else System.out.println("MOVIENDO TORRE");
        System.out.println("-----------------------------");
        
        System.out.println("   0  1  2  3  4  5  6  7");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print(i+"  ");
            for (int j = 0; j < tablero[i].length; j++) {
                 System.out.print(tablero[i][j]+"  ");
            }
            System.out.println();
        }
    }
    
      public static void llenarTablero(){
        
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if(torre.fila==i && torre.columna==j){ tablero[i][j]='T';}
                else if (alfil.fila==i && alfil.columna==j) tablero[i][j]='A';
                else tablero[i][j]='*';
            }
        }
    }
      
      public static void piezaActiva(int i){
          if(i==1){ 
                activa = torre; 
                alfil.mover(-1);
                torre.mover();
            }
          else {
                activa=alfil; 
                torre.mover(-1);
                alfil.mover();
          }
       }
}


