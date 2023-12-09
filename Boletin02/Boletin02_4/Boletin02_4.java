package boletin02_4;
//Deseña un programa que lea 2 números e calcule : 1º a suma , despois a resta, 
//a continuación o producto e por último o cociente . Amosa o resultado de cada operación.

import java.util.Scanner;

public class Boletin02_4 {
   
    public static void main(String[] args) {
        float n1, n2;
      
        System.out.println("Introduce el primer número");
        Scanner numeroUno = new Scanner(System.in);
        n1 = numeroUno.nextFloat();
        
        System.out.println("Introduce el segundo número");
        Scanner numeroDos = new Scanner(System.in);
        n2 = numeroDos.nextFloat();
        
        float suma = n1 + (n2);
        float resta = n1 - (n2);
        float multiplicacion = n1 * n2;
        float division = n1 / n2;
        
        System.out.println("La suma= "+suma);
        System.out.println("La resta= "+resta);
        System.out.println("La multiplicación= "+multiplicacion);
        System.out.println("La división= "+division);
    }
}