
package boletin26_1;

import java.util.List;

public class Operaciones<T extends Comparable<T>> {

    public T minimo(List<T> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        T min = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            T elemento = lista.get(i);
            if (elemento.compareTo(min) < 0) {
                min = elemento;
            }
        }
        return min;
    }

    public T maximo(List<T> lista) {
        if (lista.isEmpty()) {
            throw new IllegalArgumentException("La lista no puede estar vacía");
        }

        T max = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            T elemento = lista.get(i);
            if (elemento.compareTo(max) > 0) {
                max = elemento;
            }
        }
        return max;
    }

    public int buscar(List<T> lista, T objeto) {
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).equals(objeto)) {
                return i;
            }
        }
        return -1;
    }
    public T borrarPrimeraAparicion(List<T> lista, T objeto) {
        int indice = buscar(lista, objeto);
        if (indice != -1) {
            return lista.remove(indice);
        }
        return null;
    }
}
