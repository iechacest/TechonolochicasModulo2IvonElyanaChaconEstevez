package hospital;

import java.util.concurrent.locks.ReentrantLock;

public class ElementoAsistencial {
    // Clase adaptada con fines didácticos

    private final String identificadorNombre; // Ej. "Sala de cirugía"
    private final ReentrantLock lock = new ReentrantLock(); // 🔒 Control de acceso

    public ElementoAsistencial(String identificadorNombre) {
        this.identificadorNombre = identificadorNombre;
    }

    // Simula el uso exclusivo del recurso por parte de un profesional
    public void usar(String profesional) {
        lock.lock(); // 🚪 Solicita acceso exclusivo
        try {
            System.out.println("👨‍⚕️ " + profesional + " ha ingresado a " + identificadorNombre);
            Thread.sleep(1000); // ⏳ Simula el uso del recurso
            System.out.println("✅ " + profesional + " ha salido de " + identificadorNombre);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        } finally {
            lock.unlock(); // 🔓 Libera el recurso
        }
    }
}