package udc.tutorias.infraestructura.adaptadores.notificaciones;

import udc.tutorias.domain.eventos.TutoriaProgramadaEvento;
import udc.tutorias.domain.eventos.TutoriaCanceladaEvento;
import udc.tutorias.domain.servicios.NotificacionService;

public class SmsNotificacionAdapter extends NotificacionService {

        @Override
        public void notificarTutoriaProgramada(TutoriaProgramadaEvento evento) {
            System.out.println(" SMS enviado: Tutoria programada con ID "
                    + evento.getTutoriaId());
        }

        @Override
        public void notificarTutoriaCancelada(TutoriaCanceladaEvento evento) {
            System.out.println(" SMS enviado: Tutoria cancelada con ID "
                    + evento.getTutoriaId());
        }
    }

