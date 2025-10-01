package udc.tutorias.domain.excepciones;

public class DocenteNoDisponibleException extends RuntimeException {
    public DocenteNoDisponibleException(String message) {
        super(message);
    }
}
