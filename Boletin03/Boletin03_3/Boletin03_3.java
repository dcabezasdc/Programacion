package boletin03_3;
//Fai un programa , para o software dunha máquina, que converta una cantidade enteira de diñeiro, que está
//en billetes de 100, 20, 5 e moedas de 1 € , no seu equivalente en euros 
//( exp.  2 billetes de 100, 3 -> 20 , 6 moedas de 1  visualizaríamos 266 € ).

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
