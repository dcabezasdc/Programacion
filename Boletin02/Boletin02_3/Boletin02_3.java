package boletin02_3;
//Crea un algoritmo que cambie euros a dólares ( O cambio pídese por teclado )

import java.util.Scanner;

public class Boletin02_3 {

    public static void main(String[] args) {
        double €,cambio;
        Scanner sc = new Scanner(System.in);
        System.out.println("teclea €:");
        € = sc.nextDouble();
        System.out.println("teclea cambio:");
        cambio= sc.nextDouble();
        double $=€*cambio;
        System.out.println(€+"€="+$+"$");
    }   
}
