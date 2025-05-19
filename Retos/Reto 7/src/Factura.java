import java.util.Objects;

public class Factura {
    private String folio;
    private String cliente;
    private double total;

    // Constructor
    public Factura(String folio, String cliente, double total) {
        this.folio = folio;
        this.cliente = cliente;
        this.total = total;
    }

    // toString: muestra toda la info de forma legible
    @Override
    public String toString() {
        return String.format("Factura [folio=%s, cliente=%s, total=$%.1f]", folio, cliente, total);
    }

    // equals: dos facturas son iguales si tienen el mismo folio
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Factura factura = (Factura) obj;
        return Objects.equals(folio, factura.folio);
    }

    // hashCode basado en el folio
    @Override
    public int hashCode() {
        return Objects.hash(folio);
    }
}
