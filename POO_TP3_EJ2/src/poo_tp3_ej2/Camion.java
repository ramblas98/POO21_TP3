
package poo_tp3_ej2;


public class Camion extends Vehiculo{
    private double capacidadCarga;
    private int compartimientos;

    public Camion(double capacidadCarga, int compartimientos) {
        this.capacidadCarga = capacidadCarga;
        this.compartimientos = compartimientos;
    }

    public Camion(double capacidadCarga, int compartimientos, long patente, String marca) {
        super(patente, marca);
        this.capacidadCarga = capacidadCarga;
        this.compartimientos = compartimientos;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    public int getCompartimientos() {
        return compartimientos;
    }

    public void setCompartimientos(int compartimientos) {
        this.compartimientos = compartimientos;
    }
    
    public double pesoPorCompartimiento(){
        return this.capacidadCarga/this.compartimientos;
    }

    @Override
    public String toString() {
        return "Camion{" + "capacidadCarga=" + capacidadCarga + '}'+"Marca{"+ "marca="+super.getMarca()+"}";
    }
    
    
}
