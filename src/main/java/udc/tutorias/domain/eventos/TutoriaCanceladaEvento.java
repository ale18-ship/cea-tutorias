package udc.tutorias.domain.eventos;

public class TutoriaCanceladaEvento {
    private final Long tutoriaId;

    public TutoriaCanceladaEvento(Long tutoriaId) {
        this.tutoriaId = tutoriaId;
    }

    public Long getTutoriaId() { return tutoriaId; }
}
