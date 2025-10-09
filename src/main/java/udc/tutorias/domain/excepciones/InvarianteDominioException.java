package udc.tutorias.domain.excepciones;

public class InvarianteDominioException extends RuntimeException {
    public InvarianteDominioException() {
        super("Se ha violado un invariante del dominio.");
    }

    public InvarianteDominioException(String message) {
        super(message);
    }

    public InvarianteDominioException(String message, Throwable cause) {
        super(message, cause);
    }
}
