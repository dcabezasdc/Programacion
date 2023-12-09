/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin11_2;

import javax.swing.JOptionPane;


public class Boletin11_2 {

    
    public static void main(String[] args) {
        
            while (true){
            
            Reglas obxR = new Reglas();
            
            //set reglas
            obxR.setNumero();
            obxR.setIntentos(Integer.parseInt(JOptionPane.showInputDialog(args)));
            
            int respuesta;
            int i = 0;
            
            
            do{

                respuesta = Integer.parseInt(JOptionPane.showInputDialog("Tecle a sua resposta"));
                
                int x = Math.abs(obxR.getNumero()-respuesta);
                
                if(x > 20){
                    i++;
                   System.out.println("Moi lonxe");
                }else if(x >= 10 && x <= 20){
                    i++;
                   System.out.println("Lonxe"); 
                }else if(x > 5 && x < 10){
                    i++;
                   System.out.println("Cerca");
                }else if(x <= 5){
                    i++;
                   System.out.println("Moi cerca");
                }
            }while (respuesta != obxR.getNumero() && i < obxR.getIntentos());
        }  
    }
}