package udc.tutorias.infraestructura.adaptadores.controladores;

import udc.tutorias.domain.model.Docente;
import udc.tutorias.domain.puertos_salida.DocenteRepository;

import java.util.Optional;

public class DocenteController {
    private final DocenteRepository docenteRepository;

    public DocenteController(DocenteRepository docenteRepository) {
        this.docenteRepository = docenteRepository;
    }

    public Optional<Docente> obtenerDocente(Long id) {
        return docenteRepository.buscarPorId(id);
    }
}
