package udc.tutorias;

import udc.tutorias.domain.model.*;
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
                    notificacion.notificarTutoriaProgramada(
                            new TutoriaProgramadaEvento(guardada.getId(), LocalDateTime.now()));
                    return guardada;
                },
                id -> {
                    tutoriaRepo.eliminar(id);
                    notificacion.notificarTutoriaCancelada(new TutoriaCanceladaEvento(id));
                }
        );

        Docente docente = new Docente("D1", "Juan Pérez");
        Estudiante estudiante = new Estudiante("E1", "Ana López");
        Asignatura asignatura = new Asignatura("A1", "Matemáticas");

        Tutoria nuevaTutoria = new Tutoria("T1", docente, estudiante, List.of(asignatura));

        controller.programarTutoria(nuevaTutoria);

        controller.cancelarTutoria("T1");
    }
}
