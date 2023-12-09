package boletin03_5;
//Fai o algoritmo e programa  que calcule o soldo bruto e líquido, a percibir, por unha persoa.
//Sabendo que o soldo total inclue os seguintes conceptos :

//	•	Soldo fixo. 
//	•	Comisión: 5% sobre importe total de vendas
//	•	Quilometraxe: 2 € por km
//	•	Dietas: 30 € por día de desprazamento .
//Para calcular o soldo líquido debemos descontarlle ao soldo bruto :
//	•	I.R.P.F. = 18 % do soldo total .
//	•	Retención a seguridade social: 36 € .

import java.util.Scanner;

public class Boletin03_5 {

    public static void main(String[] args) {
        double soldo,ventas,km,diasd;
        final int RETENCION=36;
        Scanner sc = new Scanner(System.in);
        System.out.println("Teclea o soldo:");    
        soldo = sc.nextDouble();
        System.out.println("Teclea o diñeiro das ventas:");
        ventas = sc.nextDouble();
        System.out.println("Teclea os km:");
        km = sc.nextDouble();
        System.out.println("teclea dias de desprazamento:");
        diasd = sc.nextDouble();
        double comision=0.05*ventas;
        double quilometraxe=2*km;
        double dietas=30*diasd;
        double sbruto=soldo+comision+quilometraxe+dietas;
        double sneto=sbruto-(sbruto*0.18-RETENCION);
        System.out.println("soldo bruto="+sbruto+"€"+"\nsoldo neto="+sneto+"€");
    }
    
}
