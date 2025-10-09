package udc.tutorias.domain.model;

import udc.tutorias.domain.excepciones.InvarianteDominioException;
import java.util.Objects;

public class Docente {
    private String id;
    private String nombre;

    public Docente(String id, String nombre) {
        if (id == null || id.trim().isEmpty()) {
            throw new InvarianteDominioException("El id del docente no puede ser nulo o vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new InvarianteDominioException("El nombre del docente no puede ser nulo o vacío");
        }
        this.id = id.trim();
        this.nombre = nombre.trim();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Docente)) return false;
        Docente docente = (Docente) o;
        return Objects.equals(id, docente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
