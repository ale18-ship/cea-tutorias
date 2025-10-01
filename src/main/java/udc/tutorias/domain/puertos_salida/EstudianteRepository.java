package udc.tutorias.domain.puertos_salida;

import udc.tutorias.domain.model.Estudiante;

import java.util.Optional;

public interface EstudianteRepository {
    Optional<Estudiante> buscarPorId(Long id);
}
