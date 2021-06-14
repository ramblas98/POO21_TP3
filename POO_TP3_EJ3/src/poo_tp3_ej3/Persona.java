
package poo_tp3_ej3;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class Persona {
    private String nombres;
    private long dni;
    private String apellidos;
    private LocalDate fnac;

    public Persona() {
    }

    public Persona(String nombres, long dni, String apellidos, LocalDate fnac) {
        this.nombres = nombres;
        this.dni = dni;
        this.apellidos = apellidos;
        this.fnac = fnac;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void mostrarAyP(){
        System.out.println("Nombre: "+this.nombres);
        System.out.println("Apellido: "+this.apellidos);
    }
    
    public long edad(LocalDate fActual){
        long edad = ChronoUnit.YEARS.between(this.fnac,fActual);
        
        return edad;
    }
    
    public boolean cumpleanios(){
        if(this.fnac == LocalDate.now()){
            return true;
        }else return false;
        
    }
    
    
}
