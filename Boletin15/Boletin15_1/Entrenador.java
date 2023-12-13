package boletin15_1;

public class Entrenador extends SeleccionFutbol{
    
    private String idFederacion;
    
    
    
    
    public void dirixirPartido(){
        
    }
    
    public void dirixirEntrenamento(){
        
    }

    public Entrenador() {
    }

    public Entrenador(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(String idFederacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.idFederacion = idFederacion;
    }

    
 
    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    @Override
    public String toString() {
        return "Entrenador: "+super.toString() + ", idFederacion=" + idFederacion;
    }
    
    
    
}
