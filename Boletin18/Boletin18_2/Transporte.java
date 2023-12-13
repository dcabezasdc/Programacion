package boletin18_2;

import javax.swing.JOptionPane;

public class Transporte {
    
    private float prezo;
    private int zona;
    private float peso;
    
    public void calcularEnvio(){
    
    peso=Float.parseFloat(JOptionPane.showInputDialog("Peso do paquete en kg"));
    
    if(peso>5||peso<0){
        JOptionPane.showMessageDialog(null, "Peso non válido, entrega rexeitada");
    }
    else{
        zona=Integer.parseInt(JOptionPane.showInputDialog("""
                                                          Seleccione o número correspondente á zona de localización 
                                                          1. Ámerica do Norte 
                                                          2. Ámerica Central 
                                                          3. Ámerica do Sur 
                                                          4. Europa 
                                                          5. Asia"""));
        
        switch(zona){
            case 1:
                prezo=24*peso;
                break;
            case 2:
                prezo=20*peso;
                break;
            case 3:
                prezo=21*peso;
                break;
            case 4:
                prezo=10*peso;
                break;
            case 5:
                prezo=18*peso;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
        }
        if(zona>=1&&zona<=5){
        JOptionPane.showMessageDialog(null, "Peso do paquete: "+peso+"kg"+"\nPrezo do envío: "+prezo+"€");
        }
        
    }
        
}
    
    
}
