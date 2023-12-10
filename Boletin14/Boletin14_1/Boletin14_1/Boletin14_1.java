package boletin14_01;
/*
Este programa é para utilizar distintos paquetes e obxectos como atributos .
Implementa un programa que amose:
*  todas as características dun ordenador  ,
* So  precio do ordenador 
* So a marca do teclado
* A velocidade da Cpu
Para eso  crea 2 paquetes :
* Un chamado boletín 14  . Éste ten:
* Clase principal .
* Clase Ordenador  con atributos  privates :
                        mo (tipo  Monitor )
                       te (tipo Teclado )
                       pro(tipo Procesador )
                       precio (tipo float)
* Outro paquete chamado partes 
*/

import partes.*;

public class Boletin14_01 {

    public static void main(String[] args) {
        
        Monitor obxM=new Monitor(16f);
        Teclado obxT=new Teclado("Samsung");
        Procesador obxP=new Procesador(8f);
        Ordenador ord1=new Ordenador(obxM,obxT,obxP,1000);
        System.out.println(ord1);
        
    }
    
}
