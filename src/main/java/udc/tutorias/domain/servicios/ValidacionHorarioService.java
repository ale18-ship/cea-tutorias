package udc.tutorias.domain.servicios;

import udc.tutorias.domain.model.vo.FechaHora;

import java.time.LocalDateTime;

public class ValidacionHorarioService {
    public boolean esValido(FechaHora fechaHora) {
        LocalDateTime ahora = LocalDateTime.now();

        if (fechaHora.getFechaHora().isBefore(ahora)) {
            return false;
        }

        int hora = fechaHora.getFechaHora().getHour();
        return hora >= 7 && hora <= 20;
    }
}
