public class PagoEfectivo extends MetodoPago {
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public boolean autenticar() {
        return true;
    }

    @Override
    public void procesarPago() {
        System.out.println("✅ Procesando pago en efectivo por $" + monto);
    }
}
