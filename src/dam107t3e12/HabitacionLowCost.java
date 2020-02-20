/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dam107t3e12;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author dam107
 */
public class HabitacionLowCost extends HabitacionPadre{
    HabitacionLowCost(int numeroHabitacion){
        super(numeroHabitacion);
    }
    
    @Override
    public double checkOut(){
        if(this.isOcupadas()){
            this.setOcupadas(false);
            long dias = ChronoUnit.DAYS.between(this.getFechaLlegada(),LocalDate.now());
            if(dias<1)dias=1;
            return 50*dias;
        }
        else return -1;
    }

    
    
}
