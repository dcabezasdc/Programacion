/*
Dados 3 números que se supon distintos , indicar cal é o maior
*/
package boletin07_5;

import javax.swing.JOptionPane;

public class Boletin07_5 {

    public static void main(String[] args) {
        MayorQue obj = new MayorQue();
        
        Float n1 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el primer número"));
        Float n2 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el segundo número"));
        Float n3 = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el tercer número"));
        
        obj.mayor(n1, n2, n3);
    }
}