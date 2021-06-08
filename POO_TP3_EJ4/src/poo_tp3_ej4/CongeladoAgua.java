
package poo_tp3_ej4;

import java.time.LocalDate;

public class CongeladoAgua extends ProductoCongelado{
    private double gramoSal;
    private double ltsAGUA;

    public CongeladoAgua(double gramoSal, double ltsAGUA, double temperaturaRecomendable) {
        super(temperaturaRecomendable);
        this.gramoSal = gramoSal;
        this.ltsAGUA = ltsAGUA;
    }

    public CongeladoAgua(double gramoSal, double ltsAGUA, double temperaturaRecomendable, LocalDate fechaCaducidad, long nroLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(temperaturaRecomendable, fechaCaducidad, nroLote, fechaEnvasado, paisOrigen);
        this.gramoSal = gramoSal;
        this.ltsAGUA = ltsAGUA;
    }

    public double getGramoSal() {
        return gramoSal;
    }

    public void setGramoSal(double gramoSal) {
        this.gramoSal = gramoSal;
    }

    public double getLtsAGUA() {
        return ltsAGUA;
    }

    public void setLtsAGUA(double ltsAGUA) {
        this.ltsAGUA = ltsAGUA;
    }
    
    public double salinidad(){
        return this.gramoSal*this.ltsAGUA;
    }
}
