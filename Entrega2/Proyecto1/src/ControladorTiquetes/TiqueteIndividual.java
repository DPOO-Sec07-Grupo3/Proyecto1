package ControladorTiquetes;

import InfoParque.Atraccion;

public class TiqueteIndividual extends Tiquete {
    private boolean uso;
    private Atraccion atraccionAsignada;

    
    public TiqueteIndividual(String ticketId) {
        super(ticketId);
        this.uso = false;
        this.atraccionAsignada = null;
    }

    
    public boolean isUsado() {
        return uso;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }


    
    public Atraccion getAtraccionAsignada() {
        return atraccionAsignada;
    }

    public void setAtraccionAsignada(Atraccion atraccion) {
        this.atraccionAsignada = atraccion;
    }

    
    public void actualizarUso(String ticketId, TiqueteIndividual tiquete) {
        if (tiquete != null && ticketId.equals(tiquete.getTicketId())) {
            tiquete.setUso(true);
            System.out.println("El ticket " + ticketId + " ha sido marcado como usado.");
        } else {
            System.out.println("No se pudo actualizar el uso del ticket: ID no coincide o es nulo.");
        }
    }

    
    public void asignarAtraccion(Atraccion atraccion) {
        if (!uso && atraccion != null) {
            this.atraccionAsignada = atraccion;
            System.out.println("Atracción asignada al ticket " + this.getTicketId());
        } else {
            System.out.println("No se puede asignar la atracción: el ticket ya fue usado o la atracción es nula.");
        }
    }
}
