package boletin09_4;

import javax.swing.JOptionPane;

public class TablaMultiplicar {
    
    private int num;
    
    
    public int setNumero(int num){
        
        this.num =num;
        
        /*while(num<1||num>10){
            
            num = Integer.parseInt(JOptionPane.showInputDialog("Tecle un numero"));
        }*/
        
        
        return num;
    }
    
    
    public void mostrarTabla(){
        
        System.out.println(num+" x 0 = "+num*0);
        System.out.println(num+" x 1 = "+num*1);
        System.out.println(num+" x 2 = "+num*2);
        System.out.println(num+" x 3 = "+num*3);
        System.out.println(num+" x 4 = "+num*4);
        System.out.println(num+" x 5 = "+num*5);
        System.out.println(num+" x 6 = "+num*6);       
        System.out.println(num+" x 7 = "+num*7);  
        System.out.println(num+" x 8 = "+num*8); 
        System.out.println(num+" x 9 = "+num*9); 
        System.out.println(num+" x 10 = "+num*10); 
    }
}