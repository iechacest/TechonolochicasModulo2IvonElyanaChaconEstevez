import misionespacial.ModuloTransmisionDatos;
import misionespacial.ModuloTermicoInterno;
import misionespacial.ModuloDireccionEspacial;
import misionespacial.ModuloSustentoBiologico;

import java.util.concurrent.*;

public class Main {
    // Clase adaptada con propósitos académicos
    public static void main(String[] args) throws Exception {
        System.out.println("🚀 Simulación de misión espacial iniciada...");

        ExecutorService executor = Executors.newFixedThreadPool(4);

        Future<String> nav = executor.submit(new ModuloDireccionEspacial());
        Future<String> vital = executor.submit(new ModuloSustentoBiologico());
        Future<String> com = executor.submit(new ModuloTransmisionDatos());
        Future<String> termico = executor.submit(new ModuloTermicoInterno());

        System.out.println(nav.get());
        System.out.println(vital.get());
        System.out.println(com.get());
        System.out.println(termico.get());

        executor.shutdown();
        System.out.println("✅ Todos los sistemas reportan estado operativo.");
    }
}