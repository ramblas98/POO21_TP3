
package poo_tp3_ej3;

import java.time.LocalDate;
import java.time.Month;

public class POO_TP3_EJ3 {

    public static void main(String[] args) {
        Persona persona = new Persona("Marco",39679597,"Perales",LocalDate.of(1996,Month.JUNE, 14));
        
        System.out.println("Edad: "+persona.edad(LocalDate.now()));
        System.out.println("Cumpleanios: "+persona.cumpleanios());
    }
    
}
