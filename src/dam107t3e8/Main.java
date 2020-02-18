/*
Haz una nueva versión de la interfaz y clases del ejercicio anterior (añádele el sufijo _v4).
Añádele a la interfaz el método superficie (). Crea una nueva clase Cilindro_v4 y haz que implemente
los métodos de la interfaz. Haz un programa que permita crear una instancia de cada una de las 3
figuras y nos muestre cuál tiene más superficie.
    • Cuestión 1: ¿Al añadir el nuevo método a la interfaz, si no modificamos las clases que la implementan
    ¿se produce algún error? ¿Por qué? ¿Cómo evitamos esta situación?

    Al añadir el nuevo método a la interfaz, siempre que este no sea privado, estático o default, se va a producir un error en el resto de clases,
    al no estar el nuevo método abstracto definido en las mismas.

    • Cuestión 2: Supón que añades a la interfaz un nuevo método llamado ocupaMasque va a ser igual
    para todas las clases que implementen la interfaz ya que es una comparación del volumen, tenga la
    forma que tenga ¿qué opciones tenemos para no tener que implementarlo en todas las clases? 

    Podemos hacerlo DEFAULT, para que las clases no tengan que implementarlo, pero lo mas lógico sería un método estático

 */
package dam107t3e8;

import java.util.ArrayList;

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
