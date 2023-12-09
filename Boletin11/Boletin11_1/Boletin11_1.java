/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package boletin11;

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