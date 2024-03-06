
package boletin21_2;

import java.util.Scanner;

public class Boletin21_2 {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numeroAlumnos = 30;

        int[] notas = new int[numeroAlumnos];

        cargarNotas(notas, scanner);

        visualizarAprobadosSuspensos(notas);

        double notaMedia = calcularNotaMedia(notas);
        System.out.println("Nota media de la clase: " + notaMedia);

        int notaMaxima = obtenerNotaMaxima(notas);
        System.out.println("Nota más alta: " + notaMaxima);
    }

    private static void cargarNotas(int[] notas, Scanner scanner) {
        System.out.println("Introduce las notas de los alumnos:");

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
    }

    private static void visualizarAprobadosSuspensos(int[] notas) {
        int aprobados = 0;
        int suspensos = 0;

        for (int nota : notas) {
            if (nota >= 5) {
                aprobados++;
            } else {
                suspensos++;
            }
        }

        System.out.println("Número de aprobados: " + aprobados);
        System.out.println("Número de suspensos: " + suspensos);
    }

    private static double calcularNotaMedia(int[] notas) {
        int total = 0;

        for (int nota : notas) {
            total += nota;
        }

        return (double) total / notas.length;
    }

    private static int obtenerNotaMaxima(int[] notas) {
        int maxima = notas[0];

        for (int nota : notas) {
            if (nota > maxima) {
                maxima = nota;
            }
        }

        return maxima;
    }
}
