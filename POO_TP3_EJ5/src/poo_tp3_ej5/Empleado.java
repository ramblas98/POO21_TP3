
package poo_tp3_ej5;

public class Empleado {
    private String nombres;
    private String apellidos;
    private int nroSegSocial;
    private double salarioBase;
    private double totalVentas;
    private int comision;

    public Empleado() {
    }

    public Empleado(String nombres, String apellidos, int nroSegSocial, double salarioBase, double totalVentas, int comision) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.nroSegSocial = nroSegSocial;
        this.salarioBase = salarioBase;
        this.totalVentas = totalVentas;
        this.comision = comision;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNroSegSocial() {
        return nroSegSocial;
    }

    public void setNroSegSocial(int nroSegSocial) {
        this.nroSegSocial = nroSegSocial;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(double totalVentas) {
        this.totalVentas = totalVentas;
    }

    public int getComision() {
        return comision;
    }

    public void setComision(int comision) {
        this.comision = comision;
    }
    
        
    public double salario(){
        return this.salarioBase;
    }
}
