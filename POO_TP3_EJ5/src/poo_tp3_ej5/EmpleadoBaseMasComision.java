
package poo_tp3_ej5;

public class EmpleadoBaseMasComision extends Empleado{

    public EmpleadoBaseMasComision() {
    }

    public EmpleadoBaseMasComision(String nombres, String apellidos, int nroSegSocial, double salarioBase, double totalVentas, int comision) {
        super(nombres, apellidos, nroSegSocial, salarioBase, totalVentas, comision);
    }
    
    @Override
    public double salario(){
        double salario;
        
        salario = super.getSalarioBase() + super.getTotalVentas() + super.getComision();
        
        return salario;
    }
}
