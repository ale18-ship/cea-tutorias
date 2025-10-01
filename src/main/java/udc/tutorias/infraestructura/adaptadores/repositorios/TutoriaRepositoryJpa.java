package udc.tutorias.infraestructura.adaptadores.repositorios;

import udc.tutorias.domain.model.Tutoria;
import udc.tutorias.domain.puertos_salida.TutoriaRepository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TutoriaRepositoryJpa implements TutoriaRepository {

    private final Map<String, Tutoria> bdSimulada = new HashMap<>();

    @Override
    public Tutoria guardar(Tutoria tutoria) {
        bdSimulada.put(tutoria.getId(), tutoria);
        return tutoria;
    }

    @Override
    public Optional<Tutoria> buscarPorId(Long id) {
        return Optional.ofNullable(bdSimulada.get(id));
    }

    @Override
    public void eliminar(Long id) {
        bdSimulada.remove(id);
    }
}
