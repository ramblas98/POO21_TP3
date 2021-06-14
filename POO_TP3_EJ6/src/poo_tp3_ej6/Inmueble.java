
package poo_tp3_ej6;

public class Inmueble {
    private String direccion;
    private double nroMts2;
    private int tiempoVida;
    private double precioBase;

    public Inmueble() {
    }

    public Inmueble(String direccion, double nroMts2, int tiempoVida, double precioBase) {
        this.direccion = direccion;
        this.nroMts2 = nroMts2;
        this.tiempoVida = tiempoVida;
        this.precioBase = precioBase;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getNroMts2() {
        return nroMts2;
    }

    public void setNroMts2(double nroMts2) {
        this.nroMts2 = nroMts2;
    }

    public int getTiempoVida() {
        return tiempoVida;
    }

    public void setTiempoVida(int tiempoVida) {
        this.tiempoVida = tiempoVida;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }
    
    public double precioFinal(){
        double precio = this.precioBase;
        
        if(this.tiempoVida<15){
            precio = precio - (precio/100);
        }
        else{
            precio = precio - ((precio*2)/100);
        }
        
        return precio;
    }
}
