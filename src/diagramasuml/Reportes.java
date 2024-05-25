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
public class Reportes {
    //Declaramos los atributos como privados
    private int id;
    private String fecha; //Date/fecha
    private String descripcion;
    private List<Reserva> listaReservas; // creo una lista que añadiré dentro de cada reporte (lista por reportes mayo con reservas mayo, junio con reservas junio)
    
    private static List<Reportes> listaReportesGenerica = new ArrayList<>(); // Creo e inicializo una lista de reportes (será la lista donde habrá TODOS los reportes)
    
    //Creamos el constructor público pra la clase Reportes y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora serán accesibles con el constructor)
    public Reportes(int id, String fecha, String descripcion){
        this.id = id;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.listaReservas = new ArrayList<>(); //inicializo la lista que se me creará cada vez que cree un reporte.
        
        listaReportesGenerica.add(this); // Cada vez que creo un Reporte se añade todos los argumentos del reporte dentro de esta lista.
    }
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    public int getIdReporte(){ //Método para coger el id.
        return id;
    }
    
    public String getFechaReporte(){ //Método para coger la fecha del reporte.
        return fecha;
    }
    
    public String getDescripcionReporte(){ //Método para coger la descripción.
        return descripcion;
    }
    
    public static List<Reportes> getListaReportesGenerica(){ //hago un get para obtener esta lista y poderla imprimir en el main.
        return listaReportesGenerica;
    }
    
    //Creo métodos para volver a llamar/cambiar los argumentos.
    public void setFechaReporte(String fechaReporteNuevo){ //Método para llamar/cambiar la fecha del reporte.
        this.fecha = fechaReporteNuevo;
    }
    
    public void setDescripcionReporte(String descripcionReporteNuevo){ //Método para llamar/cambiar la fecha del reporte.
        this.descripcion = descripcionReporteNuevo;
    }
    
    public void anadirListaReservas(Reserva reservaAnadir){
        listaReservas.add(reservaAnadir); //añadiré una reserva dentro de la lista reservas que está dentro de Reportes.
    }
    
    
    public List<Reserva> getReservas(){
        return listaReservas;
    }
    
}
