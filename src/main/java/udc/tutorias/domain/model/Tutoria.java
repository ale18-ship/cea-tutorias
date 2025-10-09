package udc.tutorias.domain.model;
import udc.tutorias.domain.excepciones.InvarianteDominioException;
import udc.tutorias.domain.model.vo.FechaHora;
import udc.tutorias.domain.model.vo.Lugar;

import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Tutoria {
    private String id;
    private Docente docente;
    private Estudiante estudiante;
    private List<Asignatura> asignaturas;
    private final FechaHora fechaHora;
    private final Lugar lugar;
    private Estado estado;

    public Tutoria(String id, Docente docente, Estudiante estudiante, List<Asignatura> asignaturas, FechaHora fechaHora,
                   Lugar lugar) {
        if (id == null || id.trim().isEmpty()) {
            throw new InvarianteDominioException("El id de la tutoría no puede ser nulo o vacío");
        }
        if (docente == null) {
            throw new InvarianteDominioException("La tutoría debe tener un docente asignado");
        }
        if (estudiante == null) {
            throw new InvarianteDominioException("La tutoría debe tener un estudiante solicitante");
        }
        if (asignaturas == null || asignaturas.isEmpty()) {
            throw new InvarianteDominioException("La tutoría debe estar asociada al menos a una asignatura");
        }
        if (fechaHora == null) {
            throw new InvarianteDominioException("La tutoría debe tener una fecha y hora válidas");
        }
        if (lugar == null) {
            throw new InvarianteDominioException("La tutoría debe tener un lugar definido");
        }

        this.id = id.trim();
        this.docente = docente;
        this.estudiante = estudiante;
        this.asignaturas = Collections.unmodifiableList(asignaturas);
        this.fechaHora = fechaHora;
        this.lugar = lugar;
        this.estado = Estado.PROGRAMADA;
    }

    public String getId() { return id; }
    public Docente getDocente() { return docente; }
    public Estudiante getEstudiante() { return estudiante; }
    public List<Asignatura> getAsignaturas() { return asignaturas; }
    public FechaHora getFechaHora() { return fechaHora; }
    public Lugar getLugar() { return lugar; }
    public Estado getEstado() { return estado; }

    public void cancelar() {
        if (this.estado != Estado.PROGRAMADA) {
            throw new InvarianteDominioException("Sólo se puede cancelar una tutoría en estado PROGRAMADA");
        }
        this.estado = Estado.CANCELADA;
    }

    public void finalizar() {
        if (this.estado != Estado.PROGRAMADA) {
            throw new InvarianteDominioException("Sólo se puede finalizar una tutoría en estado PROGRAMADA");
        }
        this.estado = Estado.REALIZADA;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tutoria)) return false;
        Tutoria tutoria = (Tutoria) o;
        return Objects.equals(id, tutoria.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
