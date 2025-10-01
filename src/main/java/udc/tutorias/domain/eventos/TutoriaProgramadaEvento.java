package udc.tutorias.domain.eventos;

import java.time.LocalDateTime;

public class TutoriaProgramadaEvento {
    private final String tutoriaId;
    private final LocalDateTime fechaHora;

    public TutoriaProgramadaEvento(String tutoriaId, LocalDateTime fechaHora) {
        this.tutoriaId = tutoriaId;
        this.fechaHora = fechaHora;
    }

    public String getTutoriaId() { return tutoriaId; }
    public LocalDateTime getFechaHora() { return fechaHora; }
}
