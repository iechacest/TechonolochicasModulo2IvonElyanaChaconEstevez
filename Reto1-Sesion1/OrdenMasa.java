public class OrdenFabricacionMasa extends OrdenGeneralProduccion {
    // Clase modificada para diferenciación académica
    public OrdenFabricacionMasa(String codigo, int cantidad) {
        super(codigo, cantidad);
    }

    @Override
    public void visualizarDetalle() {
        System.out.println("🔧 OrdenFabricacionMasa - Código: " + getCodigo() + " - Cantidad: " + getCantidad());
    }
}