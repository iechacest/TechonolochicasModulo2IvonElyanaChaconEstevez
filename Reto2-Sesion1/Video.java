public class ContenidoVideo extends RecursoDidactico {
    // Clase modificada con fines académicos
    private final int tiempoEstimado; // en minutos

    public ContenidoVideo(String nombreContenido, String creador, int tiempoEstimado) {
        super(nombreContenido, creador);
        this.tiempoEstimado = tiempoEstimado;
    }

    public int getDuracion() { return tiempoEstimado; }

    @Override
    public void mostrarDetalle() {
        System.out.println("🎥 ContenidoVideo: " + getTitulo() + " - Autor: " + getAutor() + " - Duración: " + tiempoEstimado + " min");
    }
}
