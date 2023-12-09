package boletin06_1;

import java.util.Scanner;

public class Boletin06_1 {

    public static void main(String[] args) {
        Scanner coche = new Scanner(System.in);
        int velocidade, valor, menos;
        
        //instanciamos objeto coche sin parámetros
        Coche objCoche = new Coche();
        
        objCoche.setVelocidade(150);
        
        System.out.println("Ingrese el valor de la aceleración: ");
        valor = coche.nextInt();
        objCoche.acelerar(valor);
        
        System.out.println("Ingrese el valor de frenado: ");
        menos = coche.nextInt();
        objCoche.frenar(menos);
    }
    
}
