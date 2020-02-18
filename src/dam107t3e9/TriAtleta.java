/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e9;

/**
 *
 * @author dam107
 */
public class TriAtleta implements Nadador, Ciclista, Saltador{
        int velocidadBici;
        int velocidadNadar;
        int edad;
        String sexo;
        
        TriAtleta(int edad, String sexo){
           this.edad=edad;
           if (this.edad>50){
            this.velocidadBici=8;
            this.velocidadNadar=1;
           }
           else{ 
               this.velocidadBici=12;
               this.velocidadNadar=2;
           }
           
           this.sexo=sexo;
        }
    @Override
    public double tiempoRecorrido(int metros) {
       double km=metros/1000d;
       return km/velocidadNadar;
    }

    @Override
    public double tiempoRecorrido(int km, String tipo) {
      double velFinal;
      if(tipo.equals("Tierra")){
            velFinal=velocidadBici-((velocidadBici*10)/100);
            return km/velFinal;
      }
      else if (tipo.equals("Asfalto"))
          return (double)km/(double)velocidadBici;
      
      else return -1;
    }

    @Override
    public int saltarAltura() {
        if(sexo.equals("Hombre"))
            if(edad<50)
                return (int)(Math.random()*31) + 40;
            else
                return (int)(Math.random()*25) + 30;
        else 
            if(edad<50)
                return (int)(Math.random()*25) + 30;
            else
                return (int)(Math.random()*25) + 25;
    }
    
}
