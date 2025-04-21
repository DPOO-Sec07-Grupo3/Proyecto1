package ControladorTurno;

import Usuarios.Empleado;

public class Turno {
    private String tipo;
    private LugarServicio lugarAsignado;
    private Empleado empleadoAsignado;

    
    public Turno(String tipo) {
        this.tipo = tipo;
        this.lugarAsignado = null;
        this.empleadoAsignado = null;
    }

    
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    
    public LugarServicio getLugarAsignado() {
        return lugarAsignado;
    }

    public void setLugarAsignado(LugarServicio lugarAsignado) {
        this.lugarAsignado = lugarAsignado;
    }

    
    public Empleado getEmpleadoAsignado() {
        return empleadoAsignado;
    }

    public void setEmpleadoAsignado(Empleado empleadoAsignado) {
        this.empleadoAsignado = empleadoAsignado;
    }

    
    public void asignarLugarTrabajo(LugarServicio lugarServicio) {
        if (this.lugarAsignado == null && lugarServicio != null) {
            this.lugarAsignado = lugarServicio;
            System.out.println("Lugar asignado al turno: " + lugarServicio.getLugar());
        } else {
            System.out.println("El turno ya tiene un lugar asignado o el lugar es nulo.");
        }
    }

    
    public void asignarTurnoEmpleado(Empleado empleado) {
        if (empleado != null && this.empleadoAsignado == null) {
            this.empleadoAsignado = empleado;
            empleado.agregarTurno(this);
            System.out.println("Turno asignado al empleado: " + empleado.getNombre());
        } else {
            System.out.println("No se puede asignar el turno: ya asignado o empleado nulo.");
        }
    }

    
}

