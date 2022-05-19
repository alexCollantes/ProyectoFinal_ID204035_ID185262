/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Clima;
import entidades.Continente;
import entidades.Habitat;
import entidades.Vegetacion;
import interfaces.IConexionBD;
import interfaces.IHabitatDAO;
import java.util.LinkedList;
import java.util.List;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public class HabitatDAO implements IHabitatDAO {

    private final IConexionBD conexion;
    private MongoDatabase baseDatos;

    public HabitatDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.crearConexion();
    }

    private MongoCollection<Habitat> getColeccion() {
        return this.baseDatos.getCollection("Habitats", Habitat.class);
    }

    private MongoCollection<Continente> getColeccionContinente() {
        return this.baseDatos.getCollection("Continentes", Continente.class);
    }

    private MongoCollection<Clima> getColeccionClima() {
        return this.baseDatos.getCollection("Clima", Clima.class);
    }

    private MongoCollection<Vegetacion> getColeccionVegetacion() {
        return this.baseDatos.getCollection("vegetacion", Vegetacion.class);
    }

    @Override
    public boolean agregar(Habitat habitad) {
        MongoCollection<Habitat> coleccion = this.getColeccion();
        coleccion.insertOne(habitad);
        
        return true;
    }

    @Override
    public List<Habitat> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Habitat> coleccion = this.getColeccion();
        List<Habitat> listaHabitats = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaHabitats);
        return listaHabitats;
    }

 

    @Override
    public List<Continente> consultarTodosContinente() {
// TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Continente> coleccion = this.getColeccionContinente();
        List<Continente> listaContinente = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaContinente);
        return listaContinente;
    }

    @Override
    public List<Clima> consultarTodosClima() {
        MongoCollection<Clima> coleccion = this.getColeccionClima();
        List<Clima> listaClima = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaClima);
        return listaClima;
    }

    @Override
    public List<Vegetacion> consultarTodosVegetacion() {
        MongoCollection<Vegetacion> coleccion = this.getColeccionVegetacion();
        List<Vegetacion> listaVegetacion = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaVegetacion);
        return listaVegetacion;
    }
}
