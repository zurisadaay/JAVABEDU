public class PagoTransferencia extends MetodoPago {
    private boolean servidorDisponible;

    public PagoTransferencia(double monto, boolean servidorDisponible) {
        super(monto);
        this.servidorDisponible = servidorDisponible;
    }

    @Override
    public boolean autenticar() {
        return servidorDisponible;
    }

    @Override
    public void procesarPago() {
        System.out.println("✅ Procesando transferencia bancaria por $" + monto);
    }
}
