/*
Duplica las interfaces y las clases del ejercicio anterior (añadiéndoles el sufijo _v2) Modifica la
interfaz Saltador_v2 añadiéndole el método saltaPertiga que recibe como parámetro una altura en
centímetros y devuelve true si ha logrado el salto y false si no lo ha logrado ¿Qué ocurre con la clase
TriAtleta_v2? Desarrolla saltaPertiga como método default en la interfaz de forma que por defecto devuelva
false.
    La clase Triatleta da error, porque no tiene implementado el metodo salto pertiga.

    • Haz una nueva versión de TriAtleta (sufijo _v2b) que implemente saltaPertiga con este criterio:
    para saltos de más de 6 metros devuelve false, entre 5 y 6 metros devuelve true la mitad de las
    veces y por debajo de 5 metros devuelve siempre true.
    • Haz un programa que cree una instancia de Triatleta_v2 y otra de Triatleta_v2b y que muestre el
    resultado de ambos atletas saltando: 100cm, 550cm, 560cm, 580cm, 700cm
 */
package dam107t3e10;

import dam107t3e9.*;
import java.util.Scanner;


public class Main {
    static Scanner teclado = new Scanner(System.in);
    static BallenaAzul ballenita;
    static TriAtleta tritleta;
    static Delfin delfin;
    static TriAtleta_b tritletab;
    
    public static void main(String [] args){
        ballenita=new BallenaAzul(15);
        tritleta=new TriAtleta(25, "Hombre");
        delfin=new Delfin();
        tritletab=new TriAtleta_b(25,"Mujer");
        
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
        System.out.println("Salta 7m?: " + tritleta.saltoPertiga(700));
        System.out.println("Salta 5m?: " + tritleta.saltoPertiga(500));
        System.out.println("Salta 2m?: " + tritleta.saltoPertiga(200));
        System.out.println("\n");
        
        
        System.out.println("--------------------------------------");
        System.out.println(tritletab.sexo + " de edad " + tritletab.edad);
        System.out.println("--------------------------------------");
        System.out.println("Salta 7m?: " + tritletab.saltoPertiga(700));
        System.out.println("Salta 5m?: " + tritletab.saltoPertiga(500));
        System.out.println("Salta 2m?: " + tritletab.saltoPertiga(200));
        
        //BALLENA AZUL
        System.out.println("--------------------------------------");
        System.out.println("BALLENA DE EDAD " + ballenita.edad);
        System.out.println("--------------------------------------");
        System.out.printf("Una Ballena recorre 2000m en %.2f segundos\n", (ballenita.tiempoRecorrido(0)*3600));
        
    }
}
