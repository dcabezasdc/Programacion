/*codifica un programa que saque, por consola, un número tecleado, 
sempre que sexa positivo,xunto coa mensaxe “ e positivo “*/
package boletin07_1;

import javax.swing.JOptionPane;

public class Boletin07_1 {

    public static void main(String[] args) {
        Positivo obj = new Positivo();
        
        double num = Double.parseDouble(JOptionPane.showInputDialog("Ingrese un número"));
        obj.esPositivo(num);
    }
    
}
