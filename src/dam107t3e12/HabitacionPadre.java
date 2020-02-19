
package dam107t3e12;

import java.time.LocalDate;

public abstract class HabitacionPadre implements Habitacion {
    private int numeroHabitacion;
    private boolean ocupadas;
    private LocalDate fechaLlegada; 
    
    HabitacionPadre(int numeroHabitacion){
        this.numeroHabitacion=numeroHabitacion;
        this.ocupadas=false;
        fechaLlegada=LocalDate.now();
    }
    
    @Override
    public boolean checkIn() {
       if(this.ocupadas==false){
        this.ocupadas=true;
        return true;
       }
       else
           return false;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }
    
    
    public int getNumeroHabitacion() {
        return numeroHabitacion;
    }

    public boolean isOcupadas() {
        return ocupadas;
    }

    public void setOcupadas(boolean ocupadas) {
        this.ocupadas = ocupadas;
    }
    
    @Override
    public String toString(){
        return "Habitacion Numero: " + this.numeroHabitacion + " Ocupada: " + this.ocupadas; 
    }
    
     @Override
    public boolean equals(Object o){
        if(o instanceof HabitacionPadre && ((HabitacionPadre)o).numeroHabitacion==this.numeroHabitacion){
            return true;
        }
        else return false;
    }
}
