package InfoParque;

import java.time.LocalDateTime;
import java.util.List;

public class Cultural extends Atraccion {
    private int edadIngreso;

    public Cultural(String ubicacion, int cupoMaximo, int numEncargados,
                    List<String> restriccionClima, String exclusividad,
                    LocalDateTime fechaDisponible,
                    int edadIngreso) {
        super(ubicacion, cupoMaximo, numEncargados, restriccionClima, exclusividad, fechaDisponible);
        this.edadIngreso = edadIngreso;
    }

    // Getter y Setter
    public int getEdadIngreso() {
        return edadIngreso;
    }

    public void setEdadIngreso(int edadIngreso) {
        this.edadIngreso = edadIngreso;
    }
}
