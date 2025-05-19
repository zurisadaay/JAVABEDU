public class Entrada {
    //Declaro los siguientes atributos
    String nombreEvento;
    double precio;

    //Aqui el constructor que recibe nombre y precio
    public Entrada(String nombreEvento, double precio) {
        this.nombreEvento = nombreEvento;
        this.precio = precio;
    }

    //Metodo publico para imprimir valores
    public void mostrarInformacion() {
        System.out.printf("Evento: %s | Precio: $%.2f\n", nombreEvento, precio);

    }
}
