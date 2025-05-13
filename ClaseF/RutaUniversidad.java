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