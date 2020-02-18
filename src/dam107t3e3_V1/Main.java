/*
Haz una nueva versión de las clases del ejercicio anterior (añádele el sufijo _v2). Añádele a la
clase base el método abstracto superficie (). Crea una nueva clase Cilindro y haz que implemente los
métodos de la superclase. Haz un programa que permita crear una instancia de cada una de las 3
figuras y nos muestre cuál tiene más superficie. 
 */
package dam107t3e3_V1;

import dam107t3e2_V1.*;
import java.util.ArrayList;

/**
 *
 * @author dam107
 */
public class Main {
    public static void main(String [] args){
        ArrayList <Figura3D> figuras = new ArrayList<>();
        int pos=0, cont=0;
        double superficieMayor=0;
        
        figuras.add(new Prisma(100,100,25));
        figuras.add(new Esfera(50));
        figuras.add(new Cilindro(10,15));
      
       for(Figura3D figura : figuras){
           System.out.println(figura.superficie());
           if(figura.superficie()>superficieMayor){ pos=cont; superficieMayor=figura.superficie();}
           cont++;
       } 
       
      if(figuras.get(pos) instanceof Prisma) System.out.println("El mayor es el prisma");
      else if (figuras.get(pos) instanceof Cilindro) System.out.println("El mayor es el cilindro");
      else System.out.println("El mayor es la esfera");
      
        System.out.println("Superficie: " + figuras.get(pos).superficie());
        
        
    }
}
