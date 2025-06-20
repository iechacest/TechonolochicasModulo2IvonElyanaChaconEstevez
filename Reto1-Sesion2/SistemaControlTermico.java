package misionespacial;

import java.util.concurrent.Callable;

public class ModuloTermicoInterno implements Callable<String> {
    // Clase adaptada con propósitos académicos
    @Override
    public String call() throws Exception {
        Thread.sleep(1100);
        return "🔥 Control térmico: temperatura estable (22°C).";
    }
}