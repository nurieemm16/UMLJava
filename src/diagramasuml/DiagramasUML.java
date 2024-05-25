/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diagramasuml;
import java.util.*;


/**
 *
 * @author Núria Marzo 
 */
public class DiagramasUML {
    static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    //Creo el SISTEMA
        Sistema sistema1 = new Sistema(1);
        
        //Imprimo la info del sistema
            System.out.println("El ID de este sistema es: " + sistema1.getIdSistema());
    
    //Creo los EQUIPAMIENTOS    
        //Imprimo el título para la lista de equipamientos creados
            //System.out.println("\nLista para comprobar equipamientos creados:");
        
        //Creo cada uno de los equipamientos
        Equipamiento equip1 = new Equipamiento(1, 0, 1);
        Equipamiento equip2 = new Equipamiento(2, 1, 0);
        Equipamiento equip3 = new Equipamiento(3, 1, 1);
        Equipamiento equip4 = new Equipamiento(4, 0, 0);
        
    //Creo las SALAS        
        //Creo cada una de las salas
        Salas sala1 = new Salas(1, "Sala Edinburgh", 28.2f, 17, "P1 - Lowlands", equip1, false);
        Salas sala2 = new Salas(2, "Sala Glencoe", 58.4f, 50, "P2 - Highlands", equip4, true);
        Salas sala3 = new Salas(3, "Sala Trossachs", 300.0f, 200, "P2 - Highlands", equip2, true);
        Salas sala4 = new Salas(4, "Sala Portree", 100.5f, 65, "P0 - Skye", equip3, false);
        
        System.out.println("\nInformación general sobre las salas:");
        //Imprimo la info de cada una de las salas
            System.out.println("  Sala " + sala1.getIdSala() + ": " + sala1.getDescripcionSala() + " | Superfície: " + sala1.getSuperficieSala() + "m2 | Capacidad: " + sala1.getCapacidadSala() + " personas | Ubicación: " + sala1.getUbicacionSala() + " | Equipamiento nº" + equip1.getIdEquipamiento() + "| ¿La sala está disponible? " + sala1.getDisponibilidadSala());
            System.out.println("  Sala " + sala2.getIdSala() + ": " + sala2.getDescripcionSala() + " | Superfície: " + sala2.getSuperficieSala() + "m2 | Capacidad: " + sala2.getCapacidadSala() + " personas | Ubicación: " + sala2.getUbicacionSala() + " | Equipamiento nº" + equip2.getIdEquipamiento() + "| ¿La sala está disponible? " + sala2.getDisponibilidadSala());
            System.out.println("  Sala " + sala3.getIdSala() + ": " + sala3.getDescripcionSala() + " | Superfície: " + sala3.getSuperficieSala() + "m2 | Capacidad: " + sala3.getCapacidadSala() + " personas | Ubicación: " + sala3.getUbicacionSala() + " | Equipamiento nº" + equip3.getIdEquipamiento() + "| ¿La sala está disponible? " + sala3.getDisponibilidadSala());
            System.out.println("  Sala " + sala4.getIdSala() + ": " + sala4.getDescripcionSala() + " | Superfície: " + sala4.getSuperficieSala() + "m2 | Capacidad: " + sala4.getCapacidadSala() + " personas | Ubicación: " + sala4.getUbicacionSala() + " | Equipamiento nº" + equip4.getIdEquipamiento() + "| ¿La sala está disponible? " + sala4.getDisponibilidadSala());
        
        System.out.println("\nInformación general sobre los equipamientos:");
        //Imprimo la info de cada uno de los equipamientos
        System.out.println("  Equipamiento " + equip1.getIdEquipamiento() + " - Nº proyectores: " + equip1.getProyectorEquipamiento() + "; Nº sistemas de vídeo: " + equip1.getSistVideoEquipamiento());
        System.out.println("  Equipamiento " + equip2.getIdEquipamiento() + " - Nº proyectores: " + equip2.getProyectorEquipamiento() + "; Nº sistemas de vídeo: " + equip2.getSistVideoEquipamiento());
        System.out.println("  Equipamiento " + equip3.getIdEquipamiento() + " - Nº proyectores: " + equip3.getProyectorEquipamiento() + "; Nº sistemas de vídeo: " + equip3.getSistVideoEquipamiento());
        System.out.println("  Equipamiento " + equip4.getIdEquipamiento() + " - Nº proyectores: " + equip4.getProyectorEquipamiento() + "; Nº sistemas de vídeo: " + equip4.getSistVideoEquipamiento());
    
    //Creo los USUARIOS
        
        System.out.println("\nCreación de usuarios:");
            //El sistema crea cada uno de los CLIENTES
            Clientes cliente1 = sistema1.crearCliente("cliente", 1, "Finlay", "Camden", "finlay.camden@cliente.com", "123poi", 666778880);
            Clientes cliente2 = sistema1.crearCliente("cliente", 2, "Archie", "Carmichael", "archie.carmichael@cliente.com", "456asd", 0);
            Clientes cliente3 = sistema1.crearCliente("cliente", 3, "Duncan", "Drummond", null, "mj5dk0", 41748596);
            Clientes cliente4 = sistema1.crearCliente("cliente", 4, "Leslie", "Isla", null, "dfs657f", 0);
            Clientes cliente5 = sistema1.crearCliente("cliente", 5, "Effie", "Kirsty", "effie.kirsty@cliente.com", "6454sdr", 712365478);
            Clientes cliente6 = sistema1.crearCliente("cliente", 6, "Nessie", "Dallas", "nessie.dallas@cliente.com", "sdrfswe54", 984521702);

          System.out.println("  ----------");
            //El sistema crea cada uno de los ADMINISTRADORES
            Administradores admin1 = sistema1.crearAdmin("admin", 1, "Adaira", "Lowe", "adaira.lowe@admin.com", "asdas454");
            Administradores admin2 = sistema1.crearAdmin("admin", 2, "Maisie", "Vika", "maisie.vika@admin.com", "545sada");
    
        System.out.println("\nInicio de sesión: ");
        //Los usuarios inician sesión
            cliente1.iniciarSesion();
            cliente2.iniciarSesion();
            cliente3.iniciarSesion();
            cliente4.iniciarSesion();
            cliente5.iniciarSesion();
            cliente6.iniciarSesion();
        System.out.println("  ----------");
            admin1.iniciarSesion();
            admin2.iniciarSesion();    
    
    //Creo las RESERVAS     
        //Creo cada una de las reservas
        Reserva reserva1 = new Reserva(1, "14/1/2024", "14/1/2024", 10, 11, sala1, 30.50f, "confirmado y pagado", cliente1, "SEdi_R1");
        Reserva reserva2 = new Reserva(2, "22/1/2018", "22/1/2018", 12, 14, sala2, 90.75f, "confirmado y pagado", cliente2, "SGlenc_R1");
        Reserva reserva3 = new Reserva(3, "3/2/2022", "3/2/2022", 8, 10, sala3, 200.75f, "confirmado y pagado", cliente3, "STros_R1");
        Reserva reserva4 = new Reserva(4, "30/2/2019", "30/2/2019", 9, 17, sala2, 90.75f, "confirmado y pagado", cliente4, "SGlenc_R2");
        Reserva reserva5 = new Reserva(5, "24/4/2024", "24/4/2024", 13, 20, sala3, 400.50f, "confirmado y pagado", cliente5, "STros_R2");
        Reserva reserva6 = new Reserva(6, "31/11/2023", "231/11/2023", 15, 18, sala1, 100.85f, "confirmado y pagado", cliente6, "SEdi_R2");
        Reserva reserva7 = new Reserva(7, "9/8/2020", "9/8/2020", 17, 18, sala2, 95.60f, "confirmado y pagado", cliente4, "SGlenc_R3");
        
        System.out.println("\nCreación de reservas:");
        cliente1.crearReserva(reserva1, sala1);
        cliente2.crearReserva(reserva2, sala2);
        cliente3.crearReserva(reserva3, sala3);
        cliente4.crearReserva(reserva4, sala2);
        cliente5.crearReserva(reserva5, sala3);
        cliente6.crearReserva(reserva6, sala1);
        cliente4.crearReserva(reserva7, sala2);
    
    //Creo los REPORTES
        
        //Creo cada uno de los reportes
        Reportes reporte1 = new Reportes(1, "1/3/2024", "Este reporte muestra las reservas del mes de febrero.");
        Reportes reporte2 = new Reportes(2, "1/4/2024", "Este reporte muestra las reservas del mes de marzo.");
        Reportes reporte3 = new Reportes(3, "1/5/2024", "Este reporte muestra las reservas del mes de abril.");
    
    System.out.println("\nReportes:") ;
        //Imprimo la info de cada uno de los reportes
            System.out.println("  Reporte " + reporte1.getIdReporte() + " - Fecha del reporte: " + reporte1.getFechaReporte() + " | Descripción: " + reporte1.getDescripcionReporte());
            System.out.println("  Reporte " + reporte2.getIdReporte() + " - Fecha del reporte: " + reporte2.getFechaReporte() + " | Descripción: " + reporte2.getDescripcionReporte());
            System.out.println("  Reporte " + reporte3.getIdReporte() + " - Fecha del reporte: " + reporte3.getFechaReporte() + " | Descripción: " + reporte3.getDescripcionReporte());
            
        
        //Añado una lista de Reservas dentro de cada reporte
            reporte1.anadirListaReservas(reserva1);
            reporte1.anadirListaReservas(reserva2);
            
            reporte2.anadirListaReservas(reserva3);
            reporte2.anadirListaReservas(reserva4);
            reporte2.anadirListaReservas(reserva5);
            reporte2.anadirListaReservas(reserva6);
            
            reporte3.anadirListaReservas(reserva7);
        
        // Muestro la lista de reservas en la consola (tengo que recorrer la lista porque sino solo se me imprimiría el primer elemento)
        System.out.println("\n  Lista de reservas del reporte " + reporte1.getIdReporte() + ":");
        for(Reserva x: reporte1.getReservas()){ // Escribo reporte1. porque es el tipo, esta lista está guardada en la clase Reportes PERO es una lista para cada reporte, hence el reporte1.
            System.out.println("    Reserva con código: " + x.getCodigoReserva()); // Si no le pongo el getID, getPrecio y solo le pongo x, me escribiría por pantalla el código de la reserva que se guarda en la memoria.
        }
        
        // Muestro la lista de reservas en la consola (tengo que recorrer la lista porque sino solo se me imprimiría el primer elemento)
        System.out.println("\n  Lista de reservas del reporte " + reporte2.getIdReporte() + ":");
        for(Reserva x: reporte2.getReservas()){ // Escribo reporte1. porque es el tipo, esta lista está guardada en la clase Reportes PERO es una lista para cada reporte, hence el reporte1.
            System.out.println("    Reserva con código: " + x.getCodigoReserva()); // Si no le pongo el getID, getPrecio y solo le pongo x, me escribiría por pantalla el código de la reserva que se guarda en la memoria.
        }
        
        // Muestro la lista de reservas en la consola (tengo que recorrer la lista porque sino solo se me imprimiría el primer elemento)
        System.out.println("\n  Lista de reservas del reporte " + reporte3.getIdReporte() + ":");
        for(Reserva x: reporte3.getReservas()){ // Escribo reporte1. porque es el tipo, esta lista está guardada en la clase Reportes PERO es una lista para cada reporte, hence el reporte1.
            System.out.println("    Reserva con código: " + x.getCodigoReserva()); // Si no le pongo el getID, getPrecio y solo le pongo x, me escribiría por pantalla el código de la reserva que se guarda en la memoria.
        }
    //Creo los RECORDATORIOS
        //Creo cada uno de los recordatorios
        Recordatorios recordatorio1 = new Recordatorios(1, "22/1/2024", cliente1.getNombreCliente(), cliente1.getApellidosCliente(), reserva1);
        Recordatorios recordatorio2 = new Recordatorios(2, "14/1/2024", cliente2.getNombreCliente(), cliente2.getApellidosCliente(), reserva2);
        Recordatorios recordatorio3 = new Recordatorios(3, "17/2/2024", cliente3.getNombreCliente(), cliente3.getApellidosCliente(), reserva3);
        Recordatorios recordatorio4 = new Recordatorios(4, "17/2/2024", cliente4.getNombreCliente(), cliente4.getApellidosCliente(), reserva4);
        Recordatorios recordatorio5 = new Recordatorios(5, "22/2/2024", cliente5.getNombreCliente(), cliente5.getApellidosCliente(), reserva5);
        Recordatorios recordatorio6 = new Recordatorios(6, "27/2/2024", cliente6.getNombreCliente(), cliente6.getApellidosCliente(), reserva6);
        Recordatorios recordatorio7 = new Recordatorios(7, "2/3/2024", cliente4.getNombreCliente(), cliente4.getApellidosCliente(), reserva7);
        
        System.out.println("\nRecordatorios:");
        //El sistema envía los recordatorios
            sistema1.enviarRecordatorio(cliente1, recordatorio1, reserva1);
            sistema1.enviarRecordatorio(cliente2, recordatorio2, reserva2);
            sistema1.enviarRecordatorio(cliente3, recordatorio3, reserva3);
            sistema1.enviarRecordatorio(cliente4, recordatorio4, reserva4);
            sistema1.enviarRecordatorio(cliente5, recordatorio5, reserva5);
            sistema1.enviarRecordatorio(cliente6, recordatorio6, reserva6);
            sistema1.enviarRecordatorio(cliente4, recordatorio7, reserva7);
            
                                //Otra forma de escribirlo sería... si en la clase Recordatorios escribiesemos el "enviarRecordatorio2"
                                /*sistema1.enviarRecordatorio2(0, null, recordatorio1);
                                sistema1.enviarRecordatorio2(0, cliente1.getMailCliente(), recordatorio2);
                                sistema1.enviarRecordatorio2(cliente1.getPhone(), null, recordatorio1);
                                sistema1.enviarRecordatorio2(cliente1.getPhone(), cliente1.getMailCliente(), recordatorio1);*/
    
        
            
            
    //Otras acciones
    System.out.println("Otras acciones:");
        //Actualizo el mail del cliente
        cliente1.setMailCliente("mailnuevo@mailnuevo.com");
        System.out.println("  " + cliente1.getNombreCliente() + ", tu mail se ha actualizado a: " + cliente1.getMailCliente());
        
    System.out.println("\nCierre de sesión: ");
        //Los usuarios inician sesión
            cliente1.cerrarSesion();
            cliente2.cerrarSesion();
            cliente3.cerrarSesion();
            cliente4.cerrarSesion();
            cliente5.cerrarSesion();
            cliente6.cerrarSesion();
        System.out.println("  ----------");
            admin1.cerrarSesion();
            admin2.cerrarSesion();
            
    
        
    //Muestro la lista genérica de reservas en la consola (tengo que recorrer la lista porque sino solo se me imprimiría el primer elemento)
        System.out.println("\nLista total de reservas:");
        for(Reserva i : Reserva.getListaReservasGenerica()){ // Escribo Reserva. porque es el tipo, esta lista está guardada en la clase Reserva (y es general)
            System.out.println("  Id reserva: " + i.getIdReserva() + " con precio: " + i.getPrecioReserva());
        }
    
        
        
    }
    
}
