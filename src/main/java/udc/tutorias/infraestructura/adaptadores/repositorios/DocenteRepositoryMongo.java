package udc.tutorias.infraestructura.adaptadores.repositorios;

import udc.tutorias.domain.model.Docente;
import udc.tutorias.domain.puertos_salida.DocenteRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class DocenteRepositoryMongo implements DocenteRepository {

    private final Map<Long, Docente> bdSimulada = new HashMap<>();

    @Override
    public Optional<Docente> buscarPorId(Long id) {
        return Optional.ofNullable(bdSimulada.get(id));
    }
}
