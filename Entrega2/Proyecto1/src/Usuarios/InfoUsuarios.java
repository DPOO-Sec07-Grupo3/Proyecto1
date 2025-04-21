package Usuarios;

import java.util.ArrayList;
import java.util.List;

public class InfoUsuarios {
    private List<Usuario> usuarios;

    public InfoUsuarios() {
        this.usuarios = new ArrayList<>();
    }

    public boolean existeUsuario(String uNombre) {
        for (Usuario usuario : usuarios) {
            if (usuario.getLogin().equalsIgnoreCase(uNombre)) {
                return true;
            }
        }
        return false;
    }

    public void anadirUsuario(Usuario usuario) {
            usuarios.add(usuario);
        }
    

    public void eliminarUsuario(Usuario usuario) {
    	String uLogin= usuario.getLogin();
    	if(usuario!=null && existeUsuario(uLogin))
            usuarios.remove(usuario);
        }

    // Getters y Setters
    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }
}

