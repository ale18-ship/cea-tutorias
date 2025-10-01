package udc.tutorias.infraestructura.adaptadores.repositorios;

import udc.tutorias.domain.model.Estudiante;
import udc.tutorias.domain.puertos_salida.EstudianteRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class EstudianteRepositoryPostgres implements EstudianteRepository {

    private final Map<Long, Estudiante> bdSimulada = new HashMap<>();

    @Override
    public Optional<Estudiante> buscarPorId(Long id) {
        return Optional.ofNullable(bdSimulada.get(id));
    }
}
