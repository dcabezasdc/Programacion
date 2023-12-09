/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin11;

import javax.swing.JOptionPane;

public class Reglas {
    
    private int numero;
    private int intentos;
    
    public void setNumero(int numero){
        
        while (numero > 50 || numero < 1){
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea o numero a adivinar"));
        
        }
        
        this.numero = numero;
    }
    
    public void setIntentos(int intentos){

        this.intentos = intentos;
    }
    
    public int getNumero(){

        return numero;
    }
    
    public int getIntentos(){

        return intentos;
    }
}