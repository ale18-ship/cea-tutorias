package udc.tutorias.domain.servicios;

import udc.tutorias.domain.eventos.TutoriaCanceladaEvento;
import udc.tutorias.domain.eventos.TutoriaProgramadaEvento;

public class NotificacionService {
    public void notificarTutoriaProgramada(TutoriaProgramadaEvento evento) {
        System.out.println(" Notificación: Tutoría programada con ID " + evento.getTutoriaId()
                + " para el estudiante " + evento.getEstudianteId()
                + " y el docente " + evento.getDocenteId()
                + " en la fecha " + evento.getFechaHora());
    }

    public void notificarTutoriaCancelada(TutoriaCanceladaEvento evento) {
        System.out.println(" Notificación: Tutoría cancelada con ID " + evento.getTutoriaId()
                + " que iba a realizarse en la fecha " + evento.getFechaHora());
    }
}