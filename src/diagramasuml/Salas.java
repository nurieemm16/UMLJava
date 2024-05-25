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
public class Salas {
    //Declaramos los atributos como privados
    private int id;
    private String descripcion;
    private float superficieM2;
    private int capacidad;
    private String ubicacion;
    private Equipamiento equipamiento;
    boolean disponibilidad;
    private List<Equipamiento> listaEquipamiento; // creo una lista que añadiré dentro de cada sala 
    
    private static List<Salas> listaSalasGenerica = new ArrayList<>(); // Creo e inicializo una lista de salas (será la lista donde habrá TODAS las reservas)
    
    
    //Creamos el constructor público pra la clase Salas y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora serán accesibles con el constructor)
    public Salas(int id,  String descripcion, float superficieM2, int capacidad, String ubicacion, Equipamiento equipamiento, boolean disponibilidad){
        this.id = id;
        this.descripcion = descripcion;
        this.superficieM2 = superficieM2;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.equipamiento = equipamiento;
        this.disponibilidad = true;
        this.listaEquipamiento = new ArrayList<>(); //inicializo la lista que se me creará cada vez que cree una sala.
        
        
        listaSalasGenerica.add(this); // Cada vez que creo una Sala se añada todos los argumentos de la reserva dentro de esta lista.
    }
    
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    public int getIdSala(){ //Método para coger el id.
        return id;
    }
    
    public String getDescripcionSala(){ //Método para coger la descripción.
        return descripcion;
    }
    
    public float getSuperficieSala(){ //Método para coger la superficie.
        return superficieM2;
    }
    
    public int getCapacidadSala(){ //Método para coger la capacidad.
        return capacidad;
    }
    
    public String getUbicacionSala(){ //Método para coger la superficie.
        return ubicacion;
    }
    
    public boolean getDisponibilidadSala(){ //Método para coger la disponibilidad.
        return disponibilidad;
    }
    
    public Equipamiento getEquipamientoSala(){ //Método para coger la disponibilidad.
        return equipamiento;
    }
    
    public static List<Salas> getListaSalasGenerica(){ //hago un get para obtener esta lista y poderla imprimir en el main.
        return listaSalasGenerica;
    }
    
    public List<Equipamiento> getEquipamientoSalaLista(){
        return listaEquipamiento;
    }
    
    //Creo métodos para volver a llamar/cambiar los argumentos.
    public void setDescripcionSala(String descripcionSalaNuevo){ //Método para llamar/cambiar la descripción.
        this.descripcion = descripcionSalaNuevo;
    }
    
    public void setSuperficieSala(float superficieSalaNuevo){ //Método para llamar/cambiar la superfície.
        this.superficieM2 = superficieSalaNuevo;
    }
    
    public void setCapacidadSala(int capacidadSalaNuevo){ //Método para llamar/cambiar la capacidad.
        this.capacidad = capacidadSalaNuevo;
    }
    
    public void setUbicacionSala(String ubicacionSalaNuevo){ //Método para llamar/cambiar la ubicación.
        this.ubicacion = ubicacionSalaNuevo;
    }
    
    public void setDisponibilidadSala(boolean disponibilidadSalaNuevo){ //Método para llamar/cambiar la disponibilidad.
        this.disponibilidad = disponibilidadSalaNuevo;
    }
}
