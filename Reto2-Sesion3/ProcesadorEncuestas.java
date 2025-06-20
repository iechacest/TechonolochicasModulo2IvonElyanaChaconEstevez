import java.util.*;

public class GestorFormularios {
    // Código adaptado con fines educativos

    public static void main(String[] args) {
        // 📋 Lista de sucursales con sus encuestas
        List<CentroAtencion> sucursales = List.of(
                new CentroAtencion("Centro", List.of(
                        new FormularioCliente("Ana", "El tiempo de espera fue largo", 2),
                        new FormularioCliente("Luis", null, 5)
                )),
                new CentroAtencion("Norte", List.of(
                        new FormularioCliente("Marta", "La atención fue buena, pero la limpieza puede mejorar", 3),
                        new FormularioCliente("Pedro", null, 4)
                )),
                new CentroAtencion("Sur", List.of(
                        new FormularioCliente("Carlos", null, 2),
                        new FormularioCliente("Sofía", "No encontré el medicamento que necesitaba", 1)
                ))
        );

        System.out.println("📋 Seguimiento a pacientes insatisfechos:");

        sucursales.stream()
                .flatMap(sucursal ->
                        sucursal.getEncuestas().stream()
                                .filter(e -> e.getCalificacion() <= 3) // 🔍 Filtrar encuestas insatisfechas
                                .map(encuesta -> new Seguimiento(encuesta, sucursal.getNombre())) // 📝 Combinar encuesta + sucursal
                )
                .filter(seg -> seg.encuesta().getComentario().isPresent()) // 🔍 Filtrar encuestas con comentario
                .map(seg -> {
                    String comentario = seg.encuesta().getComentario().get();
                    return "CentroAtencion " + seg.sucursal() +
                            ": Seguimiento a paciente con comentario: \"" + comentario + "\"";
                })
                .forEach(System.out::println); // 📤 Imprimir mensajes
    }

    // Clase auxiliar para transportar FormularioCliente + CentroAtencion juntos, tipo record
        record Seguimiento(FormularioCliente encuesta, String sucursal) {
    }
}