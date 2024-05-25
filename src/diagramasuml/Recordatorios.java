/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;
import java.util.Date;
/**
 *
 * @author N�ria Marzo 
 */
public class Recordatorios {
    //Declaramos los atributos como privados
    private int id;
    private String fecha; //Date
    private String nombreCliente;
    private String apellidosCliente;
    private Reserva reserva;
    
    //Creamos el constructor p�blico para la clase Recordatorios y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora ser�n accesibles con el constructor)
    public Recordatorios(int id, String fecha, String nombreCliente, String apellidosCliente, Reserva reserva){
        this.id = id;
        this.fecha = fecha;
        this.nombreCliente = nombreCliente;
        this.apellidosCliente = apellidosCliente;
        this.reserva = reserva;
    }
    
    //Creo m�todos para coger el valor de los diferentes argumentos.
    public int getIdRecordatorio(){ //M�todo para coger el id.
        return id;
    }
    
    public String getFechaRecordatorio(){ //M�todo para coger la fecha del recordatorio.
        return fecha;
    }
    
    public String getNombreClienteRecordatorio(){ //M�todo para coger el nombre del cliente en el recordatorio.
        return nombreCliente;
    }
    
    public String getApellidosClienteRecordatorio(){ //M�todo para coger los apellidos del cliente en el recordatorio.
        return apellidosCliente;
    }
    
    //Creo m�todos para volver a llamar/cambiar los argumentos.
    public void setFechaRecordatorio(String fechaRecordatorioNuevo){ //M�todo para llamar/cambiar la fecha.
        this.fecha = fechaRecordatorioNuevo;
    }
    
    public void setNombreClienteRecordatorio(String nombreClienteRecordatorioNuevo){ //M�todo para llamar/cambiar el nombre del cliente en el recordatorio.
        this.nombreCliente = nombreClienteRecordatorioNuevo;
    }
    
    public void setApellidosClienteRecordatorio(String apellidosClienteRecordatorioNuevo){ //M�todo para llamar/cambiar a los apellidos del cliente en el recordatorio.
        this.apellidosCliente = apellidosClienteRecordatorioNuevo;
    }
    
    
}
