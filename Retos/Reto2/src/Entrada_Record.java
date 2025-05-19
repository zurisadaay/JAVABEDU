public record Entrada_Record(String nombreEvento, double precio) {
    public void mostrarInformacion() {
        System.out.printf("Evento: %s | Precio: $%.2f\n", nombreEvento,precio);

    }
}
