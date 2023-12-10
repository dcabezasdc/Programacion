public class Reglas {
    
    private int numero;
    private int intentos;
    
    public void setNumero(){
        
       int numero;
       double x = Math.random() * 50 +1 ;
       numero= (int) x;
       this.numero=numero;
    }
    
    public void setIntentos(int intentos){

        this.intentos = intentos;
    }
    
    public int getNumero(){

        return numero;
    }
    
    public int getIntentos(){

        return intentos;
    }
}
