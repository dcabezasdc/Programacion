/*
 Teclear un número e sacar por consola o signo “ + “ se o nº é positivo, 
o signo “ –“ se é negativo e “ 0 “ se é cero
*/
package boletin07_3;

import javax.swing.JOptionPane;

public class Boletin07_3 {

    public static void main(String[] args) {
        PositivoNegativoCero obj = new PositivoNegativoCero();
        
        int num = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un número"));
        
        obj.esPositivo(num);
    }
}