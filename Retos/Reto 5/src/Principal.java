public class Principal {
    public static void main(String[] args) {
        Pasajero pasajero1 = new Pasajero("Elena Amador", "AAE987");
        Vuelo vuelo = new Vuelo("UX123", "París", "14:30");

        if (vuelo.reservarAsiento(pasajero1)) {
            System.out.println("✅ Reserva realizada con éxito.");
        }

        vuelo.obtenerItinerario();

        System.out.println("❌ Cancelando reserva...");
        vuelo.cancelarReserva();

        vuelo.obtenerItinerario();

        vuelo.reservarAsiento("Zurisaday Zamora", "ZZA876756");
        vuelo.obtenerItinerario();
    }
}
