package boletin16_1;

public class Libro extends Publicacion{
    
    private boolean prestado=false;

    public Libro() {
    }

    public Libro(int codigo, String titulo, int anoPublicacion,boolean prestado) {
        super(codigo, titulo, anoPublicacion);
        this.prestado=prestado;
    }

    @Override
    public int getCodigo() {
        return super.getCodigo();
    }
    
    @Override
    public int getAnoPublicacion(){
        return super.getAnoPublicacion();
    }
    
    public boolean prestar(){
        return prestado=true;
    }
    
    @Override
    public String toString() {
        return "Libro: "+super.toString() + ", prestado=" + prestado;
    }

    
    
    
    
}
