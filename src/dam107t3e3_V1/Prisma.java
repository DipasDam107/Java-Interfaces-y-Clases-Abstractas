
package dam107t3e3_V1;


public class Prisma extends Figura3D {
    private double longitud;
    private double ancho;
    private double altura;
    
    Prisma(double longitud, double ancho, double altura){
        this.longitud=longitud;
        this.ancho=ancho;
        this.altura=altura;
    }
    
    @Override
    public double volumen() {
        return (ancho*longitud)*altura;
    }

    @Override
    public double superficie() {
       return 2*(longitud*ancho + longitud*altura + ancho*altura);
    }
    
}
