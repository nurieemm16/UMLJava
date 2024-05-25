/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;
import java.util.*;
import java.util.stream.*;

/**
 *
 * @author Núria Marzo
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
    
    private static List<Reserva> listaReservasGenerica = new ArrayList<>(); // Creo e inicializo una lista de reservas (será la lista donde habrá TODAS las reservas)
    
    //Creamos el constructor público pra la clase Reserva y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora serán accesibles con el constructor)
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
        
        listaReservasGenerica.add(this); //Cada vez que creo una Reserva se añada todos los argumentos de la reserva dentro de esta lista.
    }
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    public int getIdReserva(){ //Método para coger el id.
        return id;
    }
    
    public String getFechaInicioReserva(){ //Método para coger la fecha de inicio.
        return fechaInicio;
    }
    
    public String getFechaFinReserva(){ //Método para coger la fecha de fin.
        return fechaFin;
    }
    
    public int getHoraInicioReserva(){ //Método para coger la hora de inicio.
        return horaInicio;
    }
    
    public int getHoraFinReserva(){ //Método para coger la hora de fin.
        return horaFin;
    }
    
    public Salas getSalaReserva(){ //Método para coger la sala de la reserva.
        return sala;
    }
    
    public float getPrecioReserva(){ //Método para coger el precio.
        return precio;
    }
    
    public String getEstadoReserva(){ //Método para coger el estado.
        return estado;
    }
    
    public String getCodigoReserva(){ //Método para coger el código.
        return codigo;
    }
    
    public static List<Reserva> getListaReservasGenerica(){ //hago un get para obtener esta lista y poderla imprimir en el main.
        return listaReservasGenerica;
    }
    
    //Creo métodos para volver a llamar/cambiar los argumentos.
    public void setFechaInicioReserva(String fechaInicioReservaNuevo){ //Método para llamar/cambiar la fecha de inicio.
        this.fechaInicio = fechaInicioReservaNuevo;
    }
    
    public void setFechaFinReserva(String fechaFinReservaNuevo){ //Método para llamar/cambiar la fecha de fin.
        this.fechaFin = fechaFinReservaNuevo;
    }
    
    public void setHoraInicioReserva(int horaInicioReservaNuevo){ //Método para llamar/cambiar la hora de inicio.
        this.horaInicio = horaInicioReservaNuevo;
    }
    
    public void setHoraFinReserva(int horaFinReservaNuevo){ //Método para llamar/cambiar la hora de fin.
        this.horaFin = horaFinReservaNuevo;
    }
    
    public void setPrecioReserva(float precioReservaNuevo){ //Método para llamar/cambiar el precio.
        this.precio = precioReservaNuevo;
    }
    
    public void setEstadoReserva(String estadoReservaNuevo){ //Método para llamar/cambiar la fecha de fin.
        this.estado = estadoReservaNuevo;
    }
    
    public void setCodigoReserva(String codigoReservaNuevo){ //Método para llamar/cambiar la fecha de fin.
        this.codigo = codigoReservaNuevo;
    }
    
   
    
}
