/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Cuidador;
import entidades.Especie;
import entidades.Habitat;
import interfaces.IConexionBD;
import interfaces.IEspecieDAO;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Alejandro
 */
public class EspecieDAO implements IEspecieDAO {
    
    private final IConexionBD conexion;
   private MongoDatabase baseDatos;
    
    public EspecieDAO(IConexionBD conexion){
        this.conexion = conexion;
        this.baseDatos = this.conexion.crearConexion();
    }

    
    private MongoCollection<Especie> getColeccion() {
        return this.baseDatos.getCollection("Especie", Especie.class);
    }
    
     private MongoCollection<Habitat> getColeccionHabitat() {
        return this.baseDatos.getCollection("Habitats", Habitat.class);
    }
     

    private MongoCollection<Cuidador> getColeccionCuidador() {
        return this.baseDatos.getCollection("Cuidador", Cuidador.class);
    }
    
    @Override
    public boolean agregar(Especie especie) {
MongoCollection<Especie> coleccion = this.getColeccion();
        coleccion.insertOne(especie);
        return true;
    }

    @Override
    public List<Especie> consultarTodosEspecie() {
 MongoCollection<Especie> coleccion = this.getColeccion();
        List<Especie> listaEspecie = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaEspecie);
        return listaEspecie;
    }

    @Override
    public List<Cuidador> consultarTodosCuidador() {
MongoCollection<Cuidador> coleccion = this.getColeccionCuidador();
        List<Cuidador> listaCuidador = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaCuidador);
        return listaCuidador;
    }

    @Override
    public List<Habitat> consultarTodosHabitat() {
 MongoCollection<Habitat> coleccion = this.getColeccionHabitat();
        List<Habitat> listaHabitats = new LinkedList<>();
        coleccion.find( //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
                ).into(listaHabitats);
        return listaHabitats;
    }
    
}
