
package poo_tp3_ej6;

public class InmueblePiso extends Inmueble{
    private int nroPiso;

    public InmueblePiso() {
    }

    public InmueblePiso(int nroPiso, String direccion, double nroMts2, int tiempoVida, double precioBase) {
        super(direccion, nroMts2, tiempoVida, precioBase);
        this.nroPiso = nroPiso;
    }

    public int getNroPiso() {
        return nroPiso;
    }

    public void setNroPiso(int nroPiso) {
        this.nroPiso = nroPiso;
    }
    
    @Override
    public double precioFinal(){
        double precious;
        
        precious = super.precioFinal();
        
        if(this.nroPiso>=3){
            precious = precious + ((precious*3)/100);
        }
        
        return precious;
    }
}
