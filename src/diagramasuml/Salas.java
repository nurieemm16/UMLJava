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
public class Salas {
    //Declaramos los atributos como privados
    private int id;
    private String descripcion;
    private float superficieM2;
    private int capacidad;
    private String ubicacion;
    private Equipamiento equipamiento;
    boolean disponibilidad;
    private List<Equipamiento> listaEquipamiento; // creo una lista que a�adir� dentro de cada sala 
    
    private static List<Salas> listaSalasGenerica = new ArrayList<>(); // Creo e inicializo una lista de salas (ser� la lista donde habr� TODAS las reservas)
    
    
    //Creamos el constructor p�blico pra la clase Salas y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora ser�n accesibles con el constructor)
    public Salas(int id,  String descripcion, float superficieM2, int capacidad, String ubicacion, Equipamiento equipamiento, boolean disponibilidad){
        this.id = id;
        this.descripcion = descripcion;
        this.superficieM2 = superficieM2;
        this.capacidad = capacidad;
        this.ubicacion = ubicacion;
        this.equipamiento = equipamiento;
        this.disponibilidad = true;
        this.listaEquipamiento = new ArrayList<>(); //inicializo la lista que se me crear� cada vez que cree una sala.
        
        
        listaSalasGenerica.add(this); // Cada vez que creo una Sala se a�ada todos los argumentos de la reserva dentro de esta lista.
    }
    
    
    //Creo m�todos para coger el valor de los diferentes argumentos.
    public int getIdSala(){ //M�todo para coger el id.
        return id;
    }
    
    public String getDescripcionSala(){ //M�todo para coger la descripci�n.
        return descripcion;
    }
    
    public float getSuperficieSala(){ //M�todo para coger la superficie.
        return superficieM2;
    }
    
    public int getCapacidadSala(){ //M�todo para coger la capacidad.
        return capacidad;
    }
    
    public String getUbicacionSala(){ //M�todo para coger la superficie.
        return ubicacion;
    }
    
    public boolean getDisponibilidadSala(){ //M�todo para coger la disponibilidad.
        return disponibilidad;
    }
    
    public Equipamiento getEquipamientoSala(){ //M�todo para coger la disponibilidad.
        return equipamiento;
    }
    
    public static List<Salas> getListaSalasGenerica(){ //hago un get para obtener esta lista y poderla imprimir en el main.
        return listaSalasGenerica;
    }
    
    public List<Equipamiento> getEquipamientoSalaLista(){
        return listaEquipamiento;
    }
    
    //Creo m�todos para volver a llamar/cambiar los argumentos.
    public void setDescripcionSala(String descripcionSalaNuevo){ //M�todo para llamar/cambiar la descripci�n.
        this.descripcion = descripcionSalaNuevo;
    }
    
    public void setSuperficieSala(float superficieSalaNuevo){ //M�todo para llamar/cambiar la superf�cie.
        this.superficieM2 = superficieSalaNuevo;
    }
    
    public void setCapacidadSala(int capacidadSalaNuevo){ //M�todo para llamar/cambiar la capacidad.
        this.capacidad = capacidadSalaNuevo;
    }
    
    public void setUbicacionSala(String ubicacionSalaNuevo){ //M�todo para llamar/cambiar la ubicaci�n.
        this.ubicacion = ubicacionSalaNuevo;
    }
    
    public void setDisponibilidadSala(boolean disponibilidadSalaNuevo){ //M�todo para llamar/cambiar la disponibilidad.
        this.disponibilidad = disponibilidadSalaNuevo;
    }
}
