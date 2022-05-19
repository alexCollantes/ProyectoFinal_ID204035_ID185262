/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Interfaz;

import entidades.Administrador;
import entidades.Clima;
import entidades.Continente;
import entidades.Cuidador;
import entidades.Especie;
import entidades.Guia;
import entidades.Habitat;
import entidades.Itinerario;
import entidades.Queja;
import entidades.Vegetacion;
import entidades.Zona;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public interface INegocio {

    // metodos IHabitatDAO
    boolean agregar(Habitat habitat);

    List<Habitat> consultarTodosHabitat();

    List<Continente> consultarTodosContinente();

    List<Clima> consultarTodosClima();

    List<Vegetacion> consultarTodosVegetacion();

    // metodos IAdministradorDAO
    boolean agregar(Administrador administrador);

    List<Administrador> consultarTodosAdministrador();
    
    //metodos IEspecieDAO
    
       boolean agregar(Especie habitat);
     
    List<Especie> consultarTodosEspecie();

    List<Cuidador> consultarTodosCuidador();
    
    //metodos IQuejaDAO
    
    boolean agregar(Queja queja);

    List<Queja> consultarTodos();
    
     List<Itinerario> consultarTodosItinerario();
     
     //metodos ItinerarioDAO
     
      boolean agregar(Itinerario itinerario);

    List<Zona> consultarTodosZona();

    List<Guia> consultarTodosGuia();

}
