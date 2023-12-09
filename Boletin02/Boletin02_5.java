package boletin02_5;
//Escribe un programa que lea o valor dunha distancia en millas mariñas e a pase a metros 
//( 1 milla mariña = 1852 m ).

import java.util.Scanner;

public class Boletin02_5 {

    public static void main(String[] args) {
        float millas;
        System.out.println("Introduce el número de millas marinas:");
        Scanner millasMarinas = new Scanner(System.in);
        millas = millasMarinas.nextFloat();
        
        float metros = millas * 1852;
        System.out.println(millas+" millas marinas son "+metros+"metros");
    }
}
