/*
Convierte la clase abstracta Figura3D_v1 en una interfaz Figura3D_v3 con las mismas
características. Rehaz las clases Esfera y PrismaRectangular (tendrán sufijo v3) para adapatarlas a la
nueva interfaz. Haz un programa que cree una instancia de cada una de las 2 figuras y muestre cuál
de ellas ocupa más.
 */
package dam107t3e7;
import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList <Figura3D> figuras = new ArrayList<>();
        
        Prisma prisma=new Prisma(10,5,5);
        Esfera esfera=new Esfera(10);
        
        double volPrisma=prisma.volumen();
        double volEsfera=esfera.volumen();
        
        System.out.println("Volumen del prisma: " + volPrisma);
        System.out.println("Volumen de la esfera: " + volEsfera);
        
        if(volEsfera!=volPrisma)
            if(volEsfera>volPrisma) System.out.println("La esfera tiene mas volumen");
            else System.out.println("El prisma tiene mas volumen");
        else System.out.println("El prima y la esfera tienen la misma area");
        
        
    }
}
