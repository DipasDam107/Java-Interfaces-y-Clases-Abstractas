package dam107t3e12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HabitacionDoble extends HabitacionPadre{
    
    
    HabitacionDoble(int numeroHabitacion){
        super(numeroHabitacion);
        
    }

     @Override
    public double checkOut(){
        double importe=-1;
        if(this.isOcupadas()){
            this.setOcupadas(false);
            LocalDate salida = LocalDate.now();
            long dias = ChronoUnit.DAYS.between(this.getFechaLlegada(),salida);
            if(dias<1)dias=1;
            
            if(salida.getMonthValue()==4 || salida.getMonthValue()==7 || salida.getMonthValue()==8){
                return (100*dias)+(((100*dias)*20)/100d);
            }
            else return 100*dias;     
        }
        else return importe;
    }

   

   
    
}
