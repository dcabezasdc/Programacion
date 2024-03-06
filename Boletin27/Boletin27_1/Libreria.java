
package boletin27_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Libreria {
    private final List<Libro> libros;

    public Libreria() {
        this.libros = new ArrayList<>();
    }

    public void añadir(Libro libro) {
        libros.add(libro);
    }

    public void consultar(String nombreLibro) {
        boolean encontrado = false;
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombreLibro)) {
                System.out.println("El precio de " + nombreLibro + " es: " + libro.getPrecio());
                encontrado = true;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El libro " + nombreLibro + " no está en la librería.");
        }
    }

    public void mostrar() {
        System.out.println("Lista de libros en la librería:");
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public void borrar() {
        Iterator<Libro> iterator = libros.iterator();
        while (iterator.hasNext()) {
            Libro libro = iterator.next();
            if (libro.getUnidades() == 0) {
                iterator.remove();
            }
        }
    }

    public void modificar(String nombreLibro, double nuevoPrecio) {
        for (Libro libro : libros) {
            if (libro.getNombre().equals(nombreLibro)) {
                libro.setPrecio(nuevoPrecio);
                System.out.println("El precio del libro " + nombreLibro + " ha sido modificado.");
                return;
            }
        }
        System.out.println("El libro " + nombreLibro + " no está en la librería.");
    }
}
