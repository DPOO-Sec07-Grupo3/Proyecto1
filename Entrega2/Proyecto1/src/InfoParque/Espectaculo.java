package InfoParque;

import java.time.LocalDateTime;
import java.util.List;

public class Espectaculo {
	private String nombre;
    private LocalDateTime horario;
    private String ubicacion;
    private List<String> restriccionesClima;
    private boolean disponible;

    public Espectaculo(String nombre,LocalDateTime horario, String ubicacion, List<String> restriccionesClima, boolean disponible) {
    	this.nombre=nombre;
        this.horario = horario;
        this.ubicacion = ubicacion;
        this.restriccionesClima = restriccionesClima;
        this.disponible = disponible;
    }

    public void actualizarEspectaculo(Espectaculo nuevo) {
        if (nuevo != null) {
            this.horario = nuevo.getHorario();
            this.ubicacion = nuevo.getUbicacion();
            this.restriccionesClima = nuevo.getRestriccionesClima();
            this.disponible = nuevo.isDisponible();
        }
    }

    // Getters y Setters
    public String getNombre() {
    	return nombre;
    }
    
    public void setNombre(String nombre) {
    	this.nombre=nombre;
    }
    public LocalDateTime getHorario() {
        return horario;
    }

    public void setHorario(LocalDateTime horario) {
        this.horario = horario;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public List<String> getRestriccionesClima() {
        return restriccionesClima;
    }

    public void setRestriccionesClima(List<String> restriccionesClima) {
        this.restriccionesClima = restriccionesClima;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }}
    

    