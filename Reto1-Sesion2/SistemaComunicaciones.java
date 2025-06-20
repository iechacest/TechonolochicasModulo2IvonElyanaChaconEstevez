package misionespacial;

import java.util.concurrent.Callable;

public class ModuloTransmisionDatos implements Callable<String> {
    // Clase adaptada con propósitos académicos
    @Override
    public String call() throws Exception {
        Thread.sleep(800);
        return "📡 Comunicaciones: enlace con estación terrestre establecido.";
    }
}
