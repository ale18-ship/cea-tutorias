package udc.tutorias.domain.model.vo;

import java.time.LocalDateTime;
import java.util.Objects;

public class FechaHora {
    private final LocalDateTime fechaHora;

    public FechaHora(LocalDateTime fechaHora) {
        if (fechaHora == null) {
            throw new IllegalArgumentException("La fecha y hora no pueden ser nulas");
        }
        if (fechaHora.isBefore(LocalDateTime.now())) {
            throw new IllegalArgumentException("La tutoría no puede programarse en el pasado");
        }
        this.fechaHora = fechaHora;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof FechaHora)) return false;
        FechaHora that = (FechaHora) o;
        return Objects.equals(fechaHora, that.fechaHora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fechaHora);
    }

    @Override
    public String toString() {
        return fechaHora.toString();
    }
}
