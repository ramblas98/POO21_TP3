
package poo_tp3_ej4;

import java.time.LocalDate;

public class CongeladoNitrogeno extends ProductoCongelado{
    private double exposicionNitro;

    public CongeladoNitrogeno(double exposicionNitro, double temperaturaRecomendable) {
        super(temperaturaRecomendable);
        this.exposicionNitro = exposicionNitro;
    }

    public CongeladoNitrogeno(double exposicionNitro, double temperaturaRecomendable, LocalDate fechaCaducidad, long nroLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(temperaturaRecomendable, fechaCaducidad, nroLote, fechaEnvasado, paisOrigen);
        this.exposicionNitro = exposicionNitro;
    }

    public double getExposicionNitro() {
        return exposicionNitro;
    }

    public void setExposicionNitro(double exposicionNitro) {
        this.exposicionNitro = exposicionNitro;
    }
    
    
}
