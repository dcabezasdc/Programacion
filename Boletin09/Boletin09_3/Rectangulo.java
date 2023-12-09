package boletin09_3;

import javax.swing.JOptionPane;

public class Rectangulo {
    
        private double altura,base;
    
    public void calcularArea(){
        
        validadorAltura();
        validadorBase();

        double area = altura*base;
        System.out.println("A area e "+area);
        
    }
    
    public double validadorAltura(){
        
        do{
            altura = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la altura"));
        }while (altura<=0);
        
        return altura;
    }
    
    public double validadorBase(){
        
        do{
            base = Double.parseDouble(JOptionPane.showInputDialog("Introduzca la base"));
        }while (base<=0);
        
        return base;
    }    
}