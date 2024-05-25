/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;
import java.util.*;
import java.lang.*;

/**
 *
 * @author Núria Marzo
 */
public class Sistema {
    //Declaramos los atributos como privados
    private int id;
    
    //Creamos el constructor público pra la clase Sistema y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora serán accesibles con el constructor)
    public Sistema(int id){
        //Inicializamos los atributos
        this.id = id;
    }
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    public int getIdSistema(){
        return id;
    }
    
    
   
    //Creo un método para enviar recordatorios (a través de la clase Sistema). Hay dos formas de hacerlo "enviarRecordatorio" y "enviarRecordatorio2" 
    public void enviarRecordatorio(Clientes cliente, Recordatorios recordatorio, Reserva reserva){
        //Creamos la lógica del método, no la implementamos aún (esto en el MAIN)
        if (cliente.getTelefonoCliente() == 0 && cliente.getMailCliente() == null){ //si lo escribo yo es indiferente si pongo undefined o null porque lo escribo yo
            System.out.println("  El sistema NO HA PODIDO ENVIAR EL RECORDATORIO al cliente " + cliente.getNombreCliente() + " " + cliente.getApellidosCliente() + " porque no se ha facilitado ni el teléfono ni el mail.");
            
        } else if (cliente.getTelefonoCliente() == 0 && cliente.getMailCliente() != null){
            System.out.println("  El sistema ha enviado el recordatorio al mail " + cliente.getMailCliente() + ", el día " + recordatorio.getFechaRecordatorio() + ".");
            System.out.println("     Recordatorio " + recordatorio.getIdRecordatorio());
            System.out.println("       RECUERDA que mañana " + reserva.getFechaInicioReserva() + " tienes una reserva. \n       Persona de contacto: " + recordatorio.getNombreClienteRecordatorio() + " " + recordatorio.getApellidosClienteRecordatorio() + "\n       El código de tu reserva es: " + reserva.getCodigoReserva() + ".");
        
        } else if (cliente.getTelefonoCliente() != 0 && cliente.getMailCliente() == null){
            System.out.println("  El sistema ha enviado el recordatorio por SMS al teléfono " + cliente.getTelefonoCliente() + ", el día " + recordatorio.getFechaRecordatorio() + ".");
            System.out.println("     Recordatorio " + recordatorio.getIdRecordatorio());
            System.out.println("       RECUERDA que mañana " + reserva.getFechaInicioReserva() + " tienes una reserva. \n       Persona de contacto: " + recordatorio.getNombreClienteRecordatorio() + " " + recordatorio.getApellidosClienteRecordatorio() + "\n       El código de tu reserva es: " + reserva.getCodigoReserva() + ".");
        
        } else {
            System.out.println("  El sistema ha enviado el recordatorio al mail " + cliente.getMailCliente() + " y por SMS al teléfono " + cliente.getTelefonoCliente() + ", el día " + recordatorio.getFechaRecordatorio() + ".");
            System.out.println("     Recordatorio " + recordatorio.getIdRecordatorio());
            System.out.println("       RECUERDA que mañana " + reserva.getFechaInicioReserva() + " tienes una reserva. \n       Persona de contacto: " + recordatorio.getNombreClienteRecordatorio() + " " + recordatorio.getApellidosClienteRecordatorio() + "\n       El código de tu reserva es: " + reserva.getCodigoReserva() + ".");
        
        }
        System.out.println("");
    }
    
    public Clientes crearCliente (String rol, int id, String nombre, String apellidos, String mail, String contrasena, int telefono){
        Clientes nuevoCliente = new Clientes(rol, id, nombre, apellidos, mail, contrasena, telefono); 
        System.out.println("  El sistema ha creado el usuario " + nombre + " " + apellidos + " y le ha asignado el rol de " + rol + ".");
           
        return nuevoCliente;
    }
    
    public Administradores crearAdmin(String rol, int id, String nombre, String apellidos, String mail, String contrasena){
        Administradores nuevoAdmin = new Administradores(rol, id, nombre, apellidos, mail, contrasena);
        System.out.println("  El sistema ha creado el usuario " + nombre + " " + apellidos + " y le ha asignado el rol de " + rol + ".");
           
        return nuevoAdmin;
    }
}
