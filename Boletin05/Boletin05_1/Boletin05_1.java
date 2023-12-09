package boletin05_1;
/*
Implementa unha clase consumo, que forma parte da centralita electrónica dun coche e ten as seguintes características :
Atributos :
km   kilómetros percorridos polo coche
litros  Litros de combustible consumidos
vMedvelocidade media
pGas  Prezo da gasolina
Metodos :
Dous constructores , un con parámetros e outro sen eles, que inicializan os  valores dos atributos
getTempo  Indica o tempo empregado en realizar a viaxe
consumoMedio consumo medio do vehículo ( en litros cada 100 km )
consumoEuros consumo medio( en € cada 100 km )
setKms  modifica o valor dos km
setLitros “             “  “       “    litros                      
setvMed   “            “              vMed
 setPGas  “”             “             pGas.

Na clase principal :
	•	Crea un obxecto, de tipo consume, utilizando o constructor sen parámetros
	•	Dalle a litros o valor 50 e a prezo da gasolina 1.57
	•	Crea un obxecto, tipo consumo, utilizando o contructor con todos os parámetros
	•	Visualiza, a  través do 2º obxecto, o consumo medio
	•	Varia o valor dos litros consumidos do 2º obxecto.
	•	Visualiza a velocidade media do 2º obxecto.
*/

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
