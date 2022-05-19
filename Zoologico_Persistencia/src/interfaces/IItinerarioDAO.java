/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Guia;
import entidades.Itinerario;
import entidades.Zona;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public interface IItinerarioDAO {

    boolean agregar(Itinerario itinerario);

    List<Itinerario> consultarTodos();

    List<Zona> consultarTodosZona();

    List<Guia> consultarTodosGuia();
}
