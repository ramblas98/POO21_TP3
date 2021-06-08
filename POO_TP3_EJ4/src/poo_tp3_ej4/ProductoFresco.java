
package poo_tp3_ej4;

import java.time.LocalDate;

public class ProductoFresco extends Producto{
    private int limiteConsumo;

    public ProductoFresco(int limiteConsumo) {
        this.limiteConsumo = limiteConsumo;
    }

    public ProductoFresco(int limiteConsumo, LocalDate fechaCaducidad, long nroLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(fechaCaducidad, nroLote, fechaEnvasado, paisOrigen);
        this.limiteConsumo = limiteConsumo;
    }

    public int getLimiteConsumo() {
        return limiteConsumo;
    }

    public void setLimiteConsumo(int limiteConsumo) {
        this.limiteConsumo = limiteConsumo;
    }
    
    
}
