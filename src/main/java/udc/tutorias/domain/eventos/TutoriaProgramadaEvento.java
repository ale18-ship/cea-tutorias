package udc.tutorias.domain.eventos;

public class TutoriaProgramadaEvento {
    private final Long tutoriaId;

    public TutoriaProgramadaEvento(Long tutoriaId) {
        this.tutoriaId = tutoriaId;
    }

    public Long getTutoriaId() { return tutoriaId; }
}
