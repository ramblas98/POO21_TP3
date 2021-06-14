
package poo_tp3_ej3;

import java.time.LocalDate;


public class Cliente extends Persona{
    private long cuenta;

    public Cliente(long cuenta) {
        this.cuenta = cuenta;
    }

    public Cliente(long cuenta, String nombres, long dni, String apellidos, LocalDate fnac) {
        super(nombres, dni, apellidos, fnac);
        this.cuenta = cuenta;
    }

    public long getCuenta() {
        return cuenta;
    }

    public void setCuenta(long cuenta) {
        this.cuenta = cuenta;
    }
    
    
}
