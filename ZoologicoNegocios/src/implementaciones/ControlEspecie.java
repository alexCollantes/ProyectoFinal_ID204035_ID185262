/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Cuidador;
import entidades.Especie;
import interfaces.IEspecieDAO;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class ControlEspecie {
    
    private IEspecieDAO especieDAO;

    public ControlEspecie() {
        this.especieDAO = DAOSFactory.crearEspecieDAO();
    }
       
    public boolean agregar(Especie especie) {
        return this.especieDAO.agregar(especie);
    }

    
    public List<Especie> consultarTodosEspecie() {
        return this.especieDAO.consultarTodosEspecie();
    }


    public List<Cuidador> consultarTodosCuidador() {
        return this.especieDAO.consultarTodosCuidador();
    }
    
    
    
}
