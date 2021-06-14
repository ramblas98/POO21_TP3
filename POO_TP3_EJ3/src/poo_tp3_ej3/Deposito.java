
package poo_tp3_ej3;

public class Deposito{
    private Cliente titular;
    private double capital;
    private int plazo;
    private double finalTNA;
    private double finalTEA;

    public Deposito() {
    }

    public Deposito(Cliente titular, double capital, int plazo, double finalTNA, double finalTEA) {
        this.titular = titular;
        this.capital = capital;
        this.plazo = plazo;
        this.finalTNA = finalTNA;
        this.finalTEA = finalTEA;
    }

    public double getCapital() {
        return capital;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public int getPlazo() {
        return plazo;
    }

    public void setPlazo(int plazo) {
        this.plazo = plazo;
    }

    public double getFinalTNA() {
        return finalTNA;
    }

    public void setFinalTNA(double finalTNA) {
        this.finalTNA = finalTNA;
    }

    public double getFinalTEA() {
        return finalTEA;
    }

    public void setFinalTEA(double finalTEA) {
        this.finalTEA = finalTEA;
    }
    
    
}
