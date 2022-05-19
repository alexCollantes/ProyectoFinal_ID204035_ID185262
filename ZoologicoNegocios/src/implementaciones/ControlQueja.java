/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Itinerario;
import entidades.Queja;
import interfaces.IQuejaDAO;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class ControlQueja {

    private IQuejaDAO quejaDAO;

    public ControlQueja() {
        this.quejaDAO = DAOSFactory.crearQuejaDAO();
    }

    public boolean agregar(Queja queja) {
        return this.quejaDAO.agregar(queja);
    }

    public List<Queja> consultarTodos() {
        return this.quejaDAO.consultarTodos();
    }

    public List<Itinerario> consultarTodosItinerario() {
        return this.quejaDAO.consultarTodosItinerario();
    }

}
