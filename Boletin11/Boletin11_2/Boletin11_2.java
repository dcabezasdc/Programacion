/*
Programa o exercicio  anterior para xogar contra o ordenador . Para eso, o ordenador xenera un número aleatorio, 
entre 1 e 50 ,.Este programa dará as seguintes pistas sobre lonxe que esté de adivinar o número :
Se a distancia entre o número a adivinar e o tecleado é maior de 20  “ moi lonxe “
Entre 10 e 20 , ambos incluidos,  lonxe
Maior de 10 e menor de 5  preto
Menor ou igual de 5  moi preto .    
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
