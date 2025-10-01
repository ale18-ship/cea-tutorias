package udc.tutorias.domain.puertos_salida;

import udc.tutorias.domain.model.Docente;

import java.util.Optional;

public interface DocenteRepository {
    Optional<Docente> buscarPorId(Long id);
}
