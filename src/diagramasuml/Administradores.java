/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;

/**
 *
 * @author Núria Marzo 
 */
public class Administradores extends Usuarios{
    public Administradores(String rol, int id, String nombre, String apellidos, String mail, String contrasena){
    super(rol, id, nombre, apellidos, mail, contrasena);
    }
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    //Los siguientes métodos cogen el valor de la clase padre Usuarios. Le devuelvo el método que hay en la clase Usuarios, hence el super. 
    public String getRolAdmin(){ //Método para coger el rol.
        return super.getRolUsuario();
    }
    
    public int getIdAdmin(){ //Método para coger el id.
        return super.getIdUsuario();
    }
    
    public String getNombreAdmin(){ //Método para coger el nombre.
        return super.getNombreUsuario();
    }
    
    public String getApellidosAdmin(){ //Método para coger los apellidos.
        return super.getApellidosUsuario();
    }
    
    public String getMailAdmin(){ //Método para coger el mail.
        return super.getMailUsuario();
    }
    
    public String getContrasenaAdmin(){ //Método para coger el mail.
        return super.getContrasenaUsuario();
    }

    //Creo métodos para volver a llamar/cambiar los argumentos. Los siguientes métodos cogen el valor de la clase padre Usuarios.
    public void setRolAdmin(String rolAdminNuevo){ //Método para llamar/cambiar el rol.
        super.setRolUsuario(rolAdminNuevo);
    }    
    
    public void setMailAdmin(String mailAdminNuevo){ //Método para llamar/cambiar el mail.
        super.setMailUsuario(mailAdminNuevo);
    }
    
    public void setContrasenaAdmin(String contrasenaAdminNuevo){ //Método para llamar/cambiar la contraseña.
        super.setContrasenaUsuario(contrasenaAdminNuevo);
    }
    
    public void consultarReportes(){
        //Muestro la lista genérica de reportes en la consola (tengo que recorrer la lista porque sino solo se me imprimiría el primer elemento)
        System.out.println("Lista de todos los reportes: ");
        for (Reportes i : Reportes.getListaReportesGenerica()){
            System.out.println("Reporte con ID: " + i.getIdReporte() + "\n Fecha de la creación del reporte: " + i.getFechaReporte() + "\n Descripción: " + i.getDescripcionReporte());
        }
    }
    
    /*public Salas gestionSalas(String modifSala){ //Hacerlo en el MAIN con las diferentes funciones SET
    }*/
    
    /*public Boolean modificarEquipamiento(Int id){ //Hacerlo en el MAIN con las diferentes funciones SET
    }*/
    
    /*public void eliminarEquipamiento(Int id){ //Hacerlo en el MAIN con las diferentes funciones SET (ponerlo a null o 0)
    }*/
}
