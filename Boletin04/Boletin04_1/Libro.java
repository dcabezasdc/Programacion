package boletin04_1;

public class Libro {
    
    private String titulo;
    private String autor;
    private int ano;
    private short numPaginas;
    private float valoracion;
      
    public Libro(){   
    
    } 
    
    public Libro(String ti,String au,int an,short pag){
        titulo=ti;
        autor=au;
        ano=an;
        numPaginas=pag;
    }
    
    public void setTitulo(String ti){
        titulo=ti;
    }
    
    public String getTitulo(){
        return titulo;
    }
    
    public void setAutor(String au){
        autor=au;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public void setAno(int an){
        ano=an;
    }
    
    public int getAno(){
        return ano;
    }
    
    public void setNumPaginas(short pag){
        numPaginas=pag;
    }
    
    public short getNumPaginas(){
        return numPaginas;
    }
    
    public void setValoracion(float va){
        valoracion=va;
    }
    
    public float getValoracion(){
        return valoracion;
    }
    
    public void mostrar(){
        System.out.println("\ntitulo:"+titulo+"\nautor:"+autor+"\nano:"+ano+"\nnumero de paginas:"+numPaginas);
    }
}
