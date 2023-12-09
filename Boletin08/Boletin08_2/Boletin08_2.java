package boletin08_2;
/*
Codifica un programa que, utilizando un menú de opcións, calcule a superficie de distintas figuras. 

O usuario premerá a opción desexada. Según ésta o programa pediralle os datos precisos e, utilizando un switch…case visualizará o resultado.

No caso de premer unha opción que non teña o menú visualizar unha mensaxe de “opción incorrecta“.

1…. Cadrado
2…. Triangulo
3…. Circulo
*/

import javax.swing.JOptionPane;

public class Boletin08_2 {

    public static void main(String[] args) {
        Formas obx = new Formas();
        
        
        String figura = JOptionPane.showInputDialog("Indique la figura");
        
            switch (figura) {
            
            case "Cadrado": 
                
                obx.calcularCuadrado();
                break;
                
            case "Triangulo":
                
                obx.calcularTriangulo();
                break;
            
            case "Circulo":
                
                obx.calcularCirculo();
                break;
            default:
                System.out.println("opción incorrecta");
                break;    
            }
    }   
}
