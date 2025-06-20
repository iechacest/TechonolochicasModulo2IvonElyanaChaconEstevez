package misionespacial;

import java.util.concurrent.Callable;

public class ModuloDireccionEspacial implements Callable<String> {
    // Clase adaptada con propósitos académicos
    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "🛰️ Navegación: trayectoria corregida con éxito.";
    }
}
