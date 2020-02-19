
package dam107t3e11;

public class movilTarifaPlana extends cMovilPrepago implements Movil{
    movilTarifaPlana(long nM, float cEL, float cML, float s){
        super(nM,cEL,cML, 0,s);
    }
    
    @Override
    public void navegar(int mb){System.out.println("No hago nada");}
}
