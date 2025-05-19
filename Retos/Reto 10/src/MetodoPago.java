public abstract class MetodoPago implements Autenticable {
    protected double monto;

    public MetodoPago(double monto) {
        this.monto = monto;
    }

    public void mostrarResumen() {
        System.out.printf("Tipo: %s - Monto: $%.1f%n", this.getClass().getSimpleName(), monto);
    }

    public abstract void procesarPago();
}
