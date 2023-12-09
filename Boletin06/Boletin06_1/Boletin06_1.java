package boletin06_1;
/*
Temos a seguinte clase Coche:

public class Coche {
     private int velocidade ;

    public Coche(){
    velocidade =0 ;
}

Engade a clase Coche os seguintes métodos :

public int getVelocidade() . Este método devolve a velocidade actual

public void acelerar (int valor) .Este método incrementa a velocidade na cantidade valor

public void frenar (int menos).Este método diminue a velocidade na cantidade menos.

Crea a clase Boletin 6_1 para comprobar que o programa se executa ben .dandolle os valores que precises.
*/

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
