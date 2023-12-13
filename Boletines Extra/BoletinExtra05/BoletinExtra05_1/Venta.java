package extra_boletin5;

public class Venta {
    
    private long cantidad;
    private String metodopago;
    public final double PRECIO=78;
    public final double IVE=0.21;
    
    
    public String setMetodoPago(String metodopago){
       this.metodopago=metodopago;
       return metodopago;
    }
    
    public void setCantidad(long cantidad){
        this.cantidad=cantidad;
    }
    
    
    public double calcTotal(){
        
        double total = cantidad*PRECIO;
        return total*(1+IVE);
        
    }
    
    public void calcDesconto(){
        
        switch (metodopago){
            
            case "Efectivo":
                double descontoEfectivo = calcTotal()*0.10; 
                double totalEfectivo = calcTotal()-descontoEfectivo;
                System.out.println("O desaconto realizado e de "+descontoEfectivo);
                System.out.println("O total a pagar e "+totalEfectivo);
                break;
            case "Tarxeta de crédito":
                double descontoTarxeta = calcTotal()*0.05; 
                double totalTarxeta = calcTotal()-descontoTarxeta;
                System.out.println("O desaconto realizado e de "+descontoTarxeta);
                System.out.println("O total a pagar e "+totalTarxeta);
                break;
            case "Vale de regalo":
                double descontoVale= calcTotal()*0.15; 
                double totalVale = calcTotal()-descontoVale;
                System.out.println("O desaconto realizado e de "+descontoVale);
                System.out.println("O total a pagar e "+totalVale);
                break;
        }
        
    }
    
    public void mostrar(){
        
        System.out.println("O numero de impresoras a comprar son " + cantidad);
        System.out.println("O metodo de pago e "+metodopago);
        System.out.println("O prezo unitario da impresora aplicado o IVE e "+PRECIO*(1+IVE));
        System.out.println("O total sen desconto e "+calcTotal());
        calcDesconto();
        
    }   
}
