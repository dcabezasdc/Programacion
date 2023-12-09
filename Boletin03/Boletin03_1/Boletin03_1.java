package boletin03_1;
//Realiza o ordinograma  correspondente a un programa que saque por pantalla a 
// porcentaxe descontada nunha compra. Introducindo, por teclado, o prezo da tarifa
// e o prezo pagado. Fai un proxecto, de nome boletin3_1, para executar o programa  

import java.util.Scanner;

public class Boletin03_1 {

    public static void main(String[] args) {
        float prezotar,prezopag;
        Scanner sc = new Scanner(System.in);
        System.out.println("teclea prezo tarifa");
        prezotar = sc.nextFloat();
        System.out.println("teclea prezo pagado");
        prezopag= sc.nextFloat();
        int desconto=(int) (100-(prezopag/prezotar*100));
        System.out.print("desconto="+desconto + "%");
    }
    
}
