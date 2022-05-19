/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import entidades.Administrador;
import java.util.List;
import org.bson.types.ObjectId;
import implementaciones.AdministradorDAO;
import interfaces.IAdministradorDAO;

/**
 *
 * @author Alejandro
 */
public class ControlAdministrador {

    private IAdministradorDAO administradorDAO;
   

    public ControlAdministrador() {
        this.administradorDAO = DAOSFactory.crearAdministradorDAO();

    }

    public boolean agregar(Administrador administrador) {
        return administradorDAO.agregar(administrador);
//        return admi.agregar(administrador);
    }

    public List<Administrador> consultarTodosAdministrador() {
        return administradorDAO.consultarTodos();
    }

}
