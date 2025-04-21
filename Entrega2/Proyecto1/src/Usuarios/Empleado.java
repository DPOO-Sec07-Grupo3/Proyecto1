package Usuarios;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import ControladorTurno.Turno;

public class Empleado extends Usuario{
    private String nombre;
    private boolean capacitadoCocina;
    private boolean capacitadoAtracciones;
    private List<Turno> turnosAsignados;

    // Constructor
    public Empleado(String nombre, boolean capacitadoCocina, boolean capacitadoAtracciones,String login, String password) {
    	super(login,password);
        this.nombre = nombre;
        this.capacitadoCocina = capacitadoCocina;
        this.capacitadoAtracciones = capacitadoAtracciones;
        this.turnosAsignados = new ArrayList<>();
    }

   
    public static boolean crearEmpleado() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del empleado: ");
        String nombre = scanner.nextLine();

        System.out.print("Ingrese el login del empleado: ");
        String login = scanner.nextLine();

        System.out.print("Ingrese la contraseña: ");
        String password = scanner.nextLine();

        System.out.print("¿Está capacitado para cocina? (true/false): ");
        boolean capacitadoCocina = Boolean.parseBoolean(scanner.nextLine());

        System.out.print("¿Está capacitado para atracciones? (true/false): ");
        boolean capacitadoAtracciones = Boolean.parseBoolean(scanner.nextLine());

        new Empleado( nombre, capacitadoCocina, capacitadoAtracciones,login,password);
        return true;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCapacitadoCocina() {
        return capacitadoCocina;
    }

    public void setCapacitadoCocina(boolean capacitadoCocina) {
        this.capacitadoCocina = capacitadoCocina;
    }

    public boolean isCapacitadoAtracciones() {
        return capacitadoAtracciones;
    }

    public void setCapacitadoAtracciones(boolean capacitadoAtracciones) {
        this.capacitadoAtracciones = capacitadoAtracciones;
    }

    public List<Turno> getTurnosAsignados() {
        return turnosAsignados;
    }

    public void agregarTurno(Turno turno) {
        if (turno != null && !turnosAsignados.contains(turno)) {
            turnosAsignados.add(turno);
            System.out.println("Turno añadido al empleado: " + nombre);
        } else {
            System.out.println("Turno no válido o ya asignado.");
        }
    }
}

