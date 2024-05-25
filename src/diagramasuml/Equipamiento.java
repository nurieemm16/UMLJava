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
public class Equipamiento {
    //Declaramos los atributos como privados
    private int id;
    private int proyector;
    private int sistVideo;
    
    //Creamos el constructor público para la clase Equipamiento y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora serán accesibles con el constructor)
    public Equipamiento(int id, int proyector, int sistVideo){
        this.id = id;
        this.proyector = proyector;
        this.sistVideo = sistVideo;
    }
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    public int getIdEquipamiento(){ //Método para coger el id.
        return id;
    }
    
    public int getProyectorEquipamiento(){ //Método para coger el número de proyectores.
        return proyector;
    }
    
    public int getSistVideoEquipamiento(){ //Método para coger el número de sistemas de vídeo.
        return sistVideo;
    }
    
    //Creo métodos para volver a llamar/cambiar los argumentos.
    public void setProyectorEquipamiento(int proyectorEquipamientoNuevo){ //Método para llamar/cambiar el número de proyectores.
        this.proyector = proyectorEquipamientoNuevo;
    }
    
    public void setSistVideoEquipamiento(int sistVideoNuevo){ //Método para llamar/cambiar el número de sistemas de vídeo.
        this.sistVideo = sistVideoNuevo;
    }
}
