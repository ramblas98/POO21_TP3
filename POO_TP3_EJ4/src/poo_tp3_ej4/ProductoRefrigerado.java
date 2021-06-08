
package poo_tp3_ej4;

import java.time.LocalDate;

public class ProductoRefrigerado extends Producto{
    private long codigOrganismo;
    private double temperaturaRecomendable;

    public ProductoRefrigerado(long codigOrganismo, double temperaturaRecomendable) {
        this.codigOrganismo = codigOrganismo;
        this.temperaturaRecomendable = temperaturaRecomendable;
    }

    public ProductoRefrigerado(long codigOrganismo, double temperaturaRecomendable, LocalDate fechaCaducidad, long nroLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, nroLote, fechaEnvasado, paisOrigen);
        this.codigOrganismo = codigOrganismo;
        this.temperaturaRecomendable = temperaturaRecomendable;
    }

    public long getCodigOrganismo() {
        return codigOrganismo;
    }

    public void setCodigOrganismo(long codigOrganismo) {
        this.codigOrganismo = codigOrganismo;
    }

    public double getTemperaturaRecomendable() {
        return temperaturaRecomendable;
    }

    public void setTemperaturaRecomendable(double temperaturaRecomendable) {
        this.temperaturaRecomendable = temperaturaRecomendable;
    }
    
    
}
