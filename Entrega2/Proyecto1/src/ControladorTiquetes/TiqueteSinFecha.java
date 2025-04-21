package ControladorTiquetes;

public class TiqueteSinFecha extends Tiquete {
    private boolean uso;
    private String exclusividad;
    

    
    public TiqueteSinFecha(String ticketId) {
        super(ticketId);
        this.uso = false;
        this.exclusividad = null;
    }

    
    public boolean isUsado() {
        return uso;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }

    
    public String getExclusividad() {
        return exclusividad;
    }

    public void setExclusividad(String exclusividad) {
        this.exclusividad = exclusividad;
    }

    

    
    public void actualizarUso(String ticketId, TiqueteSinFecha tiquete) {
        if (tiquete != null && ticketId != null && ticketId.equals(tiquete.getTicketId())) {
            tiquete.setUso(true);
            System.out.println("El ticket sin fecha " + ticketId + " ha sido marcado como usado.");
        } else {
            System.out.println("No se pudo actualizar el uso del ticket sin fecha.");
        }
    }

    
    public void asignarExclusividad(String exclusividad, String ticketId, TiqueteSinFecha tiquete) {
        if (exclusividad != null && !exclusividad.isEmpty()
            && ticketId != null && ticketId.equals(tiquete.getTicketId())
            && tiquete != null) {
            tiquete.setExclusividad(exclusividad);
            System.out.println("Exclusividad asignada al ticket sin fecha: " + ticketId);
        } else {
            System.out.println("No se pudo asignar exclusividad al ticket sin fecha.");
        }
    }
}

