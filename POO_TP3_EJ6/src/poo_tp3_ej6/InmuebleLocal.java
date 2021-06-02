
package poo_tp3_ej6;

public class InmuebleLocal extends Inmueble{
    private int nroVentanas;

    public InmuebleLocal(int nroVentanas) {
        this.nroVentanas = nroVentanas;
    }

    public InmuebleLocal(int nroVentanas, String direccion, double nroMts2, int tiempoVida, double precioBase) {
        super(direccion, nroMts2, tiempoVida, precioBase);
        this.nroVentanas = nroVentanas;
    }

    public int getNroVentanas() {
        return nroVentanas;
    }

    public void setNroVentanas(int nroVentanas) {
        this.nroVentanas = nroVentanas;
    }
    
    public double precioFinal(){
        double precious;
        
        precious = super.precio();
        
        if(super.getNroMts2()>50){
            precious = precious + (precious/100);
        }
        if(this.nroVentanas<=1){
            precious = precious - ((precious*2)/100);
        }
        if(this.nroVentanas>4){
            precious = precious + ((precious*4)/100);
        }
        
        return precious;
    }
}
