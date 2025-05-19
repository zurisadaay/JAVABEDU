public class CentralEmergencias {
    public static void main(String[] args) {
        Ambulancia amb = new Ambulancia("Ambulancia", new Operador("Zurisaday"));
        Patrulla pat = new Patrulla("Patrulla", new Operador("Elena"));
        UnidadBomberos bom = new UnidadBomberos("UnidadBomberos", new Operador("Galio"));

        amb.iniciarOperacion();
        System.out.println();
        pat.iniciarOperacion();
        System.out.println();
        bom.iniciarOperacion();
    }
}
