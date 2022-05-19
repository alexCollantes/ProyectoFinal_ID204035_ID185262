/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Clima;
import entidades.Continente;
import entidades.Habitat;
import entidades.Vegetacion;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public interface IHabitatDAO {

    boolean agregar(Habitat habitat);

    List<Habitat> consultarTodos();

    List<Continente> consultarTodosContinente();

    List<Clima> consultarTodosClima();

    List<Vegetacion> consultarTodosVegetacion();

 
}
