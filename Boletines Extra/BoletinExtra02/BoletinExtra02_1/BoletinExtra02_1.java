package boletinextra02_1;

import java.util.Scanner;

public class BoletinExtra02_1 {
   

   
      public static void main(String[] args) {
        float iva=21;
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce precio: ");
        float precio = sc.nextFloat();
        float precioIva= precio + (precio*(iva/100));
        System.out.print("O producto ten un prezo final de: "+precioIva+"€");
    }
}
