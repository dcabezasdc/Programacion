
package boletin21_3;

import java.util.Arrays;
import java.util.Scanner;

public class Boletin21_3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Tamaño del array (número de alumnos)
        int numeroAlumnos = 30;

        // Crear arrays para almacenar los nombres y las notas de los alumnos
        String[] nombres = new String[numeroAlumnos];
        int[] notas = new int[numeroAlumnos];

        // Cargar los arrays con los nombres y las notas
        cargarAlumnos(nombres, notas, scanner);

        // Visualizar la nota de un alumno determinado
        visualizarNotaAlumno(nombres, notas, scanner);

        // Visualizar una lista con los nombres de los alumnos aprobados
        visualizarAlumnosAprobados(nombres, notas);

        // Visualizar una lista ordenada por orden creciente de notas
        visualizarListaOrdenada(nombres, notas);

        // Visualizar la nota de un alumno determinado que se pide por teclado
        visualizarNotaPorNombre(nombres, notas, scanner);
    }

    // Método para cargar los arrays con los nombres y las notas
    private static void cargarAlumnos(String[] nombres, int[] notas, Scanner scanner) {
        System.out.println("Introduce los nombres y las notas de los alumnos:");

        for (int i = 0; i < nombres.length; i++) {
            System.out.print("Nombre del alumno " + (i + 1) + ": ");
            nombres[i] = scanner.next();

            System.out.print("Nota del alumno " + (i + 1) + ": ");
            notas[i] = scanner.nextInt();
        }
    }

    // Método para visualizar la nota de un alumno determinado
    private static void visualizarNotaAlumno(String[] nombres, int[] notas, Scanner scanner) {
        System.out.print("Introduce el nombre del alumno para ver su nota: ");
        String nombreBuscado = scanner.next();

        int indice = buscarIndicePorNombre(nombreBuscado, nombres);

        if (indice != -1) {
            System.out.println("La nota de " + nombres[indice] + " es: " + notas[indice]);
        } else {
            System.out.println("No se encontró al alumno con ese nombre.");
        }
    }

    // Método para visualizar una lista con los nombres de los alumnos aprobados
    private static void visualizarAlumnosAprobados(String[] nombres, int[] notas) {
        System.out.println("Lista de alumnos aprobados:");

        for (int i = 0; i < nombres.length; i++) {
            if (notas[i] >= 5) {
                System.out.println(nombres[i] + ": " + notas[i]);
            }
        }
    }

    // Método para visualizar una lista ordenada por orden creciente de notas
    private static void visualizarListaOrdenada(String[] nombres, int[] notas) {
        int[] copiaNotas = Arrays.copyOf(notas, notas.length);
        String[] copiaNombres = Arrays.copyOf(nombres, nombres.length);

        Arrays.sort(copiaNotas);

        System.out.println("Lista ordenada por orden creciente de notas:");
        for (int i = 0; i < copiaNotas.length; i++) {
            int indiceOriginal = buscarIndicePorNota(copiaNotas[i], notas);
            System.out.println(copiaNombres[indiceOriginal] + ": " + copiaNotas[i]);
        }
    }

    // Método para visualizar la nota de un alumno determinado que se pide por teclado
    private static void visualizarNotaPorNombre(String[] nombres, int[] notas, Scanner scanner) {
        System.out.print("Introduce el nombre del alumno para ver su nota (teclado): ");
        String nombreBuscado = scanner.next();

        int indice = buscarIndicePorNombre(nombreBuscado, nombres);

        if (indice != -1) {
            System.out.println("La nota de " + nombres[indice] + " es: " + notas[indice]);
        } else {
            System.out.println("No se encontró al alumno con ese nombre.");
        }
    }

    // Método para buscar el índice de un alumno por nombre
    private static int buscarIndicePorNombre(String nombreBuscado, String[] nombres) {
        for (int i = 0; i < nombres.length; i++) {
            if (nombreBuscado.equals(nombres[i])) {
                return i;
            }
        }
        return -1;
    }

    // Método para buscar el índice de un alumno por nota
    private static int buscarIndicePorNota(int notaBuscada, int[] notas) {
        for (int i = 0; i < notas.length; i++) {
            if (notaBuscada == notas[i]) {
                return i;
            }
        }
        return -1;
    }
}
