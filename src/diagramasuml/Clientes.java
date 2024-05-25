/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;

/**
 *
 * @author N�ria Marzo
 */
public class Clientes extends Usuarios {
    //Declaramos los atributos como privados
    private int telefono;
    
    //Creamos el constructor p�blico para la clase Clientes y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora ser�n accesibles con el constructor)
    public Clientes(String rol, int id, String nombre, String apellidos, String mail, String contrasena, int telefono){
        super(rol, id, nombre, apellidos, mail, contrasena);
        this.telefono = telefono;
    }
    
    //Creo m�todos para coger el valor de los diferentes argumentos.
    public int getTelefonoCliente(){ //M�todo para coger el tel�fono.
        return telefono;
    }
    
    //Los siguientes m�todos cogen el valor de la clase padre Usuarios. Le devuelvo el m�todo que hay en la clase Usuarios, hence el super. 
    public String getRolCliente(){ //M�todo para coger el rol.
        return super.getRolUsuario();
    }
    
    public int getIdCliente(){ //M�todo para coger el id.
        return super.getIdUsuario();
    }
    
    public String getNombreCliente(){ //M�todo para coger el nombre.
        return super.getNombreUsuario();
    }
    
    public String getApellidosCliente(){ //M�todo para coger los apellidos.
        return super.getApellidosUsuario();
    }
    
    public String getMailCliente(){ //M�todo para coger el mail.
        return super.getMailUsuario();
    }
    
    public String getContrasenaCliente(){ //M�todo para coger la contrase�a.
        return super.getContrasenaUsuario();
    }

    //Creo m�todos para volver a llamar/cambiar los argumentos. Los siguientes m�todos cogen el valor de la clase padre Usuarios.
    public void setRolCliente(String rolClienteNuevo){ //M�todo para llamar/cambiar el rol.
        super.setRolUsuario(rolClienteNuevo);
    }    
    
    public void setMailCliente(String mailClienteNuevo){ //M�todo para llamar/cambiar el mail.
        super.setMailUsuario(mailClienteNuevo);
    }
    
    public void setContrasenaCliente(String contrasenaClienteNuevo){ //M�todo para llamar/cambiar la contrase�a.
        super.setContrasenaUsuario(contrasenaClienteNuevo);
    }
    
    public void crearReserva(Reserva r, Salas sala){
        if (r != null && sala != null){
            System.out.println("  " + this.getNombreCliente() + ", se ha creado CORRECTAMENTE la reserva, con c�digo " + r.getCodigoReserva() + ", de la " + sala.getDescripcionSala() + 
                    "\n    Con fechas: " + r.getFechaInicioReserva() + "-" + r.getFechaFinReserva() + 
                    "\n    En el horario de " + r.getHoraInicioReserva() + "a" + r.getHoraFinReserva() + 
                    "\n    Con un precio total de: " + r.getPrecioReserva() + "�." + 
                    "\n      Actualmente su reserva se encuentra: " + r.getEstadoReserva() + "\n");
        } else {
            System.out.println("  No se ha podido crear la reserva.\n");
        }
    }    
}
