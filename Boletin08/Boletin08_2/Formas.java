package boletin08_2;

import javax.swing.JOptionPane;

public class Formas {
    public void calcularCuadrado(){
     
        double lado = Double.parseDouble(JOptionPane.showInputDialog("Tecle la medida del lado"));
        double areacuadrado = lado*lado;
        System.out.println("A area do cadrado e: "+areacuadrado); 
    
    }
    
    public void calcularTriangulo(){
        
        double base = Double.parseDouble(JOptionPane.showInputDialog("Tecle la medida de la base"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Tecle la medida de la altura"));        
        double areatriangulo = base*altura/2;
        System.out.println("A area do cadrado e: "+areatriangulo); 
        
    }
    
    public void calcularCirculo(){
        
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Tecle la medida del radio"));
        double areacirculo = Math.PI*Math.pow(radio, 2);
        System.out.println("A area do circulo e: "+areacirculo);        
    }
}