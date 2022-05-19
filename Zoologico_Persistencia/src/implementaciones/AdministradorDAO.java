/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import entidades.Administrador;
import interfaces.IAdministradorDAO;
import interfaces.IConexionBD;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import org.bson.Document;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public class AdministradorDAO implements IAdministradorDAO{
     private final IConexionBD conexion;
     private MongoDatabase baseDatos;
     
     
    public AdministradorDAO(IConexionBD conexion){
        this.conexion = conexion;
        this.baseDatos = this.conexion.crearConexion();
    }
    
     private MongoCollection<Administrador> getColeccion(){
        return this.baseDatos.getCollection("administradores", Administrador.class);
    }

    @Override
    public boolean agregar(Administrador administrador) {
         MongoCollection<Administrador> coleccion = this.getColeccion();
        coleccion.insertOne(administrador);
        return true;
    }

 @Override
    public List<Administrador> consultarTodos() {
        // TODO: MANEJAR POSIBLES EXCEPCIONES...
        MongoCollection<Administrador> coleccion = this.getColeccion();
        List<Administrador> listaAdministrador = new LinkedList<>();
        coleccion.find(
            //Filters.and(
                //Filters.gt("rating", 4), 
                //Filters.lt("rating", 5))
        ).into(listaAdministrador);
        return listaAdministrador;
    }

  
}
