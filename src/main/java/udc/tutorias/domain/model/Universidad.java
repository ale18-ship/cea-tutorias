package udc.tutorias.domain.model;

public class Universidad {
    private String id;
    private String nombre;

    public Universidad(String id, String nombre) {
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
