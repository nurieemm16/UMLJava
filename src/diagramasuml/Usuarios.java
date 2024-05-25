/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;
import java.util.*;

/**
 *
 * @author N�ria Marzo
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
    
    //Creamos el constructor p�blico pra la clase Usuario y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora ser�n accesibles con el constructor)
    public Usuarios(String rol, int id, String nombre, String apellidos, String mail, String contrasena){
        this.rol = rol;
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;     
        this.mail = mail;
        this.contrasena = contrasena;
    }
    
    //Creo m�todos para coger el valor de los diferentes argumentos.
    public String getRolUsuario(){ //M�todo para coger el rol.
        return rol;
    }
    
    public int getIdUsuario(){ //M�todo para coger el id.
        return id;
    }
    
    public String getNombreUsuario(){ //M�todo para coger el nombre.
        return nombre;
    }
    
    public String getApellidosUsuario(){ //M�todo para coger los apellidos.
        return apellidos;
    }
    
    public String getMailUsuario(){ //M�todo para coger el mail.
        return mail;
    }
    
    public String getContrasenaUsuario(){ //M�todo para coger la contrase�a.
        return contrasena;
    }
    
    //Creo m�todos para volver a llamar/cambiar los argumentos.
    public void setRolUsuario(String rolUsuarioNuevo){ //M�todo para llamar/cambiar el rol.
        this.rol = rolUsuarioNuevo;
    }    
    
    public void setMailUsuario(String mailUsuarioNuevo){ //M�todo para llamar/cambiar el mail.
        this.mail = mailUsuarioNuevo;
    }
    
    public void setContrasenaUsuario(String contrasenaUsuarioNuevo){ //M�todo para llamar/cambiar la contrase�a.
        this.contrasena = contrasenaUsuarioNuevo;
    }
    
    
    public void iniciarSesion(){
        System.out.println("  " + getNombreUsuario() + " has iniciado sesi�n como " + getRolUsuario() + ".");
    }    
    
    public void cerrarSesion(){
        System.out.println("  " + getNombreUsuario() + ", tu sesi�n como " + getRolUsuario() + " se ha cerrado correctamente.");
    }
}

