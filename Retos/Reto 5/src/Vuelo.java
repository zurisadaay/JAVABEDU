public class Vuelo {
    private final String codigoVuelo;
    private String destino;
    private String horaSalida;
    private Pasajero asientoReservado; // puede ser null

    public Vuelo(String codigo, String destino, String horaSalida) {
        this.codigoVuelo = codigo;
        this.destino = destino;
        this.horaSalida = horaSalida;
        this.asientoReservado = null;
    }

    // Método 1: reservar con un objeto Pasajero
    public boolean reservarAsiento(Pasajero p) {
        if (asientoReservado == null) {
            asientoReservado = p;
            return true;
        }
        return false;
    }

    // Método 2: reservar con nombre y pasaporte
    public boolean reservarAsiento(String nombre, String pasaporte) {
        return reservarAsiento(new Pasajero(nombre, pasaporte));
    }

    public void cancelarReserva() {
        asientoReservado = null;
    }

    public void obtenerItinerario() {
        System.out.println("✈️ Itinerario del vuelo:");
        System.out.println("Código: " + codigoVuelo);
        System.out.println("Destino: " + destino);
        System.out.println("Salida: " + horaSalida);
        System.out.print("Pasajero: ");
        if (asientoReservado != null) {
            System.out.println(asientoReservado.getNombre());
        } else {
            System.out.println("[Sin reserva]");
        }
        System.out.println();
    }
}
