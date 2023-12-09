package boletin07_4;

public class Peso {
    float n1, n2;
    String nome1, nome2;
    
    //constructor
    public Peso(){
    }
    
    //metodo
    public void quienPesa(String nome1, String nome2, float n1, float n2){
        if (n1 > n2)
            System.out.println("La persona que pesa más es: "+nome1+ "y la diferencia de peso es: "+ (n1 - n2));
        else if (n1 < n2)
            System.out.println("La persona que pesa más es: "+nome2+ "y la diferencia de peso es: "+(n2 - n1));
        else 
            System.out.println("Las personas "+nome1+" y "+nome2+" pesan lo mismo");
    }
}
