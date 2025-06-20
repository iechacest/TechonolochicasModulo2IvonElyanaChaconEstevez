package hospital;

public class EspecialistaSalud implements Runnable {
    // Clase adaptada con fines didácticos

    private final String identificadorNombre;
    private final ElementoAsistencial recurso;

    public EspecialistaSalud(String identificadorNombre, ElementoAsistencial recurso) {
        this.identificadorNombre = identificadorNombre;
        this.recurso = recurso;
    }

    @Override
    public void run() {
        recurso.usar(identificadorNombre); // 👨‍⚕️ Intenta usar el recurso
    }
}