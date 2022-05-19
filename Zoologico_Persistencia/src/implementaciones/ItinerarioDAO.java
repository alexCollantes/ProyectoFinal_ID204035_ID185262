/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Guia;
import entidades.Itinerario;
import entidades.Zona;
import interfaces.IConexionBD;
import interfaces.IItinerarioDAO;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class ItinerarioDAO implements IItinerarioDAO {

    private final IConexionBD conexion;
    private MongoDatabase baseDatos;

    public ItinerarioDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.crearConexion();
    }

    private MongoCollection<Itinerario> getColeccionItinerario() {
        return this.baseDatos.getCollection("Itinerario", Itinerario.class);
    }

    private MongoCollection<Zona> getColeccionZona() {
        return this.baseDatos.getCollection("Zona", Zona.class);
    }

    private MongoCollection<Guia> getColeccionGuia() {
        return this.baseDatos.getCollection("Guia", Guia.class);
    }

    @Override
    public boolean agregar(Itinerario itinerario) {
        MongoCollection<Itinerario> coleccion = this.getColeccionItinerario();
        coleccion.insertOne(itinerario);
        return true;
    }

    @Override
    public List<Itinerario> consultarTodos() {
 MongoCollection<Itinerario> coleccion = this.getColeccionItinerario();
        List<Itinerario> listaItinerario= new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaItinerario);
        return listaItinerario;
    }

    @Override
    public List<Zona> consultarTodosZona() {
 MongoCollection<Zona> coleccion = this.getColeccionZona();
        List<Zona> listaZona = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaZona);
        return listaZona;
    }

    @Override
    public List<Guia> consultarTodosGuia() {
 MongoCollection<Guia> coleccion = this.getColeccionGuia();
        List<Guia> listaGuia = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaGuia);
        return listaGuia;
    }

}
