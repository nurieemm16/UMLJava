/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diagramasuml;

/**
 *
 * @author Núria Marzo
 */
public class Clientes extends Usuarios {
    //Declaramos los atributos como privados
    private int telefono;
    
    //Creamos el constructor público para la clase Clientes y le pasamos los argumentos (atributos) privados que hemos declarado anteriormente (ahora serán accesibles con el constructor)
    public Clientes(String rol, int id, String nombre, String apellidos, String mail, String contrasena, int telefono){
        super(rol, id, nombre, apellidos, mail, contrasena);
        this.telefono = telefono;
    }
    
    //Creo métodos para coger el valor de los diferentes argumentos.
    public int getTelefonoCliente(){ //Método para coger el teléfono.
        return telefono;
    }
    
    //Los siguientes métodos cogen el valor de la clase padre Usuarios. Le devuelvo el método que hay en la clase Usuarios, hence el super. 
    public String getRolCliente(){ //Método para coger el rol.
        return super.getRolUsuario();
    }
    
    public int getIdCliente(){ //Método para coger el id.
        return super.getIdUsuario();
    }
    
    public String getNombreCliente(){ //Método para coger el nombre.
        return super.getNombreUsuario();
    }
    
    public String getApellidosCliente(){ //Método para coger los apellidos.
        return super.getApellidosUsuario();
    }
    
    public String getMailCliente(){ //Método para coger el mail.
        return super.getMailUsuario();
    }
    
    public String getContrasenaCliente(){ //Método para coger la contraseña.
        return super.getContrasenaUsuario();
    }

    //Creo métodos para volver a llamar/cambiar los argumentos. Los siguientes métodos cogen el valor de la clase padre Usuarios.
    public void setRolCliente(String rolClienteNuevo){ //Método para llamar/cambiar el rol.
        super.setRolUsuario(rolClienteNuevo);
    }    
    
    public void setMailCliente(String mailClienteNuevo){ //Método para llamar/cambiar el mail.
        super.setMailUsuario(mailClienteNuevo);
    }
    
    public void setContrasenaCliente(String contrasenaClienteNuevo){ //Método para llamar/cambiar la contraseña.
        super.setContrasenaUsuario(contrasenaClienteNuevo);
    }
    
    public void crearReserva(Reserva r, Salas sala){
        if (r != null && sala != null){
            System.out.println("  " + this.getNombreCliente() + ", se ha creado CORRECTAMENTE la reserva, con código " + r.getCodigoReserva() + ", de la " + sala.getDescripcionSala() + 
                    "\n    Con fechas: " + r.getFechaInicioReserva() + "-" + r.getFechaFinReserva() + 
                    "\n    En el horario de " + r.getHoraInicioReserva() + "a" + r.getHoraFinReserva() + 
                    "\n    Con un precio total de: " + r.getPrecioReserva() + "€." + 
                    "\n      Actualmente su reserva se encuentra: " + r.getEstadoReserva() + "\n");
        } else {
            System.out.println("  No se ha podido crear la reserva.\n");
        }
    }    
}
