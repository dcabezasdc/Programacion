package boletin09_5;

import javax.swing.JOptionPane;

public class LerDatos {
    
    public static int lerEnteiro(String mensaxe){
        int resposta = Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
        return resposta;
        
        //otro modo 
       //return Integer.parseInt(JOptionPane.showInputDialog(mensaxe));
    }
    
    public static float lerFloatPositivo(String mensaxe){
       
        float dato;
        
        do{
   
        dato = Float.parseFloat(JOptionPane.showInputDialog(mensaxe));

        }while (dato<=0);
        
        return dato;
    }
    
    public static double lerDoublePositivo(String mensaxe){
       
        double dato;
        
        do{
   
        dato = Double.parseDouble(JOptionPane.showInputDialog(mensaxe));

        }while (dato<0);
        
        return dato;
    }
}