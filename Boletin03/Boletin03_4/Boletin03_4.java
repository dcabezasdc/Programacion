package boletin03_4;

import java.util.Scanner;

public class Boletin03_4 {

    public static void main(String[] args) {
        long euros, billetes100,billetes20, billetes5,moedas1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea el dinero:");
        euros = sc.nextLong();
        billetes100=euros/100;
        euros%=100;
        System.out.println("billetes100="+billetes100);
        billetes20=euros/20;
        euros%=20;
        System.out.println("billetes20="+billetes20);
        billetes5=euros/5;
        euros%=5;
        System.out.println("billetes5="+billetes5);
        moedas1=euros/1;
        System.out.println("moedas1="+moedas1);
    }
    
}
