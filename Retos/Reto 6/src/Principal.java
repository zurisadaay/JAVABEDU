public class Principal {
    public static void main(String[] args) {
        Factura facturaConRFC = new Factura(2000.0, "Servicio de consultoría", "ZAAZ9806CW9");
        Factura facturaSinRFC = new Factura(1000.0, "Cena navideña", null);

        System.out.println(facturaConRFC.getResumen());
        System.out.println(facturaSinRFC.getResumen());
    }
}
