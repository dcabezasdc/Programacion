package boletin09_1;

import javax.swing.JOptionPane;

public class LerDatos {
    public static int lerEnteiro(String mensaxe){
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;
        
        //otro modo 
       //return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
}