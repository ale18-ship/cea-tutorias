package udc.tutorias.domain.eventos;

import java.time.LocalDateTime;

public class TutoriaCanceladaEvento {
    private final String tutoriaId;

    public TutoriaCanceladaEvento(String tutoriaId) {
        this.tutoriaId = tutoriaId;
    }

    public String getTutoriaId() {
        return tutoriaId;
    }
}

