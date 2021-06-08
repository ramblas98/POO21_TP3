
package poo_tp3_ej4;

import java.time.LocalDate;


public class CongeladoAire extends ProductoCongelado{
    private double o2;
    private double co2;
    private double nitro;
    private double vaporAgua;

    public CongeladoAire(double o2, double co2, double nitro, double vaporAgua, double temperaturaRecomendable) {
        super(temperaturaRecomendable);
        this.o2 = o2;
        this.co2 = co2;
        this.nitro = nitro;
        this.vaporAgua = vaporAgua;
    }

    public CongeladoAire(double o2, double co2, double nitro, double vaporAgua, double temperaturaRecomendable, LocalDate fechaCaducidad, long nroLote, LocalDate fechaEnvasado, String paisOrigen) {
        super(temperaturaRecomendable, fechaCaducidad, nroLote, fechaEnvasado, paisOrigen);
        this.o2 = o2;
        this.co2 = co2;
        this.nitro = nitro;
        this.vaporAgua = vaporAgua;
    }

    public double getO2() {
        return o2;
    }

    public void setO2(double o2) {
        this.o2 = o2;
    }

    public double getCo2() {
        return co2;
    }

    public void setCo2(double co2) {
        this.co2 = co2;
    }

    public double getNitro() {
        return nitro;
    }

    public void setNitro(double nitro) {
        this.nitro = nitro;
    }

    public double getVaporAgua() {
        return vaporAgua;
    }

    public void setVaporAgua(double vaporAgua) {
        this.vaporAgua = vaporAgua;
    }
    
    
}
