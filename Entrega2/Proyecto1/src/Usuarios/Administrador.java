package Usuarios;

public class Administrador extends Usuario {
    private String nombre;

    public Administrador(String login, String password, String nombre) {
        super(login, password);
        this.nombre = nombre;
    }

    // Getter
    public String getNombre() {
        return nombre;
    }

    // Setter
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
}
