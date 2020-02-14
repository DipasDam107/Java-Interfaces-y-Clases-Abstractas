package dam107t3e1;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        ArrayList <Figura2D> figuras = new ArrayList<>();
        figuras.add(new Rectangulo(2, "Cuadrado"));
        figuras.add(new Triangulo(2, "Equilatero"));
        figuras.add(new TrianColor(2, 3,"Estilazo","Rojo","Equilatero"));
        
        System.out.println("Cual es el precio del metro: ");
        float metro=teclado.nextFloat();
        
        for(Figura2D figura : figuras)
                System.out.println("El precio es: " + figura.precio(metro));
    }
}
