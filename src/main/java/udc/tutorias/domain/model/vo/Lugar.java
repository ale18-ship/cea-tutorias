package udc.tutorias.domain.model.vo;

import java.util.Objects;

public class Lugar {
    private final String nombre;

    public Lugar(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El lugar no puede estar vacío");
        }
        this.nombre = nombre.trim();
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Lugar)) return false;
        Lugar lugar = (Lugar) o;
        return Objects.equals(nombre, lugar.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return nombre;
    }
}
