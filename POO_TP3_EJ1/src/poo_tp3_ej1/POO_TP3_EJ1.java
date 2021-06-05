
package poo_tp3_ej1;

public class POO_TP3_EJ1 {

  
    public static void main(String[] args) {
        Futbolista futbolista = new Futbolista(80,"Defensor",1655,"Mario","Gomez",25);
        Entrenador entrenador = new Entrenador(798,15624,"Marcelo","Gallardo",45);
        Masajista masajista = new Masajista(11,"Masoterapia",4651,"Julio","Fernandez",41);
        
        futbolista.concentrarse();
        entrenador.concentrarse();
        masajista.concentrarse();
        
        entrenador.dirigirEntrenamiento();
        
        futbolista.jugarPartido();
        entrenador.dirigirPartido();
        masajista.darMasaje();
        
    }
    
}
