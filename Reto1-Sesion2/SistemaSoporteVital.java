package misionespacial;

import java.util.concurrent.Callable;

public class ModuloSustentoBiologico implements Callable<String> {
    // Clase adaptada con propósitos académicos
    @Override
    public String call() throws Exception {
        Thread.sleep(1200);
        return "🧪 Soporte vital: presión y oxígeno dentro de parámetros normales.";
    }
}