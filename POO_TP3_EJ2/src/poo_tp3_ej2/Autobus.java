
package poo_tp3_ej2;

import java.util.Scanner;

public class Autobus extends Vehiculo{
    private int nroAsientos;
    private double precioAsiento;
    private static int edadPasajeros[];
    private int cantPasajeros;

    public Autobus(int nroAsientos, double precioAsiento, int cantPasajeros) {
        this.nroAsientos = nroAsientos;
        this.precioAsiento = precioAsiento;
        this.cantPasajeros = cantPasajeros;
    }

    public Autobus(int nroAsientos, double precioAsiento, int cantPasajeros, long patente, String marca) {
        super(patente, marca);
        this.nroAsientos = nroAsientos;
        this.precioAsiento = precioAsiento;
        this.cantPasajeros = cantPasajeros;
    }
    
    

    public int getNroAsientos() {
        return nroAsientos;
    }

    public void setNroAsientos(int nroAsientos) {
        this.nroAsientos = nroAsientos;
    }

    public double getPrecioAsiento() {
        return precioAsiento;
    }

    public void setPrecioAsiento(double precioAsiento) {
        this.precioAsiento = precioAsiento;
    }

    public int getCantPasajeros() {
        return cantPasajeros;
    }

    public void setCantPasajeros(int cantPasajeros) {
        this.cantPasajeros = cantPasajeros;
    }
    
    public double recaudacionTotal(){
        double recaudacion = 0;
        Autobus.edadPasajeros = new int[this.cantPasajeros];
        
        Autobus.indicarEdad();
        
        for(int i=0;i<Autobus.edadPasajeros.length;i++){
            recaudacion+=this.precioAsiento;
            if(Autobus.edadPasajeros[i]<12){
                recaudacion-= ((this.precioAsiento*75)/100);
            }
            if(Autobus.edadPasajeros[i]>=60){
                recaudacion-=((this.precioAsiento*50)/100);
            }
        }
       
        return recaudacion;
    }
    
    private static void indicarEdad(){
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i<Autobus.edadPasajeros.length;i++){
            System.out.println("indique edad pasajero "+i+" :");
            Autobus.edadPasajeros[i] = teclado.nextInt();
        }
    }
   
}
