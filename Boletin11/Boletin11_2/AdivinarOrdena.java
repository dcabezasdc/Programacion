/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package boletin11_2;

public class Reglas {
    
    private int numero;
    private int intentos;
    
    public void setNumero(){
        
       int numero;
       double x = Math.random() * 50 +1 ;
       numero= (int) x;
       this.numero=numero;
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