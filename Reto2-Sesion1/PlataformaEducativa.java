import java.util.*;
import java.util.function.Predicate;

public class GestorAcademicoVirtual {
    // Clase modificada con fines académicos

    public static void listarRecursos(List<? extends RecursoDidactico> lista) {
        System.out.println("\n📚 Materiales del curso:");
        for (RecursoDidactico material : lista) {
            material.mostrarDetalle();
        }
    }

    public static void contarDuracionVideos(List<? extends ContenidoVideo> lista) {
        int total = 0;
        for (ContenidoVideo v : lista) {
            total += v.getDuracion();
        }
        System.out.println("\n🎥 Duración total de videos: " + total + " minutos");
    }

    public static void marcarEjerciciosRevisados(List<? super ActividadPractica> lista) {
        System.out.println();
        for (Object obj : lista) {
            if (obj instanceof ActividadPractica) {
                ActividadPractica e = (ActividadPractica) obj;
                e.setRevisado(true);
                System.out.println("✅ ActividadPractica '" + e.getTitulo() + "' marcado como revisado.");
            }
        }
    }

    // 🚀 Código de desafío opcional: Filtrar materiales por creador
    public static void filtrarPorAutor(List<? extends RecursoDidactico> lista, Predicate<RecursoDidactico> filtro) {
        System.out.println("\n🔍 Filtrando materiales por creador:");
        for (RecursoDidactico material : lista) {
            if (filtro.test(material)) {
                material.mostrarDetalle();
            }
        }
    }

    public static void main(String[] args) {
        // Crear materiales
        List<RecursoDidactico> materiales = Arrays.asList(
                new ContenidoVideo("Introducción a Java", "Mario", 15),
                new ContenidoVideo("POO en Java", "Carlos", 20),
                new LecturaGuiada("Historia de Java", "Ana", 1200),
                new LecturaGuiada("Tipos de datos", "Luis", 800),
                new ActividadPractica("Variables y tipos", "Luis"),
                new ActividadPractica("Condicionales", "Mario")
        );

        // Filtrar cada tipo (solo para videos y ejercicios)
        List<ContenidoVideo> videos = new ArrayList<>();
        List<ActividadPractica> ejercicios = new ArrayList<>();
        for (RecursoDidactico m : materiales) {
            if (m instanceof ContenidoVideo) {
                videos.add((ContenidoVideo) m);
            } else if (m instanceof ActividadPractica) {
                ejercicios.add((ActividadPractica) m);
            }
        }

        // Mostrar todos los materiales
        listarRecursos(materiales);

        // Contar duración total de videos
        contarDuracionVideos(videos);

        // Marcar ejercicios como revisados
        marcarEjerciciosRevisados(ejercicios);

        // 🚀 Desafío opcional: Filtrar materiales por creador (ej. Mario)
        filtrarPorAutor(materiales, m -> m.getAutor().equals("Mario"));
    }
}
