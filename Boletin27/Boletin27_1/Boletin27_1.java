
package boletin27_1;

import java.util.Scanner;

public class Boletin27_1 {

   public static void main(String[] args) {
       
        Libreria libreria = new Libreria();
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nMenú:");
            System.out.println("1) Añadir libro");
            System.out.println("2) Consultar precio de un libro");
            System.out.println("3) Mostrar todos los libros");
            System.out.println("4) Borrar libros con 0 unidades");
            System.out.println("5) Modificar precio de un libro");
            System.out.println("0) Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcion) {
                case 1:
                    System.out.println("Introduce los datos del libro (nombre, autor, precio, unidades):");
                    String nombre = scanner.nextLine();
                    String autor = scanner.nextLine();
                    double precio = scanner.nextDouble();
                    int unidades = scanner.nextInt();
                    libreria.añadir(new Libro(nombre, autor, precio, unidades));
                    break;
                case 2:
                    System.out.print("Introduce el nombre del libro: ");
                    String nombreLibroConsulta = scanner.nextLine();
                    libreria.consultar(nombreLibroConsulta);
                    break;
                case 3:
                    libreria.mostrar();
                    break;
                case 4:
                    libreria.borrar();
                    System.out.println("Libros con 0 unidades eliminados.");
                    break;
                case 5:
                    System.out.print("Introduce el nombre del libro: ");
                    String nombreLibroModificacion = scanner.nextLine();
                    System.out.print("Introduce el nuevo precio: ");
                    double nuevoPrecio = scanner.nextDouble();
                    libreria.modificar(nombreLibroModificacion, nuevoPrecio);
                    break;
                case 0:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } 
    while (opcion != 0);
    }  
}
