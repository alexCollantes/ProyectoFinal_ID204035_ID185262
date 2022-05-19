/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public class Zona {
    private ObjectId id;
    private String ubicacion,nombre;
   private Double extension;

    public Zona() {
    }

    public Zona(String ubicacion, String nombre, Double extension) {
        this.ubicacion = ubicacion;
        this.nombre = nombre;
        this.extension = extension;
    }

    public Zona(String nombre, Double extension) {
        this.nombre = nombre;
        this.extension = extension;
    }
    
    
    public Zona(String ubicacion, ObjectId id, String nombre, Double extension) {
        this.ubicacion = ubicacion;
        this.id = id;
        this.nombre = nombre;
        this.extension = extension;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getExtension() {
        return extension;
    }

    public void setExtension(Double extension) {
        this.extension = extension;
    }
   
   
   
}
