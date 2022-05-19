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
public class Queja {
    private ObjectId id;
    private String descripcion,nombre,correo,telefono;
    private Guia guia;
    private Itinerario itinerario;
    public Queja() {
    }

    public Queja(ObjectId idQueja, String descripcion, Guia guia, Itinerario itinerario) {
        this.id = idQueja;
        this.descripcion = descripcion;
        this.guia = guia;
        this.itinerario = itinerario;
    }

    public Queja(String descripcion, Guia guia, Itinerario itinerario) {
        this.descripcion = descripcion;
        this.guia = guia;
        this.itinerario = itinerario;
    }

    public Queja(String descripcion, String nombre, String correo, String telefono, Guia guia, Itinerario itinerario) {
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.correo = correo;
        this.telefono = telefono;
        this.guia = guia;
        this.itinerario = itinerario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public Itinerario getItinerario() {
        return itinerario;
    }

    public void setItinerario(Itinerario itinerario) {
        this.itinerario = itinerario;
    }

    @Override
    public String toString() {
        return "Queja{" + "descripcion=" + descripcion + ", guia=" + guia + ", itinerario=" + itinerario + '}';
    }
    
}
