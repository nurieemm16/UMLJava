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
public class Equipamiento {
    //Declaramos los atributos como privados
    private int id;
    private int proyector;
    private int sistVideo;
    
    //Creamos el constructor p�blico para la clase Equipamiento y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora ser�n accesibles con el constructor)
    public Equipamiento(int id, int proyector, int sistVideo){
        this.id = id;
        this.proyector = proyector;
        this.sistVideo = sistVideo;
    }
    
    //Creo m�todos para coger el valor de los diferentes argumentos.
    public int getIdEquipamiento(){ //M�todo para coger el id.
        return id;
    }
    
    public int getProyectorEquipamiento(){ //M�todo para coger el n�mero de proyectores.
        return proyector;
    }
    
    public int getSistVideoEquipamiento(){ //M�todo para coger el n�mero de sistemas de v�deo.
        return sistVideo;
    }
    
    //Creo m�todos para volver a llamar/cambiar los argumentos.
    public void setProyectorEquipamiento(int proyectorEquipamientoNuevo){ //M�todo para llamar/cambiar el n�mero de proyectores.
        this.proyector = proyectorEquipamientoNuevo;
    }
    
    public void setSistVideoEquipamiento(int sistVideoNuevo){ //M�todo para llamar/cambiar el n�mero de sistemas de v�deo.
        this.sistVideo = sistVideoNuevo;
    }
}
