package ControladorTiquetes;
import java.time.LocalDate;
import java.util.List;

public class TiqueteTemporada extends Tiquete {
    private long temporada;
    private List<LocalDate> limite; 

    // Constructor
    public TiqueteTemporada(String ticketId, long temporada, List<LocalDate> limite) {
        super(ticketId);
        this.temporada = temporada;
        this.limite = limite;
    }

    
    public long getTemporada() {
        return temporada;
    }

    public void setTemporada(long temporada) {
        this.temporada = temporada;
    }

    
    public List<LocalDate> getLimite() {
        return limite;
    }

    public void setLimite(List<LocalDate> limite) {
        this.limite = limite;
    }


    
    public boolean verificarFechas() {
        if (limite == null || limite.size() != 2) {
            return false;
        }

        LocalDate hoy = LocalDate.now();
        LocalDate inicio = limite.get(0);
        LocalDate fin = limite.get(1);

        return (hoy.isEqual(inicio) || hoy.isAfter(inicio)) &&
               (hoy.isEqual(fin) || hoy.isBefore(fin));
    }
}

