package udc.tutorias.domain.model;

public class Carrera {
    private String id;
    private String nombre;

    public Carrera(String id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
