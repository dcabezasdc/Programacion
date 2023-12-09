package boletin09_4;
/*
Codifica un programa que solicite  un número e, visualice a táboa de multiplicar dese número. O programa rematara cando prememos o cero.
*/

import javax.swing.JOptionPane;


public class Boletin09_4 {


    public static void main(String[] args) {
        
        TablaMultiplicar obx = new  TablaMultiplicar();
        
        //double num = obx.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Tecle un numero")));
        
        /*while (num<0||num>0){
        
        do{
            
            num = obx.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Tecle un numero")));
            
        }while (num<1||num>10);    
        
        obx.mostrarTabla();
        
        }*/
        
        
        while (true){
            
            double num = obx.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Tecle un numero")));
            
            if (num==0){
                break;
            }else if (num<1||num>10){
                num = obx.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Tecle un numero")));
                continue;
            }
            
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
}
