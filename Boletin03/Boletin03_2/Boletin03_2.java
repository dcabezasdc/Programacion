package boletin03_2;

import java.util.Scanner;

public class Boletin03_2 {

    public static void main(String[] args) {
        double gradosC,Kelvin,Fahrenheit;
        Scanner sc= new Scanner(System.in);
        System.out.println("Teclea los grados centígrados:");
        gradosC = sc.nextFloat();
        Kelvin=gradosC+273.15;
        Fahrenheit=gradosC*1.8+32;
        System.out.println("Kelvin="+Kelvin+"K"+"\nFahrenheit="+ Fahrenheit+"F");
    }
    
}
