/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Itinerario;
import entidades.Queja;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public interface IQuejaDAO {
    boolean agregar(Queja queja);

    List<Queja> consultarTodos();
    
     List<Itinerario> consultarTodosItinerario();
     
}
