public abstract class RecursoDidactico {
    private final String nombreContenido;
    private final String creador;

    public RecursoDidactico(String nombreContenido, String creador) {
        this.nombreContenido = nombreContenido;
        this.creador = creador;
    }

    public String getTitulo() { return nombreContenido; }
    public String getAutor() { return creador; }

    public abstract void mostrarDetalle();
}