/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Clima;
import entidades.Continente;
import entidades.Habitat;
import entidades.Vegetacion;
import interfaces.IHabitatDAO;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class ControlHabitat {

    private IHabitatDAO habitatDAO;

    public ControlHabitat() {
        this.habitatDAO = DAOSFactory.crearHabitadDAO();
    }

    public boolean agregar(Habitat habitat) {
        return habitatDAO.agregar(habitat);
    }

    public List<Habitat> consultarTodosHabitat() {
        return habitatDAO.consultarTodos();
    }

    public List<Continente> consultarTodosContinente() {
        return habitatDAO.consultarTodosContinente();

    }

    public List<Clima> consultarTodosClima() {
        return habitatDAO.consultarTodosClima();
    }

    public List<Vegetacion> consultarTodosVegetacion() {
        return habitatDAO.consultarTodosVegetacion();
    }

}
