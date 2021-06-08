
package poo_tp3_ej4;

import java.time.LocalDate;


public class ProductoCongelado extends Producto{
    private double temperaturaRecomendable;

    public ProductoCongelado(double temperaturaRecomendable) {
        this.temperaturaRecomendable = temperaturaRecomendable;
    }

    public ProductoCongelado(double temperaturaRecomendable, LocalDate fechaCaducidad, long nroLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, nroLote, fechaEnvasado, paisOrigen);
        this.temperaturaRecomendable = temperaturaRecomendable;
    }

    public double getTemperaturaRecomendable() {
        return temperaturaRecomendable;
    }

    public void setTemperaturaRecomendable(double temperaturaRecomendable) {
        this.temperaturaRecomendable = temperaturaRecomendable;
    }
    
    
}
