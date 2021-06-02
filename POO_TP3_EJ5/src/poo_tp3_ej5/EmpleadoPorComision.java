
package poo_tp3_ej5;

public class EmpleadoPorComision extends Empleado{

    public EmpleadoPorComision() {
        super.setSalarioBase(0);
    }
    
    

    public EmpleadoPorComision(String nombres, String apellidos, int nroSegSocial, double salarioBase, double totalVentas, int comision) {
        super(nombres, apellidos, nroSegSocial, salarioBase, totalVentas, comision);
        super.setSalarioBase(0);
    }
    
    
    @Override
    public double salario(){
        double salario;
        
        salario = super.getTotalVentas() * super.getComision();
        
        return salario;
    }
    
}
