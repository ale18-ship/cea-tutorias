package udc.tutorias.domain.model;

import udc.tutorias.domain.excepciones.InvarianteDominioException;

import java.util.Objects;

public class Universidad {
    private final String id;
    private final String nombre;

    public Universidad(String id, String nombre) {
        if (id == null || id.trim().isEmpty()) {
            throw new InvarianteDominioException("El id de la universidad no puede ser nulo o vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new InvarianteDominioException("El nombre de la universidad no puede ser nulo o vacío");
        }
        this.id = id.trim();
        this.nombre = nombre.trim();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Universidad)) return false;
        Universidad that = (Universidad) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
