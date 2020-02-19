/*
 Se desea hacer la gestión de las habitaciones de un hotel. Todas las habitaciones tienen un
número de habitación y un proceso de check-in y check-out.. En el hotel hay estas habitaciones:
    1) 3 habitaciones Lowcost (cuesta 50 euros todo el año).
    2) 10 habitaciones dobles. Tienen una tarifa normal de 100 euros y un incremento del 20% si el día
       de salida es abril, julio o agosto.
    3) 5 habitaciones Suite. Tienen la misma tarifa todo el año, 150 euros por persona, es decir, a la hora
       de facturar, no es lo mismo si hay un huésped o tres en la habitación.
• El programa inicialmente meterá las 18 habitaciones en un ArrayList y las marcará como “no
ocupadas”.
• El programa tendrá un menú para hacer check-in entre las habitaciones libres, check-out entre las
ocupadas y listar habitaciones libres y ocupadas.
El check-in es común para todas las habitaciones, consiste en marcar la habitación como ocupada.
• El check-out consiste en marcar la habitación como libre y calcular el importe a pagar en función de
los días de estancia (quizás sea necesario almacenar la fecha de llegada en el momento del check-in)
• Mantener toda la información en las clases más que en el programa que las utiliza.
• Sugerencia: Para probar el programa, al hacer el check-out, puedes considerar cada día como un
segundo, para que los datos sean más reales, así han pasado 3 segundos, considerar 3 días.
• La superclase Habitacion debe tener: public abstract double checkOut ();

Cuestión 1: ¿Es útil que el método checkOut sea abstracto o los tres tipos de habitación podrían compartir
un código común?
Cuestión 2: ¿Es útil que el método toString() en la clase Habitacion?
 */
package dam107t3e12;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner teclado;
    static ArrayList <HabitacionPadre> habitaciones;
    static HabitacionPadre habActiva;
    public static void main(String [] args){
        teclado = new Scanner(System.in); 
        habitaciones = new ArrayList<>();
        iniciarHabitaciones();
        int opcion, op;
        do{
            menuInicio();
            op=teclado.nextInt();
            teclado.nextLine();
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
            if(op==1){ 
               if(gestionarHabi()){
                   do{
                        menu();
                        opcion=teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
                        if(opcion==1) checkIn();
                        if(opcion==2) checkOut();
                    }while(opcion!=0 || (opcion<0 || opcion>2));
               }
               else System.out.println("La habitacion no existe");
            }
            if(op==2) menuHabitacion();
        }while(op!=0 || (op>2 || op<0));
        
        
        
    }
    
    public static void menu(){
        System.out.println("-----------------------------");
        System.out.print("HABITACION NUMERO " +habActiva.getNumeroHabitacion() + " TIPO: ");
            if(habActiva instanceof HabitacionSuite) System.out.print("SUITE");
            else if (habActiva instanceof HabitacionLowCost) System.out.print("LOW COST");
            else System.out.print("DOBLE");
        System.out.print(" ESTADO: ");
            if(habActiva.isOcupadas()) System.out.print(" OCUPADA\n");
            else System.out.print("DISPONIBLE\n");
        System.out.println("-----------------------------");
        System.out.println("1 - Check In");
        System.out.println("2 - Check Out");
        System.out.println("0 - Salir");
        System.out.println("-----------------------------");
        System.out.println("Dime opcion: ");
    }
    public static boolean gestionarHabi(){
        int num, cont=0;
        boolean encontrado=false;
        System.out.println("Dime habitacion: ");
        num=teclado.nextInt();
        teclado.nextLine();
        do{
            if(habitaciones.get(cont).equals(new HabitacionLowCost(num))){
                habActiva=habitaciones.get(cont);
                encontrado=true;
            }
            else cont++;
        }while(cont<habitaciones.size() && !encontrado);
      if(encontrado) return true;
      else return false;
    }
    public static void checkIn(){
        boolean valido;
        if(habActiva instanceof HabitacionSuite){
            int personas;
            System.out.println("Cuantas Personas: ");
            personas= teclado.nextInt();
            valido=((HabitacionSuite)habActiva).checkIn(personas);
        }
        else valido=habActiva.checkIn();
        
        if(valido) System.out.println("La habitación ha sido ocupada con exito");
        else System.out.println("La habitacion ya está ocupada");
    }
    
    public static void checkOut(){
        double importe = habActiva.checkOut();
        if(importe==-1) System.out.println("La habitacion no está ocupada");
        else System.out.println("Se procede a habilitar la habitación " + habActiva.getNumeroHabitacion()+ ". El importe es " + importe);
    }
 
    public static void menuInicio(){
        System.out.println("-----------------------------");
        System.out.println("MENU INICIO");
        System.out.println("-----------------------------");
        System.out.println("1 - Gestionar Habitacion");
        System.out.println("2 - Listar Habitaciones");
        System.out.println("0 - Salir");
        System.out.println("-----------------------------");
        System.out.println("Dime opcion: ");
    }
    public static void menuHabitacion(){
        int cont=1;
        System.out.println("-----------------------------");
        System.out.println("LISTA HABITACIONES");
        System.out.println("-----------------------------");
        for(HabitacionPadre x : habitaciones){
            System.out.println(x.toString());
        }
        System.out.println("");
    }
    
    public static void iniciarHabitaciones(){
        //Añado las habitaciones Low Cost
        habitaciones.add(new HabitacionLowCost(1));
        habitaciones.add(new HabitacionLowCost(2));
        habitaciones.add(new HabitacionLowCost(3));
        
        //Añado las Habitaciones Dobles
        habitaciones.add(new HabitacionDoble(4));
        habitaciones.add(new HabitacionDoble(5));
        habitaciones.add(new HabitacionDoble(6));
        habitaciones.add(new HabitacionDoble(7));
        habitaciones.add(new HabitacionDoble(8));
        habitaciones.add(new HabitacionDoble(9));
        habitaciones.add(new HabitacionDoble(10));
        habitaciones.add(new HabitacionDoble(11));
        habitaciones.add(new HabitacionDoble(12));
        habitaciones.add(new HabitacionDoble(13));
        
        //Añado las habitaciones Suite
        habitaciones.add(new HabitacionSuite(14,0));
        habitaciones.add(new HabitacionSuite(15,0));
        habitaciones.add(new HabitacionSuite(16,0));
        habitaciones.add(new HabitacionSuite(17,0));
        habitaciones.add(new HabitacionSuite(18,0));
    }
}
