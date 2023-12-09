package boletin07_2;

public class Mayor {
    private short n1, n2;
    
    //constructor
    public Mayor(){
    }
    
    //método
    public void esMayor(short n1, short n2){
        if ( n1 >= n2)
            System.out.println(n1 - n2);
        else 
            System.out.println(n1 + n2);
    }
}
