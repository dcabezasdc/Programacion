package boletin03_3;

import java.util.Scanner;

public class Boletin03_3 {

    public static void main(String[] args) {
        long billetes100,billetes20,billetes5,moedas1;
        Scanner sc = new Scanner(System.in);
        System.out.println("teclea numero de billetes de 100:");
        billetes100 = sc.nextLong();
        System.out.println("teclea numero de billetes de 20:");
        billetes20 = sc.nextLong();
        System.out.println("teclea numero de billetes de 5:");
        billetes5 = sc.nextLong();
        System.out.println("teclea numero de moedas de 1:");
        moedas1 = sc.nextLong();
        long euros=100*billetes100+20*billetes20+5*billetes5+moedas1;
        System.out.println("euros="+ euros +"€");
    }
    
}
