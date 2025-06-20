package hospital;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    // Clase adaptada con fines didácticos
    public static void main(String[] args) {
        System.out.println("🏥 Iniciando simulación de acceso al recurso...");

        ElementoAsistencial salaCirugia = new ElementoAsistencial("Sala de cirugía");

        // 🧵 Creamos un pool de 4 hilos para simular concurrencia
        ExecutorService executor = Executors.newFixedThreadPool(4);

        executor.submit(new EspecialistaSalud("Dra. Sánchez", salaCirugia));
        executor.submit(new EspecialistaSalud("Dr. Gómez", salaCirugia));
        executor.submit(new EspecialistaSalud("Enfermero López", salaCirugia));
        executor.submit(new EspecialistaSalud("Dra. Ruiz", salaCirugia));

        executor.shutdown(); // ✋ No se aceptan más tareas
    }
}