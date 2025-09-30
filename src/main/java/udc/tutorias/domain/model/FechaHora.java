package udc.tutorias.domain.model;

import java.time.LocalDateTime;

public class FechaHora {
    private final LocalDateTime fechaHora;

    public FechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }
}
