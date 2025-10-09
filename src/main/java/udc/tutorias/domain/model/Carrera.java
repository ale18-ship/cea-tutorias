package udc.tutorias.domain.model;

import udc.tutorias.domain.excepciones.InvarianteDominioException;

import java.util.Objects;

public class Carrera {
    private final String id;
    private final String nombre;

    public Carrera(String id, String nombre) {
        if (id == null || id.trim().isEmpty()) {
            throw new InvarianteDominioException("El id de la carrera no puede ser nulo o vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new InvarianteDominioException("El nombre de la carrera no puede ser nulo o vacío");
        }
        this.id = id.trim();
        this.nombre = nombre.trim();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carrera)) return false;
        Carrera carrera = (Carrera) o;
        return Objects.equals(id, carrera.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
