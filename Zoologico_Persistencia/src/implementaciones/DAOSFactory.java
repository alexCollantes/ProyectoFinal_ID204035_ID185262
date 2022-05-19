/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import interfaces.IAdministradorDAO;
import interfaces.IConexionBD;
import interfaces.IEspecieDAO;
import interfaces.IItinerarioDAO;
import interfaces.IQuejaDAO;
import interfaces.IHabitatDAO;

/**
 *
 * @author Alejandro
 */
public class DAOSFactory {

    private final static IConexionBD conexion = new ConexionBD();
    private static IEspecieDAO especieDAO;
    private static IHabitatDAO habitatDAO;
    private static IItinerarioDAO itinerarioDAO;
    private static IQuejaDAO quejaDAO;
    private static IAdministradorDAO administradorDAO;

    public static IEspecieDAO crearEspecieDAO() {
        if (especieDAO == null) 
            especieDAO = new EspecieDAO(conexion);
        
        return especieDAO;

    }

    public static IHabitatDAO crearHabitadDAO() {
        if (habitatDAO == null) 
            habitatDAO = new HabitatDAO(conexion);
        
        return habitatDAO;
    }

    public static IQuejaDAO crearQuejaDAO() {
        if (quejaDAO == null) 
            quejaDAO = new QuejaDAO(conexion);
        
        return quejaDAO;
    }

    public static IItinerarioDAO crearItinerarioDAO() {
       if (itinerarioDAO == null) 
            itinerarioDAO = new ItinerarioDAO(conexion);
        
        return itinerarioDAO;
    }

    public static IAdministradorDAO crearAdministradorDAO() {
        if (administradorDAO == null) 
            administradorDAO = new AdministradorDAO(conexion);
        
        return administradorDAO;
    }
}
