
package poo_tp3_ej1;

public class Futbolista extends IntegranteEquipo{
    private double peso;
    private String puesto;

    public Futbolista(double peso, String puesto, int id, String nombres, String apellidos, int edad) {
        super(id, nombres, apellidos, edad);
        this.peso = peso;
        this.puesto = puesto;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
    
    public void jugarPartido(){
        System.out.println("jugar Partido");
    }
}
