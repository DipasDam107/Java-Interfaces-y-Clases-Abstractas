package dam107t3e12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class HabitacionSuite extends HabitacionPadre{
    int personas; 
    HabitacionSuite(int numeroHabitacion, int personas){
        super(numeroHabitacion);
        this.personas=personas;
    }
@Override
    public double checkOut() {
         if(this.isOcupadas()){
            this.setOcupadas(false);
            long dias = ChronoUnit.DAYS.between(this.getFechaLlegada(),LocalDate.now());
                if(dias<1) dias=1;
            return 150*dias*this.personas;
        }
        else return -1;
    }
   
    public boolean checkIn(int personas){
        if(super.checkIn()){
            this.personas=personas;
            return true;
        }
        else return false;
    }
}
