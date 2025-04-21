package ControladorTiquetes;

import java.util.ArrayList;
import java.util.List;

public class InfoTiquetes {
    private List<Tiquete> tiquetes;

    
    public InfoTiquetes() {
        this.tiquetes = new ArrayList<>();
    }

    
    public void agregarTiquete(Tiquete tiquete) {
        if (tiquete != null) {
            tiquetes.add(tiquete);
            System.out.println("Tiquete agregado con ID: " + tiquete.getTicketId());
        } else {
            System.out.println("No se puede agregar un tiquete nulo.");
        }
    }

    
    public List<Tiquete> mostrarTiquetes() {
        System.out.println("Mostrando todos los tiquetes:");
        for (Tiquete t : tiquetes) {
            System.out.println("- ID: " + t.getTicketId() + " | FastPass: " + t.isFastPass());
        }
        return tiquetes;
    }

    
    public List<Tiquete> getTiquetes() {
        return tiquetes;
    }

}
