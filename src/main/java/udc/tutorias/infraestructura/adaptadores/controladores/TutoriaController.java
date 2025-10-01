package udc.tutorias.infraestructura.adaptadores.controladores;

import udc.tutorias.domain.model.Tutoria;
import udc.tutorias.domain.puertos_entrada.ServicioCancelarTutoria;
import udc.tutorias.domain.puertos_entrada.ServicioProgramarTutoria;

public class TutoriaController {
    private final ServicioProgramarTutoria servicioProgramar;
    private final ServicioCancelarTutoria servicioCancelar;

    public TutoriaController(ServicioProgramarTutoria servicioProgramar,
                             ServicioCancelarTutoria servicioCancelar) {
        this.servicioProgramar = servicioProgramar;
        this.servicioCancelar = servicioCancelar;
    }

    public Tutoria programarTutoria(Tutoria tutoria) {
        return servicioProgramar.programarTutoria(tutoria);
    }

    public void cancelarTutoria(String id) {
        servicioCancelar.cancelarTutoria(id);
    }
}
