/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package boletin12_1;

import javax.swing.JOptionPane;


public class Boletin12_1 {


    public static void main(String[] args) {
        
        boolean cerrarPrograma = false;
        
        Garaje obxG = new Garaje();

        do{
            
            String opcion = JOptionPane.showInputDialog("Telcee a operacion a realizar \n-Salir\n-Aparcar\n-Desaparcar");
            
            switch (opcion){
                case "Salir":
                    cerrarPrograma = true;
                    break;
                case "Aparcar":
                    obxG.comprovarAparcar();
                    break;
                case "Desaparcar":   
                    obxG.desaparcar();
                    break;
                default:
                    cerrarPrograma = true;
                    break;
            }
        }while (cerrarPrograma == false);
    }
}