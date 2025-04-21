package InfoParque;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

public class InfoParque {
    private List<Atraccion> atracciones;
    private List<Espectaculo> espectaculos;
    private List<LocalDateTime> horarios;

    public InfoParque() {
        this.atracciones = new ArrayList<>();
        this.espectaculos = new ArrayList<>();
        this.horarios = new ArrayList<>();
    }

    public String anadirAtraccion(Atraccion atraccion) {
    	
        if (atraccion != null && !existeAtraccion(atraccion)) {
            atracciones.add(atraccion);
            return "La atraccion se añadio de forma exitosa";
        }
        else {
        	return "Ocurrio un error, la atraccion es nula o ya existe";
        }
        
    }

    public String eliminarAtraccion(Atraccion atraccion) {
    	if (atraccion != null && existeAtraccion(atraccion)) {
        atracciones.remove(atraccion);
        return "La atraccion fue eliminada con exito";
    	}
    	else {
    		return "Ocurrio un error, la atraccion es nula o no existe";
    	}
    }

    public List<Atraccion> mostrarAtracciones() {
        return new ArrayList<>(atracciones);
    }

    public boolean existeAtraccion(Atraccion atraccion) {
        for (Atraccion existente : atracciones) {
        	String ubiNueva=atraccion.getUbicacion();
        	String ubiExiste=existente.getUbicacion();
        	
            if (ubiNueva==ubiExiste) {
                return true;
            }
        }
        return false;
    }

    
    public String anadirEspectaculo(Espectaculo espectaculo) {
    	String eNombre= espectaculo.getNombre();
        if (espectaculo != null&& !existeEspectaculo(eNombre)) {
            espectaculos.add(espectaculo);
            return "Se añadio el espectaculo con exito";
        }
        else {
        	return "Ocurrio un error, el espectaculo es nulo o ya existe";
        }
    }

    public String eliminarEspectaculo(Espectaculo espectaculo) {
    	String eNombre= espectaculo.getNombre();
    	if (espectaculo != null && existeEspectaculo(eNombre)) {
            espectaculos.remove(espectaculo);
            return "El espectaculo fue eliminado con exito";
        	}
        	else {
        		return "Ocurrio un error, el espectaculo es nulo o no existe";
    }}

    public List<Espectaculo> mostrarEspectaculos() {
        return new ArrayList<>(espectaculos);
    }

    public boolean existeEspectaculo(String eNombre) {
        for (Espectaculo espectaculo : espectaculos) {
            if (espectaculo.getNombre().equalsIgnoreCase(eNombre)) {
                return true;
            }
        }
        return false;
    }


    public void actualizarHorarios(List<LocalDateTime> nuevosHorarios) {
        if (nuevosHorarios != null && nuevosHorarios.size() == 8) {
            this.horarios = new ArrayList<>(nuevosHorarios);
        }
    }

    public List<LocalDateTime> mostrarHorarios() {
        return new ArrayList<>(horarios);
    }

    // Getters y Setters
    public List<Atraccion> getAtracciones() {
        return atracciones;
    }

    public void setAtracciones(List<Atraccion> atracciones) {
        this.atracciones = atracciones;
    }

    public List<Espectaculo> getEspectaculos() {
        return espectaculos;
    }

    public void setEspectaculos(List<Espectaculo> espectaculos) {
        this.espectaculos = espectaculos;
    }

    public List<LocalDateTime> getHorarios() {
        return horarios;
    }

    public void setHorarios(List<LocalDateTime> horarios) {
        this.horarios = horarios;
    }
}
