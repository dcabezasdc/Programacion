
package boletin22_1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;

public class Boletin22_1 {

    public static void main(String[] args) {
        Map<String, List<Integer>> tablaGoles = new HashMap<>();

        tablaGoles.put("Celta", List.of(3, 4, 2));
        tablaGoles.put("Bilbao", List.of(1, 2, 1));
        tablaGoles.put("Malaga", List.of(3, 0, 1));

        System.out.println("Tabla de goles por equipo y jornada:");
        for (Map.Entry<String, List<Integer>> entry : tablaGoles.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        List<String> equiposOrdenadosPorGoles = ordenarEquiposPorGoles(tablaGoles);
        System.out.println("\nEquipos por orden de menor número de goles: " + equiposOrdenadosPorGoles);

        Map<Integer, String> equipoMasGolesPorJornada = obtenerEquipoMasGolesPorJornada(tablaGoles);
        System.out.println("\nEquipo que marca más goles en cada jornada:");
        for (Map.Entry<Integer, String> entry : equipoMasGolesPorJornada.entrySet()) {
            System.out.println("Jornada " + entry.getKey() + ": " + entry.getValue());
        }

        String equipoMasGoles = obtenerEquipoConMasGoles(tablaGoles);
        System.out.println("\nEquipo con más goles: " + equipoMasGoles);

        consultarGolesPorEquipoYJornada(tablaGoles, JOptionPane.showInputDialog("Teclee el equipo que quiera consultar"), Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de la jornada")));
    }

    private static List<String> ordenarEquiposPorGoles(Map<String, List<Integer>> tablaGoles) {
        List<String> equiposOrdenados = new ArrayList<>(tablaGoles.keySet());
        equiposOrdenados.sort((equipo1, equipo2) -> {
            int golesEquipo1 = tablaGoles.get(equipo1).stream().mapToInt(Integer::intValue).sum();
            int golesEquipo2 = tablaGoles.get(equipo2).stream().mapToInt(Integer::intValue).sum();
            return Integer.compare(golesEquipo1, golesEquipo2);
        });
        return equiposOrdenados;
    }

    private static Map<Integer, String> obtenerEquipoMasGolesPorJornada(Map<String, List<Integer>> tablaGoles) {
        Map<Integer, String> equipoMasGolesPorJornada = new HashMap<>();
        for (int jornada = 1; jornada <= 3; jornada++) {
            final int jornadaActual = jornada;
            tablaGoles.entrySet().stream()
                    .max((entry1, entry2) -> Integer.compare(entry1.getValue().get(jornadaActual - 1),
                            entry2.getValue().get(jornadaActual - 1)))
                    .ifPresent(entry -> equipoMasGolesPorJornada.put(jornadaActual, entry.getKey()));
        }
        return equipoMasGolesPorJornada;
    }

    private static String obtenerEquipoConMasGoles(Map<String, List<Integer>> tablaGoles) {
        String equipoMasGoles = "";
        int maxGoles = Integer.MIN_VALUE;

        for (Map.Entry<String, List<Integer>> entry : tablaGoles.entrySet()) {
            int totalGolesEquipo = entry.getValue().stream().mapToInt(Integer::intValue).sum();
            if (totalGolesEquipo > maxGoles) {
                maxGoles = totalGolesEquipo;
                equipoMasGoles = entry.getKey();
            }
        }
        return equipoMasGoles;
    }

    private static void consultarGolesPorEquipoYJornada(Map<String, List<Integer>> tablaGoles, String equipo, int jornada) {
        if (tablaGoles.containsKey(equipo) && jornada >= 1 && jornada <= 36) {
            int goles = tablaGoles.get(equipo).get(jornada - 1);
            System.out.println("\nConsulta para " + equipo + " en la jornada " + jornada + ": " + goles + " goles");
        } else {
            System.out.println("\nConsulta no válida para equipo o jornada.");
        }
    }
}

    

