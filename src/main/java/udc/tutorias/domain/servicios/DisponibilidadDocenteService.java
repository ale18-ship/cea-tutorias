package udc.tutorias.domain.servicios;

import udc.tutorias.domain.model.Docente;
import udc.tutorias.domain.model.Tutoria;
import udc.tutorias.domain.model.vo.FechaHora;

import java.util.List;

public class DisponibilidadDocenteService {
    public boolean estaDisponible(Docente docente, FechaHora fechaHora, List<Tutoria> tutoriasProgramadas) {

        return tutoriasProgramadas.stream()
                .noneMatch(t -> t.getDocente().equals(docente) &&
                        t.getFechaHora().equals(fechaHora));
    }

}
