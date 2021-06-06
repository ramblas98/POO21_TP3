
package poo_tp3_ej2;


public class Vehiculo {
    private long patente;
    private String marca;

    public Vehiculo() {
    }

    public Vehiculo(long patente, String marca) {
        this.patente = patente;
        this.marca = marca;
    }

    public long getPatente() {
        return patente;
    }

    public void setPatente(long patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    
}
