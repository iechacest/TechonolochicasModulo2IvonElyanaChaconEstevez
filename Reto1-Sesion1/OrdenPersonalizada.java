public class OrdenClienteEspecial extends OrdenGeneralProduccion {
    // Clase modificada para diferenciación académica
    private final String cliente;

    public OrdenClienteEspecial(String codigo, int cantidad, String cliente) {
        super(codigo, cantidad);
        this.cliente = cliente;
    }

    public String getCliente() { return cliente; }

    @Override
    public void visualizarDetalle() {
        System.out.println("🛠️ OrdenClienteEspecial - Código: " + getCodigo() +
                " - Cantidad: " + getCantidad() +
                " - Cliente: " + cliente);
    }
}