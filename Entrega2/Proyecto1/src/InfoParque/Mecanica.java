package InfoParque;

import java.time.LocalDateTime;
import java.util.List;

public class Mecanica extends Atraccion {
    private double limiteAlturaMax;
    private double limiteAlturaMin;
    private double limitePesoMax;
    private double limitePesoMin;
    private List<String> contraindicaciones;
    private String nivelRiesgo;

    public Mecanica(String ubicacion, int cupoMaximo, int numEncargados,
                    List<String> restriccionClima, String exclusividad,
                    LocalDateTime fechaDisponible,
                    double limiteAlturaMax, double limiteAlturaMin,
                    double limitePesoMax, double limitePesoMin,
                    List<String> contraindicaciones, String nivelRiesgo) {
        super(ubicacion, cupoMaximo, numEncargados, restriccionClima, exclusividad, fechaDisponible);
        this.limiteAlturaMax = limiteAlturaMax;
        this.limiteAlturaMin = limiteAlturaMin;
        this.limitePesoMax = limitePesoMax;
        this.limitePesoMin = limitePesoMin;
        this.contraindicaciones = contraindicaciones;
        this.nivelRiesgo = nivelRiesgo;
    }

    // Getters y Setters
    public double getLimiteAlturaMax() {
        return limiteAlturaMax;
    }

    public void setLimiteAlturaMax(double limiteAlturaMax) {
        this.limiteAlturaMax = limiteAlturaMax;
    }

    public double getLimiteAlturaMin() {
        return limiteAlturaMin;
    }

    public void setLimiteAlturaMin(double limiteAlturaMin) {
        this.limiteAlturaMin = limiteAlturaMin;
    }

    public double getLimitePesoMax() {
        return limitePesoMax;
    }

    public void setLimitePesoMax(double limitePesoMax) {
        this.limitePesoMax = limitePesoMax;
    }

    public double getLimitePesoMin() {
        return limitePesoMin;
    }

    public void setLimitePesoMin(double limitePesoMin) {
        this.limitePesoMin = limitePesoMin;
    }

    public List<String> getContraindicaciones() {
        return contraindicaciones;
    }

    public void setContraindicaciones(List<String> contraindicaciones) {
        this.contraindicaciones = contraindicaciones;
    }

    public String getNivelRiesgo() {
        return nivelRiesgo;
    }

    public void setNivelRiesgo(String nivelRiesgo) {
        this.nivelRiesgo = nivelRiesgo;
    }
}
