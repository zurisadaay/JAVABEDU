import java.util.*;

public class LaboratorioBioinformatica {
    public static void main(String[] args) {
        // Paso 1: ArrayList para registrar el orden de llegada de las muestras
        List<String> ordenMuestras = new ArrayList<>();
        ordenMuestras.add("Homo sapiens");
        ordenMuestras.add("Mus musculus");
        ordenMuestras.add("Arabidopsis thaliana");
        ordenMuestras.add("Homo sapiens");
        ordenMuestras.add("Mus musculus");

        // Paso 2: HashSet para especies únicas
        Set<String> especiesUnicas = new HashSet<>(ordenMuestras);

        // Paso 3: HashMap para asociar ID de muestra con nombre del investigador
        Map<String, String> muestrasInvestigadores = new HashMap<>();
        muestrasInvestigadores.put("M-001", "Dra. Zamora");
        muestrasInvestigadores.put("M-002", "Dra. Amador");
        muestrasInvestigadores.put("M-003", "Mtra. Arellano");

        // Paso 4: Mostrar resultados
        System.out.println("📋 Lista completa y ordenada de muestras:");
        for (String especie : ordenMuestras) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧬 Especies únicas procesadas:");
        for (String especie : especiesUnicas) {
            System.out.println("- " + especie);
        }

        System.out.println("\n🧑‍🔬 Relación ID de muestra → Investigador:");
        for (Map.Entry<String, String> entrada : muestrasInvestigadores.entrySet()) {
            System.out.println(entrada.getKey() + " → " + entrada.getValue());
        }

        // Búsqueda por ID
        String idBuscar = "M-002";
        System.out.println("\n🔍 Búsqueda de investigador por ID '" + idBuscar + "':");
        if (muestrasInvestigadores.containsKey(idBuscar)) {
            System.out.println("Investigador: " + muestrasInvestigadores.get(idBuscar));
        } else {
            System.out.println("ID de muestra no encontrado.");
        }
    }
}
