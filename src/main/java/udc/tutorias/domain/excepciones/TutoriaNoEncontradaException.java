package udc.tutorias.domain.excepciones;

public class TutoriaNoEncontradaException extends RuntimeException {
    public TutoriaNoEncontradaException(String message) {
        super(message);
    }
}
