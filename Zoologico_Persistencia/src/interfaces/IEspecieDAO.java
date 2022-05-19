/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entidades.Cuidador;
import entidades.Especie;
import entidades.Habitat;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public interface IEspecieDAO {
    boolean agregar(Especie habitat);

     List<Habitat> consultarTodosHabitat();
     
    List<Especie> consultarTodosEspecie();

    List<Cuidador> consultarTodosCuidador();
}
