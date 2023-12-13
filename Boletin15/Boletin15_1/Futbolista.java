package boletin15_1;

public class Futbolista extends SeleccionFutbol{
    
    private int dorsal;
    private String demarcacion;
    
    public void xogarPartido(){
        
    }
    
    public void entrenar(){
        
    }

    public Futbolista() {
    }

    public Futbolista(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public Futbolista(int dorsal, String demarcacion, int id, String nome, String apelidos, int edade) {
        super(id, nome, apelidos, edade);
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(String demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public String toString() {
        return  "Futbolista: "+ super.toString()+", dorsal=" + dorsal + ", demarcacion=" + demarcacion ;
    }
    
    
    
    
}
