package boletin07_3;

public class PositivoNegativoCero {
    
    //constructor
    public PositivoNegativoCero(){
    }
    
    //método
    
    public void esPositivo(int n){
        if (n > 0)
            System.out.println("+");
        else if (n < 0)
            System.out.println("-");
        else
            System.out.println("0");
    }
}
