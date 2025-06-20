public class LecturaGuiada extends RecursoDidactico {
    // Clase modificada con fines académicos
    private final int palabras;

    public LecturaGuiada(String nombreContenido, String creador, int palabras) {
        super(nombreContenido, creador);
        this.palabras = palabras;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("📄 Artículo: " + getTitulo() + " - Autor: " + getAutor() + " - Palabras: " + palabras);
    }
}
