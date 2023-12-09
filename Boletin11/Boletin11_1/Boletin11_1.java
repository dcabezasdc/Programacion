package boletin11;
/*
Codifica un programa que permita o seguinte xogo  para adiviñar un número .
O primeiro xogador  teclea ( utilizando a clase JoptionPane ), un número a adiviñar 
( entre 1 e 50 ) e o número máximo de intentos que ten o segundo xogador para dar con el. 
O programa irá sacando por pantaia mensaxes que orienten o segundo xogador sobre se o número 
tecleado e maior ou menor que o número a adiviñar . Fai o programa repetitivo.
*/

import javax.swing.JOptionPane;

public class Boletin11 {


    public static void main(String[] args) {

        while (true){
            
            Reglas obxR = new Reglas();
            
            //set reglas
            obxR.setNumero(Integer.parseInt(JOptionPane.showInputDialog("Teclea o numero a adivinar")));
            obxR.setIntentos(Integer.parseInt(JOptionPane.showInputDialog("Teclea o numero de intentos")));
            
            int respuesta;
            int i = 0;
            
            do{

                respuesta = Integer.parseInt(JOptionPane.showInputDialog("Tecle a sua resposta"));
                
                if(respuesta > obxR.getNumero()){
                    i++;
                   System.out.println("O numero e menor que "+respuesta);
                }else if(respuesta < obxR.getNumero()){
                    i++;
                   System.out.println("O numero e maior que "+respuesta); 
                }
            }
            while (respuesta != obxR.getNumero() && i < obxR.getIntentos());
        }
    }
}
