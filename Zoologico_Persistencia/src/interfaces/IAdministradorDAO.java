/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Administrador;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public interface IAdministradorDAO {
    boolean agregar(Administrador administrador);
    List<Administrador> consultarTodos();
   
}
