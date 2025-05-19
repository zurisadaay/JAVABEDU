import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.*;

public class PlanificadorTemas {
    public static void main(String[] args) {
        // Paso 1: Lista concurrente
        CopyOnWriteArrayList<Tema> temas = new CopyOnWriteArrayList<>();

        temas.add(new Tema("Lectura comprensiva", 2));
        temas.add(new Tema("Matemáticas básicas", 1));
        temas.add(new Tema("Cuidado del medio ambiente", 3));

        // Paso 2: Mostrar orden alfabético (orden natural)
        System.out.println("📚 Lista de temas por orden alfabético:");
        Collections.sort(temas);
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Paso 3: Ordenar por prioridad (1 → 3)
        System.out.println("\n🚦 Lista de temas por prioridad:");
        temas.sort(Comparator.comparingInt(Tema::getPrioridad));
        for (Tema t : temas) {
            System.out.println(t);
        }

        // Paso 4: Mapa concurrente de recursos
        ConcurrentHashMap<String, String> recursos = new ConcurrentHashMap<>();
        recursos.put("Lectura comprensiva", "https://recursos.edu/lectura");
        recursos.put("Matemáticas básicas", "https://recursos.edu/mate");
        recursos.put("Cuidado del medio ambiente", "https://recursos.edu/medio");

        // Mostrar recursos asociados
        System.out.println("\n📎 Recursos asociados por tema:");
        for (Map.Entry<String, String> entry : recursos.entrySet()) {
            System.out.println("Tema: " + entry.getKey() + " → Recurso: " + entry.getValue());
        }
    }
}
