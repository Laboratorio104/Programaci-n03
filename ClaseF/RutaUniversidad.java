import java.util.*;

// Este programa implementa el algoritmo de Dijkstra para hallar la ruta más corta
// desde la sede sur hasta la sede norte de una universidad, usando tiempos estimados como pesos.

public class RutaUniversidad {

    // Mapa que representa el grafo: cada lugar se conecta con otros lugares y tiene un peso (tiempo)
    private static Map<String, Map<String, Integer>> grafo = new HashMap<>();

    public static void main(String[] args) {

        // Construcción del grafo según los puntos proporcionados y los tiempos entre ellos (en minutos)
        agregarConexion("Sede Sur", "Autopista Simón Bolívar", 60);
        agregarConexion("Autopista Simón Bolívar", "Calle 25", 30);
        agregarConexion("Calle 25", "Calle 26", 120);
        agregarConexion("Calle 26", "Avenida 2 Norte", 90);
        agregarConexion("Avenida 2 Norte", "Avenida 6A Norte", 25);
        agregarConexion("Avenida 6A Norte", "Sede Norte", 10);

        // Ejecutar Dijkstra para hallar la ruta más corta
        dijkstra("Sede Sur", "Sede Norte");
    }

    // Método para agregar una conexión bidireccional al grafo
    private static void agregarConexion(String origen, String destino, int tiempo) {
        grafo.computeIfAbsent(origen, k -> new HashMap<>()).put(destino, tiempo);
        grafo.computeIfAbsent(destino, k -> new HashMap<>()).put(origen, tiempo); // Si es bidireccional
    }

    // Implementación de Dijkstra
    private static void dijkstra(String inicio, String fin) {
        Map<String, Integer> distancias = new HashMap<>();
        Map<String, String> anteriores = new HashMap<>();
        PriorityQueue<String> cola = new PriorityQueue<>(Comparator.comparingInt(distancias::get));

        // Inicializar distancias a infinito excepto la de inicio
        for (String nodo : grafo.keySet()) {
            distancias.put(nodo, Integer.MAX_VALUE);
        }
        distancias.put(inicio, 0);
        cola.add(inicio);

        while (!cola.isEmpty()) {
            String actual = cola.poll();
            for (Map.Entry<String, Integer> vecino : grafo.get(actual).entrySet()) {
                int nuevaDistancia = distancias.get(actual) + vecino.getValue();
                if (nuevaDistancia < distancias.get(vecino.getKey())) {
                    distancias.put(vecino.getKey(), nuevaDistancia);
                    anteriores.put(vecino.getKey(), actual);
                    cola.add(vecino.getKey());
                }
            }
        }

        // Mostrar la ruta más corta
        List<String> ruta = new ArrayList<>();
        String actual = fin;
        while (actual != null) {
            ruta.add(0, actual);
            actual = anteriores.get(actual);
        }

        System.out.println("Ruta más corta de " + inicio + " a " + fin + ":");
        for (int i = 0; i < ruta.size(); i++) {
            System.out.print(ruta.get(i));
            if (i < ruta.size() - 1) System.out.print(" -> ");
        }
        System.out.println("\nTiempo total estimado: " + distancias.get(fin) + " minutos");
    }
}