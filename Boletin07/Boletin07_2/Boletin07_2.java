/*
Implementa un programa no que se tecleen dous números de tipo short . Se o 
primeiro é maior ou igual que o segundo,visualizaremos a resta . En calquera 
caso visualizaremos a suma 
*/
package boletin07_2;

import javax.swing.JOptionPane;

public class Boletin07_2 {

    public static void main(String[] args) {
        Mayor obj = new Mayor();
        
        Short num1 = Short.parseShort(JOptionPane.showInputDialog("Ingrese el primer número"));
        Short num2 = Short.parseShort(JOptionPane.showInputDialog("Ingrese el segundo número"));
        
        obj.esMayor(num1, num2);
    }
}