public class Main {
    public static void main(String[] args) {
        DeclaracionImpuestos declaracion = new DeclaracionImpuestos("ZZA980621CW9", 8700.0);
        CuentaFiscal cuenta = new CuentaFiscal("ZZA980621CW9", 9500.0);

        // Mostrar información
        System.out.printf("📄 Declaración enviada por RFC: %s por $%.1f%n",
                declaracion.rfcContribuyente(), declaracion.montoDeclarado());

        System.out.printf("🏦 Cuenta fiscal registrada con RFC: %s, saldo disponible: $%.1f%n",
                cuenta.getRfc(), cuenta.getSaldoDisponible());

        // Validar
        System.out.printf("✅ ¿RFC válido para esta cuenta?: %b%n", cuenta.validarRFC(declaracion));
    }
}
