package boletin18_1;

import javax.swing.JOptionPane;


public class Chamada {
    
    private double prezo;
    private double prezofinal;
    private int tempo;
    private int dia;
    
    public void prezoChamada(){
        int salir;
        
        do{    
        salir=Integer.parseInt(JOptionPane.showInputDialog("Quere continuar no programa? \n1.Si \n2.Non"));
        if(salir==1){
        tempo=Integer.parseInt(JOptionPane.showInputDialog("Duración da chamada en minutos"));
        if(tempo<=5){
        prezo=1;
    }
        else if(tempo>5&&tempo<=8){
           prezo=1.8; 
        }
        
        else if(tempo>8&&tempo<=10){
           prezo=2.5;
        }
        else if(tempo>10){
           prezo=2.5+((tempo-10)*0.5); 
        }
        
        
        dia=Integer.parseInt(JOptionPane.showInputDialog("Seleccione a opción correspondente ao momento da chamada \n 1.De luns a sábado pola mañá \n 2.De luns a sábado pola tarde \n 3.Domingo"));
        
        switch(dia){
            
            case 1:
            prezofinal=prezo+prezo*0.15;
                break; 
            case 2:
            prezofinal=prezo+prezo*0.10;
                break;
            case 3:
            prezofinal=prezo+prezo*0.03;
                break;
                
            default:
                System.out.println("Opción seleccionada non válida");
        }
        
        JOptionPane.showMessageDialog(null, "Duración da chamada: "+tempo+" minutos"+"\nPrezo final da chamada: " +prezofinal+"€");
        }
        }while(salir==1);  
    }
        
    
    
}
