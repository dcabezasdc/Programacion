
package boletin21v_1;

import java.util.Arrays;
import java.util.Random;

public class ArrayInverso {
    
    public void crearArray(){
        int[] numeros = generarNumerosAleatorios(6, 1, 50);
        
        invertirArray(numeros);

        System.out.println("Array en orden inverso: " + Arrays.toString(numeros));
    }

    // Método para generar un array de números aleatorios en un rango dado
    private static int[] generarNumerosAleatorios(int cantidad, int minimo, int maximo) {
        Random random = new Random();
        int[] numeros = new int[cantidad];

        for (int i = 0; i < cantidad; i++) {
            numeros[i] = random.nextInt(maximo - minimo + 1) + minimo;
        }

        return numeros;
    }

    // Método para invertir un array
    private static void invertirArray(int[] array) {
        int inicio = 0;
        int fin = array.length - 1;

        while (inicio < fin) {
            // Intercambiar los elementos en las posiciones inicio y fin
            int temp = array[inicio];
            array[inicio] = array[fin];
            array[fin] = temp;

            inicio++;
            fin--;
        }
    }
    
}
