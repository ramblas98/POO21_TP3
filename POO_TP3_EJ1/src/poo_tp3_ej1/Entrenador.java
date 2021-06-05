
package poo_tp3_ej1;

public class Entrenador extends IntegranteEquipo{
    private int idFederacion;

    public Entrenador(int idFederacion, int id, String nombres, String apellidos, int edad) {
        super(id, nombres, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public int getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(int idFederacion) {
        this.idFederacion = idFederacion;
    }
    
    public void dirigirEntrenamiento(){
        System.out.println("Dirige Entrenamiento");
    }
    
    public void dirigirPartido(){
        System.out.println("Dirige Partido");
    }
}
