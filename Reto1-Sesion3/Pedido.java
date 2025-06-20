import java.util.Optional;

public class SolicitudCompra {
    // Versión adaptada con fines formativos
    private final String comprador;
    private final String tipoEntrega; // "domicilio" o "local"
    private final String telefono; // Puede ser null

    public SolicitudCompra(String comprador, String tipoEntrega, String telefono) {
        this.comprador = comprador;
        this.tipoEntrega = tipoEntrega;
        this.telefono = telefono;
    }

    public String getCliente() { return comprador; }
    public String getTipoEntrega() { return tipoEntrega; }

    // 📞 Método seguro para obtener el teléfono como Optional
    public Optional<String> getTelefono() {
        return Optional.ofNullable(telefono);
    }
}