import java.util.*;

public class RutaUniversidad{
    private static Map<String, Map<String, Integer>> grafo = new HashMap<>();
    public static void main(String[] args) {
        agregarConexion("Sede Sur", "Autopista Simon Bolivar", 60);
        agregarConexion("Autopista Simon Bolivar", "Calle 25", 30);
        agregarConexion("Calle 5", "Calle 26", 120);
        agregarConexion("Calle 26", "Avenida 2 Norte", 90);
        agregarConexion("Avenida 2 Norte", "Avenida 6a Norte", 25);
        agregarConexion("Avenida 6A norte", "Sede Norte", 10);

        dijkstra("Sede Sur", "Sede Norte");

    }
    
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
        List<String> ruta = new ArrayList<>();
        String actual = fin;
        while (actual != null) {
            ruta.add(0, actual);
            actual = anteriores.get(actual);
        }
        }
    }
