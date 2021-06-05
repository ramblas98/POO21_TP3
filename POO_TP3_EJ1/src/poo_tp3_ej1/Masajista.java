
package poo_tp3_ej1;

public class Masajista extends IntegranteEquipo{
    private int aniosExperiencia;
    private String titulacion;

    public Masajista(int aniosExperiencia, String titulacion, int id, String nombres, String apellidos, int edad) {
        super(id, nombres, apellidos, edad);
        this.aniosExperiencia = aniosExperiencia;
        this.titulacion = titulacion;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    
    public void darMasaje(){
        System.out.println("Dar Masaje");
    }
}
