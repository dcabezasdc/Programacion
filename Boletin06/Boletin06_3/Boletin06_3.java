package boletin06_3;
/*
Implementa unha aplicación que nos permita traballar con circulos e circunferencias .Para eso crea a clase Circulo cas seguintes características :

atributos : radio ( tipo double )
Pi ( constante de tipo double e valor 3.14 )

métodos : *   constructores, sen e con parámetros
                 *  métodos de acceso
                 *   calcularArea : Non recibe nada e devolve o valor da área . Para calcular radio ^ 2 utiliza a clase Math e o método pow (….)
                 *  calcularLonxitude : Non recibe nada e devolve o valor da lonxitude da circunferencias
   
     Crea unha clase principal para comprobar que todo funciona ben
*/

public class Boletin06_3 {

    public static void main(String[] args) {
        //instanciamos objeto parametrizado
        Circulo c = new Circulo(6.5);
        
        c.calcularArea();
        c.calcularLonxitude();
    }    
}
