package boletin06_3;

public class Circulo {
    private double radio;
    public static final double PI=3.14;
    
    public Circulo(){
    }
    
    public Circulo(double r){
        radio = r;
    }
    
    public void calcularArea(){
        double area = Math.pow(radio, 2);
        System.out.println("El área es: " +area);
    }
    
    public void calcularLonxitude(){
        double lon = 2 * PI * radio;
        System.out.println("La longitud es: " +lon);
    }
}
