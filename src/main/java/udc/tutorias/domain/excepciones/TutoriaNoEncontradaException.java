package udc.tutorias.domain.excepciones;

public class TutoriaNoEncontradaException extends RuntimeException {
    public TutoriaNoEncontradaException() {
        super("La tutoría solicitada no fue encontrada.");
    }

    public TutoriaNoEncontradaException(String message) {
        super(message);
    }

    public TutoriaNoEncontradaException(String message, Throwable cause) {
        super(message, cause);
    }
}
