package boletin08_1;

import javax.swing.JOptionPane;

public class Ventas {
    public void calsificacionVentas(){
        
       long ventas = Long.parseLong(JOptionPane.showInputDialog("tecle as ventas anuais")); 
       
       if (ventas<=100){
           System.out.println("baixo");
       }else if (ventas>100&&ventas<=500){
           System.out.println("medio");
       }else if (ventas>500&&ventas<=1000){
           System.out.println("alto");
       }else{
           System.out.println("primeira necesidade");
       }  
    }
}