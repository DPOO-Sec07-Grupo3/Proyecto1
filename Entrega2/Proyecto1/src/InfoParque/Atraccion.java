package InfoParque;

import java.time.LocalDateTime;
import java.util.List;

public class Atraccion {
    private String ubicacion;
    private int cupoMaximo;
    private int numEncargados;
    private List<String> restriccionClima;
    private String exclusividad;
    private LocalDateTime fechaDisponible;

    public Atraccion(String ubicacion, int cupoMaximo, int numEncargados,
                     List<String> restriccionClima, String exclusividad, LocalDateTime fechaDisponible) {
        this.ubicacion = ubicacion;
        this.cupoMaximo = cupoMaximo;
        this.numEncargados = numEncargados;
        this.restriccionClima = restriccionClima;
        this.exclusividad = exclusividad;
        this.fechaDisponible = fechaDisponible;
    }

  
    public void actualizarAtraccion(Atraccion nueva) {
        if (nueva != null) {
            this.ubicacion = nueva.getUbicacion();
            this.cupoMaximo = nueva.getCupoMaximo();
            this.numEncargados = nueva.getNumEncargados();
            this.restriccionClima = nueva.getRestriccionClima();
            this.exclusividad = nueva.getExclusividad();
            this.fechaDisponible = nueva.getFechaDisponible();
        }
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public int getNumEncargados() {
        return numEncargados;
    }

    public void setNumEncargados(int numEncargados) {
        this.numEncargados = numEncargados;
    }

    public List<String> getRestriccionClima() {
        return restriccionClima;
    }

    public void setRestriccionClima(List<String> restriccionClima) {
        this.restriccionClima = restriccionClima;
    }

    public String getExclusividad() {
        return exclusividad;
    }

    public void setExclusividad(String exclusividad) {
        this.exclusividad = exclusividad;
    }

    public LocalDateTime getFechaDisponible() {
        return fechaDisponible;
    }

    public void setFechaDisponible(LocalDateTime fechaDisponible) {
        this.fechaDisponible = fechaDisponible;
    }


}
