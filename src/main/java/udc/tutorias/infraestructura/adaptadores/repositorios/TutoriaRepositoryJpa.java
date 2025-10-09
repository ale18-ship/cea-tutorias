package udc.tutorias.infraestructura.adaptadores.repositorios;

import udc.tutorias.domain.model.Tutoria;
import udc.tutorias.domain.puertos_salida.TutoriaRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class TutoriaRepositoryJpa implements TutoriaRepository {
    private Map<String, Tutoria> data = new HashMap<>();

    public Tutoria guardar(Tutoria tutoria) {
        data.put(tutoria.getId(), tutoria);
        return tutoria;
    }

    public Optional<Tutoria> buscarPorId(String id) {
        return Optional.ofNullable(data.get(id));
    }

    public void eliminar(String id) {
        data.remove(id);
    }
}

