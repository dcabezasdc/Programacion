
package aplicacion;

import libreria.Libro;
import libreria.Libreria;
import javax.swing.JOptionPane;


public class Boletin24_1 {
    public static void main(String[] args) {
        Libreria libreria = new Libreria();
        int opcion;

        do {
            opcion=Integer.parseInt(JOptionPane.showInputDialog("""
                                                                
                                                                Menú:
                                                                1. Añadir libro
                                                                2. Vender libro
                                                                3. Mostrar libros
                                                                4. Dar de baja libros
                                                                5. Consultar libro
                                                                6. Salir
                                                                Elija una opción: """));
            switch (opcion) {
                case 1:
                    System.out.println("\nAñadir libro:");
                    String titulo=JOptionPane.showInputDialog("Titulo: ");
                    String autor =JOptionPane.showInputDialog("Autor: ");                   
                    String isbn =JOptionPane.showInputDialog("ISBN: ");
                    double precio =Double.parseDouble(JOptionPane.showInputDialog("Precio: "));                 
                    int unidades =Integer.parseInt(JOptionPane.showInputDialog("Unidades: "));
                    Libro nuevoLibro = new Libro(titulo, autor, isbn, precio, unidades);
                    libreria.añadirLibro(nuevoLibro);
                    System.out.println("Libro añadido correctamente.");
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("\nLibros disponibles:");
                    libreria.mostrarLibros();
                    break;
                case 4:
                    libreria.darDeBajaLibros();
                    System.out.println("Libros dados de baja correctamente.");
                    break;
                case 5:
                    System.out.println("\nConsultar libro:");
                    String tituloConsultar =JOptionPane.showInputDialog("Introduzca el título del libro: ");
                    Libro libroConsultado = libreria.consultarLibro(tituloConsultar);
                    if (libroConsultado != null) {
                        System.out.println("Libro encontrado:");
                        System.out.println("Título: " + libroConsultado.getTitulo());
                        System.out.println("Autor: " + libroConsultado.getAutor());
                        System.out.println("ISBN: " + libroConsultado.getIsbn());
                        System.out.println("Precio: " + libroConsultado.getPrecio());
                        System.out.println("Unidades: " + libroConsultado.getUnidades());
                    } else {
                        System.out.println("Libro no encontrado.");
                    }
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
            }
        } 
    while (opcion != 6);
    }
}
