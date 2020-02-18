/*
 Desarrolla una interfaz llamada Ciclista con un método llamado recorrer a la que se le pasa un
número de kilómetros, una cadena con tipo de terreno y devuelve los segundos que tarda en recorrerlo.
Una interfaz llamada Nadador con un método llamado nadar a la que se le pasan metros y devuelve los
segundos en recorrerlo, y por último otra interfaz llamada Saltador con un método saltarAltura que no
recibe parámetros y que devuelve los centímetros saltados.
    • Desarrolla una clase Delfin que implemente la interfaz Nadador. El tiempo en recorrer una
    distancia es aleatorio entre 40km/h y 70km/hora
    • Desarrolla una clase BallenaAzul que implemente la interfaz Nadador. El tiempo en recorrer una
    distancia es de 10km/h para las mayores de 5 años y 13km/h para las menores.
    • Desarrolla una clase TriAtleta que implemente las tres interfaces, con los criterios que tu
    consideres (pueden devolver valores aleatorios entre unos mínimos y máximos que tú decidas o
    tener en cuenta otros parámetros como edad, sexo, etc.).
    • Realiza un programa que cree instancias de delfines, ballenas azules y triatletas y use los métodos
    desarrollados.
 */
package dam107t3e9;

import java.util.Scanner;


public class Main {
    static Scanner teclado = new Scanner(System.in);
    static BallenaAzul ballenita;
    static TriAtleta tritleta;
    static TriAtleta tritleta2;
    static Delfin delfin;
    public static void main(String [] args){
        ballenita=new BallenaAzul(15);
        tritleta=new TriAtleta(25, "Hombre");
        delfin=new Delfin();
        
        //DELFIN
        System.out.println("--------------------------------------");
        System.out.println("DELFIN");
        System.out.println("--------------------------------------");
        System.out.println("Un delfin recorre 2000m en "+ (delfin.tiempoRecorrido(2000)*3600) + "h");
        System.out.println("\n");
        
        //TRIATLETA
        System.out.println("--------------------------------------");
        System.out.println(tritleta.sexo + " de edad " + tritleta.edad);
        System.out.println("--------------------------------------");
        System.out.printf("Tarda %.2f segundos en nadar dos KM \n",(tritleta.tiempoRecorrido(2000)*3600)  );
        System.out.printf("Tarda %.2f segundos en recorrer Tierra 20KM en bici \n", (tritleta.tiempoRecorrido(20, "Tierra")*3600) );
        System.out.printf("Tarda %.2f segundos en recorrer Asfalto 20KM en bici \n" , (tritleta.tiempoRecorrido(20, "Asfalto")*3600) );
        System.out.println("Salta " + tritleta.saltarAltura() + "CM");
        System.out.println("\n");
        
        //BALLENA AZUL
        System.out.println("--------------------------------------");
        System.out.println("BALLENA DE EDAD " + ballenita.edad);
        System.out.println("--------------------------------------");
        System.out.printf("Una Ballena recorre 2000m en %.2f segundos\n", (ballenita.tiempoRecorrido(0)*3600));
        
    }
}
