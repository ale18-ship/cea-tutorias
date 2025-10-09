package udc.tutorias.domain.eventos;

import java.time.LocalDateTime;

public class TutoriaCanceladaEvento {
    private final String tutoriaId;
    private final String estudianteId;
    private final String docenteId;
    private final LocalDateTime fechaHora;

    public TutoriaCanceladaEvento(String tutoriaId, String estudianteId, String docenteId, LocalDateTime fechaHora) {
        this.tutoriaId = tutoriaId;
        this.estudianteId = estudianteId;
        this.docenteId = docenteId;
        this.fechaHora = fechaHora;
    }

    public String getTutoriaId() {
        return tutoriaId;
    }

    public String getEstudianteId() {
        return estudianteId;
    }

    public String getDocenteId() {
        return docenteId;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}

