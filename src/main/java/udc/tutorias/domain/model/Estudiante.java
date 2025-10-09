package udc.tutorias.domain.model;

import udc.tutorias.domain.excepciones.InvarianteDominioException;

import java.util.Objects;

public class Estudiante {
    private final String id;
    private final String nombre;
    private final Carrera carrera;

    public Estudiante(String id, String nombre, Carrera carrera) {
        if (id == null || id.trim().isEmpty()) {
            throw new InvarianteDominioException("El id del estudiante no puede ser nulo o vacío");
        }
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new InvarianteDominioException("El nombre del estudiante no puede ser nulo o vacío");
        }
        if (carrera == null) {
            throw new InvarianteDominioException("El estudiante debe estar asociado a una carrera");
        }
        this.id = id.trim();
        this.nombre = nombre.trim();
        this.carrera = carrera;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public Carrera getCarrera() { return carrera; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Estudiante)) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
