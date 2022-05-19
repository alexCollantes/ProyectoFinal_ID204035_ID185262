/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import Interfaz.INegocio;
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
public class Negocio implements INegocio {

    private ControlAdministrador ctrlAdministrador;
    private ControlHabitat ctrlHabitat;
    private ControlEspecie ctrlEspecie;
    private ControlItinerario ctrlItinerario;
    private ControlQueja ctrlQueja;

   
    public Negocio() {
        this.ctrlAdministrador = new ControlAdministrador();
        this.ctrlEspecie = new ControlEspecie();
        this.ctrlHabitat = new ControlHabitat();
        this.ctrlItinerario = new ControlItinerario();
        this.ctrlQueja = new ControlQueja();
    }
    
    //metodos Habitat
    
    @Override
    public boolean agregar(Habitat habitat) {
        return ctrlHabitat.agregar(habitat);
    }

    @Override
    public List<Habitat> consultarTodosHabitat() {
        return ctrlHabitat.consultarTodosHabitat();
    }

    @Override
    public List<Continente> consultarTodosContinente() {
        return ctrlHabitat.consultarTodosContinente();
    }

    @Override
    public List<Clima> consultarTodosClima() {
        return ctrlHabitat.consultarTodosClima();
    }

    @Override
    public List<Vegetacion> consultarTodosVegetacion() {
        return ctrlHabitat.consultarTodosVegetacion();
    }

    //metodos admi
    
    @Override
    public boolean agregar(Administrador administrador) {
        return ctrlAdministrador.agregar(administrador);
    }

    @Override
    public List<Administrador> consultarTodosAdministrador() {
        return ctrlAdministrador.consultarTodosAdministrador();
    }

    //metodos Especie
    
    @Override
    public boolean agregar(Especie especie) {
        return ctrlEspecie.agregar(especie);
    }

    @Override
    public List<Especie> consultarTodosEspecie() {
        return ctrlEspecie.consultarTodosEspecie();
    }

    @Override
    public List<Cuidador> consultarTodosCuidador() {
        return ctrlEspecie.consultarTodosCuidador();
    }

    //metodos Queja
    
    @Override
    public boolean agregar(Queja queja) {
        return this.ctrlQueja.agregar(queja);
    }

    @Override
    public List<Queja> consultarTodos() {
        return this.ctrlQueja.consultarTodos();
    }

    @Override
    public List<Itinerario> consultarTodosItinerario() {
        return this.ctrlQueja.consultarTodosItinerario();
    }

    //metodos Itinerario
    
    @Override
    public boolean agregar(Itinerario itinerario) {
        return this.ctrlItinerario.agregar(itinerario);
    }

    @Override
    public List<Zona> consultarTodosZona() {
       return this.ctrlItinerario.consultarTodosZona();
    }

    @Override
    public List<Guia> consultarTodosGuia() {
        return this.ctrlItinerario.consultarTodosGuia();
    }
    
    
    
    
}
