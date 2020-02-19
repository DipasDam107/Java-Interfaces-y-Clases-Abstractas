package dam107t3e11;


public class movilPlus extends cMovilPrepago implements Movil{
    movilPlus(long nM, float cML, float cMB, float s){
        super(nM,0,cML, cMB,s);
    }
    
    public void videollamada(int segundos){
        this.navegar(segundos*DATOS_SEGUNDO_VIDEOLLAMADA);
    }
    
   
   
}
