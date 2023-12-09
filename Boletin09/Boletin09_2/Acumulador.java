package boletin09_2;

public class Acumulador {
     
    public void acumuladorSumaProducto(){
        
        double acuSuma=0,acuProducto=1;
        
        int i=10;
                
        while (i<90){
            
            acuSuma+=i;
            acuProducto*=i;
            i++; 
        }
        
        System.out.println("A suma dos numeros e "+acuSuma+"\nO produto dos numerosn e "+acuProducto);        
    }
} 