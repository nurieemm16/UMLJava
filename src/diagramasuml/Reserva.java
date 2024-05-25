/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;
import java.util.*;
import java.util.stream.*;

/**
 *
 * @author N�ria Marzo
 */
public class Reserva {
    //Declaramos los atributos como privados
    private int id;
    private String fechaInicio; //Date/FECHA
    private String fechaFin; //Date/FECHA
    private int horaInicio;
    private int horaFin;
    private Salas sala;
    private float precio;
    private String estado;
    private Clientes cliente;
    private String codigo;
    
    private static List<Reserva> listaReservasGenerica = new ArrayList<>(); // Creo e inicializo una lista de reservas (ser� la lista donde habr� TODAS las reservas)
    
    //Creamos el constructor p�blico pra la clase Reserva y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora ser�n accesibles con el constructor)
    public Reserva(int id, String fechaInicio, String fechaFin, int horaInicio, int horaFin, Salas sala, float precio, String estado, Clientes cliente, String codigo){
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.sala = sala;
        this.precio = precio;
        this.estado = estado;
        this.cliente = cliente;
        this.codigo = codigo;
        
        listaReservasGenerica.add(this); //Cada vez que creo una Reserva se a�ada todos los argumentos de la reserva dentro de esta lista.
    }
    
    //Creo m�todos para coger el valor de los diferentes argumentos.
    public int getIdReserva(){ //M�todo para coger el id.
        return id;
    }
    
    public String getFechaInicioReserva(){ //M�todo para coger la fecha de inicio.
        return fechaInicio;
    }
    
    public String getFechaFinReserva(){ //M�todo para coger la fecha de fin.
        return fechaFin;
    }
    
    public int getHoraInicioReserva(){ //M�todo para coger la hora de inicio.
        return horaInicio;
    }
    
    public int getHoraFinReserva(){ //M�todo para coger la hora de fin.
        return horaFin;
    }
    
    public Salas getSalaReserva(){ //M�todo para coger la sala de la reserva.
        return sala;
    }
    
    public float getPrecioReserva(){ //M�todo para coger el precio.
        return precio;
    }
    
    public String getEstadoReserva(){ //M�todo para coger el estado.
        return estado;
    }
    
    public String getCodigoReserva(){ //M�todo para coger el c�digo.
        return codigo;
    }
    
    public static List<Reserva> getListaReservasGenerica(){ //hago un get para obtener esta lista y poderla imprimir en el main.
        return listaReservasGenerica;
    }
    
    //Creo m�todos para volver a llamar/cambiar los argumentos.
    public void setFechaInicioReserva(String fechaInicioReservaNuevo){ //M�todo para llamar/cambiar la fecha de inicio.
        this.fechaInicio = fechaInicioReservaNuevo;
    }
    
    public void setFechaFinReserva(String fechaFinReservaNuevo){ //M�todo para llamar/cambiar la fecha de fin.
        this.fechaFin = fechaFinReservaNuevo;
    }
    
    public void setHoraInicioReserva(int horaInicioReservaNuevo){ //M�todo para llamar/cambiar la hora de inicio.
        this.horaInicio = horaInicioReservaNuevo;
    }
    
    public void setHoraFinReserva(int horaFinReservaNuevo){ //M�todo para llamar/cambiar la hora de fin.
        this.horaFin = horaFinReservaNuevo;
    }
    
    public void setPrecioReserva(float precioReservaNuevo){ //M�todo para llamar/cambiar el precio.
        this.precio = precioReservaNuevo;
    }
    
    public void setEstadoReserva(String estadoReservaNuevo){ //M�todo para llamar/cambiar la fecha de fin.
        this.estado = estadoReservaNuevo;
    }
    
    public void setCodigoReserva(String codigoReservaNuevo){ //M�todo para llamar/cambiar la fecha de fin.
        this.codigo = codigoReservaNuevo;
    }
    
   
    
}
