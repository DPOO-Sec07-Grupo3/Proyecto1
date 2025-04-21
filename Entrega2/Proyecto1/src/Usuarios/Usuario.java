package Usuarios;
import java.util.Scanner;

public class Usuario {
    private String login;
    private String password;

    public Usuario(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public void cambiarContrasena() {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu login: ");
        String loginIngresado = sc.nextLine();

        System.out.print("Ingresa tu contraseña actual: ");
        String contrasenaIngresada = sc.nextLine();
        
        if(this.comprobarInicioSesion(loginIngresado, contrasenaIngresada)){
        	
        	System.out.print("Ingresa la nueva contraseña: ");
            String nueva = sc.nextLine();

            System.out.print("Confirma la nueva contraseña: ");
            String confirmacion = sc.nextLine();
            
            if (nueva.equals(confirmacion)) {
            	this.setPassword(confirmacion);
            	System.out.println("Contraseña cambiada exitosamente.");}
            else {
            		System.out.println("Las contraseñas no coinciden.");
            	}
            }
        	
        else {
        	System.out.println("Login o contraseña incorrectos.");
        }
    }

    public boolean comprobarInicioSesion(String login, String password) {
        return this.login.equals(login) && this.password.equals(password);
    }

    public boolean iniciarSesion() {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu login: ");
        String loginIngresado = sc.nextLine();

        System.out.print("Ingresa tu contraseña actual: ");
        String contrasenaIngresada = sc.nextLine();
        
        if(this.comprobarInicioSesion(loginIngresado, contrasenaIngresada)) {
        	System.out.print("Se inicio sesion exitosamente. ");
        	return true;
        }
        else {
        	System.out.print("Fallo en el inicio de sesion. ");
        	return false;
        }
    }

    public boolean crearLogin() {
    	Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu login nuevo: ");
        String loginIngresado = sc.nextLine();
        InfoUsuarios val= new InfoUsuarios();
        if(val.existeUsuario(loginIngresado)) {
        System.out.print("El login ingresado ya esta en uso ");
        return false;
        }
        else {
        	System.out.print("Ingresa tu contraseña: ");
        	String contra = sc.nextLine();
        	Usuario usuario=new Usuario(loginIngresado,contra);
        	val.anadirUsuario(usuario);
        	System.out.print("La creacion del usuario fue exitosa.");
        	return true;
        }
    }

    // Getters y Setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
