/*
Un almacen clasifica os seus productos según a seguinte táboa 
de vendas anuais:

Vendas anuais			artigo de consumo 
< = 100 productos			baixo
>100 e < = 500				medio
> 500 e < = 1000			alto
> 1000 					primeira necesidade

Coñecido o nome do artigo e as vendas anuais. Indicar de que tipo é.
*/
package boletin08_1;

public class Boletin08_1 {

    public static void main(String[] args) {
        
        Ventas obx = new Ventas();
        
        obx.calsificacionVentas();
    }
}