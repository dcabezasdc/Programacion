package boletin05_1;

import java.util.Scanner;

public class Boletin05_1 {

    public static void main(String[] args) {
        Consumo obxCon= new Consumo();
        obxCon.setLitros(50f);
        obxCon.setpGas(1.57f);
        
        Scanner sc= new Scanner(System.in);
        System.out.println("teclea os kilometros:");
        float km=sc.nextFloat();
        System.out.println("teclea os litros:");
        float litros=sc.nextFloat();
        System.out.println("teclea a velocidade media:");
        float vMed=sc.nextFloat();
        System.out.println("teclea o prezo do gas:");
        float pGas=sc.nextFloat();
        Consumo obxC= new Consumo(km,litros,vMed,pGas);
        obxC.consumoMedio();
        obxC.consumoPrezo();
    }   
}
