package ControladorTiquetes;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import InfoParque.Atraccion;
import Usuarios.Usuario;

public class Tiquete {
    private String ticketId;
    private boolean fastPass;

    
    public Tiquete(String ticketId) {
        this.ticketId = ticketId;
        this.fastPass = false;
    }

    
    public String getTicketId() {
        return ticketId;
    }

    
    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    
    public boolean isFastPass() {
        return fastPass;
    }

    
    public void setFastPass(boolean fastPass) {
        this.fastPass = fastPass;
    }

    
    public void compraOnline(Usuario usuario) {
    	  Scanner scanner = new Scanner(System.in);
          Tiquete ticket = null;

          System.out.println("=== Compra online para usuario: " + usuario.getLogin() + " ===");
          System.out.print("Tipo de ticket (temporada / individual / sinfecha): ");
          String tipo = scanner.nextLine().trim().toLowerCase();

          switch (tipo) {
          case "temporada":

              System.out.print("Fecha inicio (YYYY-MM-DD): ");
              LocalDate inicio = LocalDate.parse(scanner.nextLine());

              System.out.print("Fecha fin (YYYY-MM-DD): ");
              LocalDate fin = LocalDate.parse(scanner.nextLine());

              long dias = ChronoUnit.DAYS.between(inicio, fin) + 1;
              
              ticket = new TiqueteTemporada(
                  "999",dias,
                  Arrays.asList(inicio, fin));
              break;

          case "individual":
              System.out.print("Nombre de la atracción: ");
              String nombreAtraccion = scanner.nextLine();
              ticket = new TiqueteIndividual("999");
              break;

          case "sinfecha":
              System.out.print("Tipo de exclusividad: ");
              String exclusividad = scanner.nextLine();


              ticket = new TiqueteSinFecha("999");
              break;

          default:
              System.out.println(">> Tipo de ticket no válido. Operación cancelada.");
              return;
      }

      
      System.out.print("¿Desea agregar un FastPass? (true/false): ");
      boolean quiereFastPass = Boolean.parseBoolean(scanner.nextLine());
      if (quiereFastPass) {
          FastPass fp = new FastPass(LocalDate.now());
          ticket.asignarFastpass(ticket);
          System.out.println("FastPass asociado correctamente.");
      }

    
      System.out.println(">> Ticket asociado al usuario: " + usuario.getLogin());}

    
    public void compraTaquilla(String puntoVenta) {
            Scanner scanner = new Scanner(System.in);
            Tiquete ticket = null;

            System.out.println("=== Compra en taquilla: " + puntoVenta + " ===");
            System.out.print("Tipo de ticket (temporada / individual / sinfecha): ");
            String tipo = scanner.nextLine().trim().toLowerCase();

            switch (tipo) {
                case "temporada":

                    System.out.print("Fecha inicio (YYYY-MM-DD): ");
                    LocalDate inicio = LocalDate.parse(scanner.nextLine());

                    System.out.print("Fecha fin (YYYY-MM-DD): ");
                    LocalDate fin = LocalDate.parse(scanner.nextLine());

                    long dias = ChronoUnit.DAYS.between(inicio, fin) + 1;
                    
                    ticket = new TiqueteTemporada(
                        "999",dias,
                        Arrays.asList(inicio, fin));
                 
                    break;

                case "individual":
                    System.out.print("Nombre de la atracción: ");
                    String nombreAtraccion = scanner.nextLine();
                    ticket = new TiqueteIndividual("999");
                    break;

                case "sinfecha":
                    System.out.print("Tipo de exclusividad: ");
                    String exclusividad = scanner.nextLine();


                    ticket = new TiqueteSinFecha("999");
                    break;

                default:
                    System.out.println(">> Tipo de ticket no válido. Operación cancelada.");
                    return;
            }

            
            System.out.print("¿Desea agregar un FastPass? (true/false): ");
            boolean quiereFastPass = Boolean.parseBoolean(scanner.nextLine());
            if (quiereFastPass) {
                FastPass fp = new FastPass(LocalDate.now());
                ticket.asignarFastpass(ticket);
                System.out.println("FastPass asociado correctamente.");
            }

           
            System.out.print("Ingrese el login del usuario para asignar el ticket: ");
            String login = scanner.nextLine();
    
            System.out.println(">> Ticket asociado al usuario: " + login);

            System.out.println("Compra en taquilla finalizada.");
        }
    

    
    public void asignarFastpass(Tiquete tiquete) {
        if (tiquete != null) {
            tiquete.setFastPass(true);
            System.out.println("FastPass asignado al ticket: " + tiquete.getTicketId());
        } else {
            System.out.println("No se puede asignar FastPass: ticket nulo.");
        }
    }
}
