package libreria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Libreria {
    private ArrayList<Libro> libros;

    public Libreria() {
        libros = new ArrayList<>();
    }

    public void añadirLibro(Libro libro) {
        libros.add(libro);
    }

    public void venderLibro(Libro libro) {
        if (libros == null) {
            throw new NullPointerException("La lista de libros está vacía.");
        }
        libros.remove(libro);
    }

    public void mostrarLibros() {
        if (libros == null) {
            throw new NullPointerException("La lista de libros está vacía.");
        }
        Collections.sort(libros, Comparator.comparing(Libro::getTitulo));
        for (Libro libro : libros) {
            System.out.println(libro.getTitulo());
        }
    }

    public void darDeBajaLibros() {
        if (libros == null) {
            throw new NullPointerException("La lista de libros está vacía.");
        }
        libros.removeIf(libro -> libro.getUnidades() == 0);
    }

    public Libro consultarLibro(String titulo) {
        if (libros == null) {
            throw new NullPointerException("La lista de libros está vacía.");
        }
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }
}
