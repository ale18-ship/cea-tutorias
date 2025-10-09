package udc.tutorias.domain.excepciones;

public class DocenteNoDisponibleException extends RuntimeException {
    public DocenteNoDisponibleException() {
        super("El docente no está disponible para la tutoría.");
    }

    public DocenteNoDisponibleException(String message) {
        super(message);
    }

    public DocenteNoDisponibleException(String message, Throwable cause) {
        super(message, cause);
    }
}

