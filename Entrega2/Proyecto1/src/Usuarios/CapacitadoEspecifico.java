package Usuarios;

import java.util.List;

import InfoParque.Atraccion;

public class CapacitadoEspecifico extends Empleado {
    private List<Atraccion> atracciones;

    public CapacitadoEspecifico(String login, String password, String nombre,
                                 boolean capacitadoCocina, boolean capacitadoAtracciones,
                                 List<Atraccion> atracciones) {
        super(nombre, capacitadoCocina, capacitadoAtracciones,login,password);
        this.atracciones = atracciones;
    }

    // Getters y Setters
    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }
}

