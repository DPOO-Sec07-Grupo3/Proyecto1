package ControladorTiquetes;

import java.time.LocalDate;
;

public class FastPass {
    private LocalDate fecha;
    private boolean uso;

    
    public FastPass(LocalDate localDate) {
        this.fecha = localDate;
        this.uso = false;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    
    public boolean isUsado() {
        return uso;
    }

    public void setUso(boolean uso) {
        this.uso = uso;
    }

    public void actualizarUso(Tiquete tiquete) {
        if (tiquete != null && !this.uso) {
            this.uso = true;
            System.out.println("FastPass usado para el ticket: " + tiquete.getTicketId());
        } else if (this.uso) {
            System.out.println("Este FastPass ya fue utilizado.");
        } else {
            System.out.println("No se puede actualizar FastPass: ticket nulo.");
        }
    }
}

