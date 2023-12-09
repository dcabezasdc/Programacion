/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package boletin12_1;

import javax.swing.JOptionPane;

public class Garaje {
    
    private static final int MAX_COCHES = 5;
    
    private static int numeroCoches = 0;
    
    private Coche coche;
    
    public void comprovarAparcar(){
        
        if (numeroCoches != MAX_COCHES){
            System.out.println("PLAZAS DISPOÑIBLES");   
            coche = darAltaCoche();
            numeroCoches++;            
        }else if (numeroCoches == MAX_COCHES){
            System.out.println("COMPLETO");
        }
    }
    
    public void desaparcar(){
        
        if (numeroCoches <= 0){
            System.out.println("APARCADOIRO LIBRE");
        }else{
            
            numeroCoches--;
            
            float importe = ticket(coche);
            float pagoTotal =  0;
            
            do{
                
            JOptionPane.showMessageDialog(null, "Importe: " +importe);
            float pago = Float.parseFloat(JOptionPane.showInputDialog("Introduza el pago"));
            
            importe = importe - pago;
            pagoTotal += pago;
                
            }while (importe > 0);
            
            float cambio = pagoTotal - importe;
        
            JOptionPane.showMessageDialog(null, 
                "FACTURA\n" +
                "MATRICULA COCHE ........"+coche.getMatricula()+"\n" +
                "TEMPO ................."+coche.getHoras()+" h\n" +
                "PRECIO..............."+ticket(coche)+" €\n" +
                "CARTOS RECIBIDOS..........."+pagoTotal+" €\n" +
                "CARTOS DEVOLTOS............"+cambio+" €\n" +
                "\n" +
                "GRACIAS POR USAR O NOSO APARCADOIRO ");
        }   
    }
    
    public static Coche darAltaCoche(){
        
        Coche obxC = new Coche(); 
        
        obxC.setMatricula(JOptionPane.showInputDialog("Tecle a matricula"));
        obxC.setMarca(JOptionPane.showInputDialog("Tecle a marca"));
        obxC.setHorasAparcado();
        
        return obxC;
    } 
    
    public float ticket(Coche coche){
        
        int horas = coche.getHoras();
        
        float total;
        
        if (horas <= 3){
            total = (float) 1.5;
        }else{
            total = (float) ((horas-3)*0.20+1.5);
        }
        
        return total;
    }
}