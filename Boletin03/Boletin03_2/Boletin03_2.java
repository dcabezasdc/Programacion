package boletin03_2;
//Realiza o ordinograma e,despois codifica un programa que representa un algoritmo, que reciba como dato de 
//entrada o valor dunha temperatura expresada en graos centígrados e calcule o seu equivalente en graos 
//Fahrenheit e graos Kelvin.

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
