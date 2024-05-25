/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;
import java.util.*;

/**
 *
 * @author Núria Marzo
 */
public class Usuarios {
    //Declaramos los atributos como privados
    private String rol;
    private int id;
    private String nombre;
    private String apellidos;
    private String mail;
    private String contrasena;
    
    //static Scanner sc = new Scanner(System.in);
    
    //Creamos el constructor público pra la clase Usuario y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora serán accesibles con el constructor)
    public Usuarios(String rol, int id, String nombre, String apellidos, String mail, String contrasena){
        this.rol = rol;
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;     
        this.mail = mail;
        this.contrasena = contrasena;
    }
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    public String getRolUsuario(){ //Método para coger el rol.
        return rol;
    }
    
    public int getIdUsuario(){ //Método para coger el id.
        return id;
    }
    
    public String getNombreUsuario(){ //Método para coger el nombre.
        return nombre;
    }
    
    public String getApellidosUsuario(){ //Método para coger los apellidos.
        return apellidos;
    }
    
    public String getMailUsuario(){ //Método para coger el mail.
        return mail;
    }
    
    public String getContrasenaUsuario(){ //Método para coger la contraseña.
        return contrasena;
    }
    
    //Creo métodos para volver a llamar/cambiar los argumentos.
    public void setRolUsuario(String rolUsuarioNuevo){ //Método para llamar/cambiar el rol.
        this.rol = rolUsuarioNuevo;
    }    
    
    public void setMailUsuario(String mailUsuarioNuevo){ //Método para llamar/cambiar el mail.
        this.mail = mailUsuarioNuevo;
    }
    
    public void setContrasenaUsuario(String contrasenaUsuarioNuevo){ //Método para llamar/cambiar la contraseña.
        this.contrasena = contrasenaUsuarioNuevo;
    }
    
    
    public void iniciarSesion(){
        System.out.println("  " + getNombreUsuario() + " has iniciado sesión como " + getRolUsuario() + ".");
    }    
    
    public void cerrarSesion(){
        System.out.println("  " + getNombreUsuario() + ", tu sesión como " + getRolUsuario() + " se ha cerrado correctamente.");
    }
}

