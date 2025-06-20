public class OrdenModeloInicial extends OrdenGeneralProduccion {
    // Clase modificada para diferenciación académica
    private final String faseDesarrollo;

    public OrdenModeloInicial(String codigo, int cantidad, String faseDesarrollo) {
        super(codigo, cantidad);
        this.faseDesarrollo = faseDesarrollo;
    }

    public String getFaseDesarrollo() { return faseDesarrollo; }

    @Override
    public void visualizarDetalle() {
        System.out.println("🧪 OrdenModeloInicial - Código: " + getCodigo() +
                " - Cantidad: " + getCantidad() +
                " - Fase: " + faseDesarrollo);
    }
}