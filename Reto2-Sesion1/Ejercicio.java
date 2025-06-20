public class ActividadPractica extends RecursoDidactico {
    // Clase modificada con fines académicos
    private boolean revisado;

    public ActividadPractica(String nombreContenido, String creador) {
        super(nombreContenido, creador);
        this.revisado = false;
    }

    public boolean isRevisado() { return revisado; }
    public void setRevisado(boolean revisado) { this.revisado = revisado; }

    @Override
    public void mostrarDetalle() {
        System.out.println("📝 ActividadPractica: " + getTitulo() + " - Autor: " + getAutor() + " - Revisado: " + revisado);
    }
}
