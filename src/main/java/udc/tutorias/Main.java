package udc.tutorias;

import udc.tutorias.domain.model.*;
import udc.tutorias.domain.model.vo.FechaHora;
import udc.tutorias.domain.model.vo.Lugar;
import udc.tutorias.infraestructura.adaptadores.repositorios.TutoriaRepositoryJpa;
import udc.tutorias.infraestructura.adaptadores.controladores.TutoriaController;
import udc.tutorias.infraestructura.adaptadores.notificaciones.EmailNotificacionAdapter;
import udc.tutorias.domain.eventos.TutoriaProgramadaEvento;
import udc.tutorias.domain.eventos.TutoriaCanceladaEvento;
import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        TutoriaRepositoryJpa tutoriaRepo = new TutoriaRepositoryJpa();
        EmailNotificacionAdapter notificacion = new EmailNotificacionAdapter();

        TutoriaController controller = new TutoriaController(
                tutoria -> {
                    Tutoria guardada = tutoriaRepo.guardar(tutoria);

                    TutoriaProgramadaEvento evento = new TutoriaProgramadaEvento(
                            guardada.getId(),
                            guardada.getEstudiante().getId(),
                            guardada.getEstudiante().getNombre(),
                            guardada.getDocente().getId(),
                            guardada.getDocente().getNombre(),
                            LocalDateTime.now()
                    );

                    notificacion.notificarTutoriaProgramada(evento);

                    return guardada;
                },
                id -> {
                    Tutoria eliminada = tutoriaRepo.buscarPorId(id)
                            .orElseThrow(() -> new RuntimeException("Tutoria no encontrada con id: " + id));

                    tutoriaRepo.eliminar(id);

                    TutoriaCanceladaEvento eventoCancelacion = new TutoriaCanceladaEvento(
                            eliminada.getId(),
                            eliminada.getEstudiante().getId(),
                            eliminada.getDocente().getId(),
                            eliminada.getFechaHora().getFechaHora()
                    );

                    notificacion.notificarTutoriaCancelada(eventoCancelacion);
                }
        );

        Docente docente = new Docente("D1", "Juan Pérez");
        Carrera carrera = new Carrera("C1", "Ingeniería de Sistemas");
        Estudiante estudiante = new Estudiante("E1", "Ana López", carrera);
        Asignatura asignatura = new Asignatura("A1", "Matemáticas");

        FechaHora fechaHora = new FechaHora(LocalDateTime.of(2025, 10, 5, 10, 0));
        Lugar lugar = new Lugar("Aula 101");

        Tutoria nuevaTutoria = new Tutoria("T1", docente, estudiante, List.of(asignatura), fechaHora, lugar);

        controller.programarTutoria(nuevaTutoria);

        controller.cancelarTutoria("T1");
    }
}
