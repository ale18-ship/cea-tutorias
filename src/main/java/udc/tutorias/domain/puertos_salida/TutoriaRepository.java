package udc.tutorias.domain.puertos_salida;

import udc.tutorias.domain.model.Tutoria;
import java.util.Optional;

public interface TutoriaRepository {
    Tutoria guardar(Tutoria tutoria);
    Optional<Tutoria> buscarPorId(String id);
    void eliminar(String id);
}