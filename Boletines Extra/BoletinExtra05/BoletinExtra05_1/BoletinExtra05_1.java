package extra_boletin5;

import javax.swing.JOptionPane;


public class Extra_boletin5 {


    public static void main(String[] args) {
       
       Venta obx=new Venta();
        /*
       switch (metodopago = JOptionPane.showInputDialog("Indique el metodo de pago: Efectivo||Tarxeta de crédito||Vale de regalo")){
           
           case "Efectivo": 
               obx.mostrar();
               break;
           case "Tarxeta de crédito":
               obx.mostrar();    
               break;
           case "Vale de regalo":
               obx.mostrar();
               break;
           default: 
               System.out.println("Metodo no valido, pruebe con otro metodo");                  
       } */
        
        switch (obx.setMetodoPago(JOptionPane.showInputDialog("Indique el metodo de pago: Efectivo||Tarxeta de crédito||Vale de regalo"))){
           
           case "Efectivo":
               obx.setCantidad(Long.parseLong(JOptionPane.showInputDialog("Indique a cantidade de impresoras")));
               obx.mostrar();
               break;
           case "Tarxeta de crédito":
               obx.mostrar();    
               break;
           case "Vale de regalo":
               obx.mostrar();
               break;
           default: 
               System.out.println("Metodo no valido, pruebe con otro metodo");                  
       }
    }
    
}
