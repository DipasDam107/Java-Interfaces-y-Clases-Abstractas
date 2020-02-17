/*
 Modifica la clase PiezaAjedrez (versión _v2) para incluir métodos ¿estáticos? para que el
usuario introduzca la columna como letra (a-h) y la fila (entre 1 y 8) y los convierta a los valores usados
previamente (entre 0 y 7). Esto obligará a generar una nueva versión del programa anterior, para que
el usuario introduzca a-h y 1-8 como valores destino del movimiento.
 */
package dam107t3e6;

import java.util.Scanner;

public class Main {
    public static char [][] tablero;
    static PiezaAjedrez activa;
    static String letras="abcdefgh";
    static TorreAjedrez torre;
    static AlfilAjedrez alfil;
    static Scanner teclado;
    
    public static void main(String [] args){
        final int FILAS_TABLERO=8;
        final int COLUMNAS_TABLERO=8;
        teclado = new Scanner(System.in);
        alfil = new AlfilAjedrez(0,0);
        torre = new TorreAjedrez(0,0);
        tablero= new char[FILAS_TABLERO][COLUMNAS_TABLERO];
        int fila, menu;
        char columna='a';
        
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
                        teclado.nextLine();
                        if(fila!=-1)
                            do{
                                System.out.println("Dime columna: ");
                                columna=teclado.nextLine().charAt(0);
                            }while((letras.indexOf(columna)==-1));
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                    }while(fila==0 || fila<-1 || fila>FILAS_TABLERO);
                    
                    if(fila!=-1){
                        if(activa.mover((fila-1), letras.indexOf(columna))) System.out.println("Movimiento correcto");
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
        
        System.out.println("   a  b  c  d  e  f  g  h");
        for (int i = 0; i < tablero.length; i++) {
            System.out.print((i+1)+"  ");
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


