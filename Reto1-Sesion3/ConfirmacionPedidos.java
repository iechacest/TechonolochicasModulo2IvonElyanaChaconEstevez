import java.util.*;
import java.util.stream.*;

public class ValidacionSolicitudes {
    // Versión adaptada con fines formativos

    public static void main(String[] args) {
        List<SolicitudCompra> pedidos = List.of(
                new SolicitudCompra("Juan", "domicilio", "555-1234"),
                new SolicitudCompra("María", "local", null),
                new SolicitudCompra("Carlos", "domicilio", null),
                new SolicitudCompra("Luisa", "domicilio", "555-5678")
        );

        // 🛒 Almacenamos los mensajes en una lista
        List<String> mensajes = pedidos.stream()
                .filter(p -> p.getTipoEntrega().equalsIgnoreCase("domicilio")) // 🔍 Filtrar por entrega a domicilio
                .map(SolicitudCompra::getTelefono) // 🔄 Transformar SolicitudCompra → Optional<String>
                .filter(Optional::isPresent) // 🔍 Filtrar los Optional con valor
                .map(Optional::get) // 📥 Extraer el número del Optional
                .map(tel -> "📞 Confirmación enviada al número: " + tel) // 📨 Crear mensaje
                .toList(); // 📦 Recolectar en una lista

        // 🖨️ Mostrar los mensajes (podrías guardarlos, enviarlos, etc.)
        System.out.println("📞 Confirmaciones de pedidos a domicilio:");
        mensajes.forEach(System.out::println);
    }
}