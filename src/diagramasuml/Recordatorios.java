/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;
import java.util.Date;
/**
 *
 * @author Núria Marzo 
 */
public class Recordatorios {
    //Declaramos los atributos como privados
    private int id;
    private String fecha; //Date
    private String nombreCliente;
    private String apellidosCliente;
    private Reserva reserva;
    
    //Creamos el constructor público para la clase Recordatorios y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora serán accesibles con el constructor)
    public Recordatorios(int id, String fecha, String nombreCliente, String apellidosCliente, Reserva reserva){
        this.id = id;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.reserva = reserva;
    }
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    public int getIdRecordatorio(){ //Método para coger el id.
        return id;
    }
    
    public String getFechaRecordatorio(){ //Método para coger la fecha del recordatorio.
        return fecha;
    }
    
    public String getNombreClienteRecordatorio(){ //Método para coger el nombre del cliente en el recordatorio.
        return nombreCliente;
    }
    
    public String getApellidosClienteRecordatorio(){ //Método para coger los apellidos del cliente en el recordatorio.
        return apellidosCliente;
    }
    
    //Creo métodos para volver a llamar/cambiar los argumentos.
    public void setFechaRecordatorio(String fechaRecordatorioNuevo){ //Método para llamar/cambiar la fecha.
        this.fecha = fechaRecordatorioNuevo;
    }
    
    public void setNombreClienteRecordatorio(String nombreClienteRecordatorioNuevo){ //Método para llamar/cambiar el nombre del cliente en el recordatorio.
        this.nombreCliente = nombreClienteRecordatorioNuevo;
    }
    
    public void setApellidosClienteRecordatorio(String apellidosClienteRecordatorioNuevo){ //Método para llamar/cambiar a los apellidos del cliente en el recordatorio.
        this.apellidosCliente = apellidosClienteRecordatorioNuevo;
    }
    
    
}
