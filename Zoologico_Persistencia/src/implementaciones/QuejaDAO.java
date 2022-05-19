/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Itinerario;
import entidades.Queja;
import interfaces.IConexionBD;
import interfaces.IQuejaDAO;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class QuejaDAO implements IQuejaDAO {

    private final IConexionBD conexion;
    private MongoDatabase baseDatos;

    public QuejaDAO(IConexionBD conexion) {
        this.conexion = conexion;
        this.baseDatos = this.conexion.crearConexion();
    }

    private MongoCollection<Queja> getColeccionQueja() {
        return this.baseDatos.getCollection("Queja", Queja.class);
    }

    private MongoCollection<Itinerario> getColeccionItinerario() {
        return this.baseDatos.getCollection("Itinerario", Itinerario.class);
    }

    @Override
    public boolean agregar(Queja queja) {
        MongoCollection<Queja> coleccion = this.getColeccionQueja();
        coleccion.insertOne(queja);
        return true;
    }

    @Override
    public List<Queja> consultarTodos() {
        MongoCollection<Queja> coleccion = this.getColeccionQueja();
        List<Queja> listaQueja = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaQueja);
        return listaQueja;
    }

    @Override
    public List<Itinerario> consultarTodosItinerario() {
        MongoCollection<Itinerario> coleccion = this.getColeccionItinerario();
        List<Itinerario> listaItinerario = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaItinerario);
        return listaItinerario;
    }
}
