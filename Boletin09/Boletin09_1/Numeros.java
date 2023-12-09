package boletin09_1;

public class Numeros {
    public void contarNumeros(){
        
        int i=0;
        int positivos=0;
        int negativos=0;
        int ceros=0;
        
        while(i<10){
            
            int num = LerDatos.lerEnteiro("Teclea numero");
            
            if(num==0){
                ceros++;
            }else if (num<0){
                negativos++;
            }else{
                positivos++;
            }
            
            i++;
        }
        
        System.out.println("Numero de ceros: "+ceros+"\nNumero de negativos: "+negativos+"\nNumeros positivos: "+positivos);
    }
}