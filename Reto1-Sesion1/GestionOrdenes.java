
import java.util.*;

public class ControlCentralOrdenes {
    // Clase modificada para diferenciación académica

    public static void mostrarOrdenes(List<? extends OrdenGeneralProduccion> lista) {
        System.out.println("\n📋 Órdenes registradas:");
        for (OrdenGeneralProduccion orden : lista) {
            orden.visualizarDetalle();
        }
    }

    public static void procesarPersonalizadas(List<? super OrdenClienteEspecial> lista, int costoAdicional) {
        System.out.println("\n💰 Procesando órdenes personalizadas...");
        for (Object obj : lista) {
            if (obj instanceof OrdenClienteEspecial) {
                OrdenClienteEspecial op = (OrdenClienteEspecial) obj;
                System.out.println("✅ Orden " + op.getCodigo() + " ajustada con costo adicional de $" + costoAdicional);
            }
        }
    }

    // 🚀 Código de desafío opcional: contar órdenes por tipo
    public static void contarOrdenes(List<? extends OrdenGeneralProduccion> lista) {
        long masas = lista.stream().filter(o -> o instanceof OrdenFabricacionMasa).count();
        long personalizadas = lista.stream().filter(o -> o instanceof OrdenClienteEspecial).count();
        long prototipos = lista.stream().filter(o -> o instanceof OrdenModeloInicial).count();

        System.out.println("\n📊 Resumen total de órdenes:");
        System.out.println("🔧 Producción en masa: " + masas);
        System.out.println("🛠️ Personalizadas: " + personalizadas);
        System.out.println("🧪 Prototipos: " + prototipos);
    }

    public static void main(String[] args) {
        List<OrdenGeneralProduccion> todasLasOrdenes = new ArrayList<>();

        List<OrdenFabricacionMasa> masas = Arrays.asList(
                new OrdenFabricacionMasa("A123", 500),
                new OrdenFabricacionMasa("A124", 750)
        );

        List<OrdenClienteEspecial> personalizadas = Arrays.asList(
                new OrdenClienteEspecial("P456", 100, "ClienteX"),
                new OrdenClienteEspecial("P789", 150, "ClienteY")
        );

        List<OrdenModeloInicial> prototipos = Arrays.asList(
                new OrdenModeloInicial("T789", 10, "Diseño"),
                new OrdenModeloInicial("T790", 5, "Pruebas")
        );

        // Agregamos todas las órdenes a la lista combinada
        todasLasOrdenes.addAll(masas);
        todasLasOrdenes.addAll(personalizadas);
        todasLasOrdenes.addAll(prototipos);

        // Mostrar órdenes por tipo
        mostrarOrdenes(masas);
        mostrarOrdenes(personalizadas);
        mostrarOrdenes(prototipos);

        // Procesar órdenes personalizadas
        procesarPersonalizadas(personalizadas, 200);

        // 🚀 Código de desafío opcional: contar órdenes por tipo
        contarOrdenes(todasLasOrdenes);
    }
}