package dam107t3e1;

public class Triangulo extends Figura2D{
    public String estilo;
    Triangulo(){
        estilo=null;
    }
    
    Triangulo(double valor, String nombre){
        super(valor, nombre);
        this.estilo="IgualBaseAltura";
    }
    
    Triangulo(double alto, double ancho, String estilo, String nombre){
        super(ancho, alto, nombre);
        this.estilo=estilo;
    }

    public String getEstilo() {
        return estilo;
    }
    
    public double area(){ 
        return (this.getAlto()*this.getAncho())/2d;
    }
    
    public double precio(float precioMetroCuadrado){
        return this.area()*precioMetroCuadrado;
    }
}
