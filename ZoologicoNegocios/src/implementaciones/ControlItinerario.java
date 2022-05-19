/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Guia;
import entidades.Itinerario;
import entidades.Zona;
import interfaces.IItinerarioDAO;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class ControlItinerario {
    
    private IItinerarioDAO itinerarioDAO;

    public ControlItinerario() {
        this.itinerarioDAO = DAOSFactory.crearItinerarioDAO();
    }
     
    public boolean agregar(Itinerario itinerario) {
       return this.itinerarioDAO.agregar(itinerario);
    }

    
    public List<Zona> consultarTodosZona() {
return this.itinerarioDAO.consultarTodosZona();
    }

    
    public List<Guia> consultarTodosGuia() {
return this.itinerarioDAO.consultarTodosGuia();
    }
    
}
