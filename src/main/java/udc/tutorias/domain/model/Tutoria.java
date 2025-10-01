package udc.tutorias.domain.model;
import java.util.List;

public class Tutoria {
    private String id;
    private Docente docente;
    private Estudiante estudiante;
    private List<Asignatura> asignaturas;

    public Tutoria(String id, Docente docente, Estudiante estudiante, List<Asignatura> asignaturas) {
        this.id = id;
        this.docente = docente;
        this.estudiante = estudiante;
        this.asignaturas = asignaturas;
    }

    public String getId() {
        return id;
    }

    public Docente getDocente() {
        return docente;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public List<Asignatura> getAsignaturas() {
        return asignaturas;
    }
}
