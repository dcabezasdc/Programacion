/*
Codifica un programa que  Lea o soldo de cada un dos traballadores dunha empresa e obteña o número deles que ganan entre 1000 e 1750 €, 
ámbolos dous incluidos e, a porcentaje de traballadores que ganan menos de 1000 €.Tendo en conta que non se coñece con antelación o numero 
de traballadores da empresa e non se admiten os soldos negativos.( utiliza como condidión de fin un soldo 0 ). 
*/
package boletin09_5;

public class Boletin09_5 {


    public static void main(String[] args) {

        int sueldoentre10001750 = 0; 
        int sueldomenos1000 = 0; 
        int trabajadores = 0; 
    
        double salario = LerDatos.lerDoublePositivo("Tecle el sueldo");
    
        while(salario != 0){
        
            if (salario<1000){
                sueldomenos1000++;
                trabajadores++;
            }
            
            else if (salario<=1750&&salario>=1000){
                sueldoentre10001750++;
                trabajadores++;
            }    
       
            salario = LerDatos.lerDoublePositivo("Tecle el sueldo"); 
        }
       
        System.out.println("Numero de trabajadores que ganan entre 1000 y 1750€: "+sueldoentre10001750);   
        System.out.println("Porcentage de trabajadores que ganan menos de 1000€: "+sueldomenos1000/trabajadores*100);
    }
}