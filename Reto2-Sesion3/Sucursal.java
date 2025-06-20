import java.util.List;

public class CentroAtencion {
    // Código adaptado con fines educativos
    private final String nombre;
    private final List<FormularioCliente> encuestas;

    public CentroAtencion(String nombre, List<FormularioCliente> encuestas) {
        this.nombre = nombre;
        this.encuestas = encuestas;
    }

    public String getNombre() { return nombre; }
    public List<FormularioCliente> getEncuestas() { return encuestas; }
}