package udc.tutorias.domain.eventos;

import java.time.LocalDateTime;

public class TutoriaProgramadaEvento {
    private final String tutoriaId;
    private final String estudianteId;
    private final String estudianteNombre;
    private final String docenteId;
    private final String docenteNombre;
    private final LocalDateTime fechaHora;

    public TutoriaProgramadaEvento(String tutoriaId,
                                   String estudianteId,
                                   String estudianteNombre,
                                   String docenteId,
                                   String docenteNombre,
                                   LocalDateTime fechaHora) {
        this.tutoriaId = tutoriaId;
        this.estudianteId = estudianteId;
        this.estudianteNombre = estudianteNombre;
        this.docenteId = docenteId;
        this.docenteNombre = docenteNombre;
        this.fechaHora = fechaHora;
    }

    public String getTutoriaId() { return tutoriaId; }
    public String getEstudianteId() { return estudianteId; }
    public String getEstudianteNombre() { return estudianteNombre; }
    public String getDocenteId() { return docenteId; }
    public String getDocenteNombre() { return docenteNombre; }
    public LocalDateTime getFechaHora() { return fechaHora; }
}
