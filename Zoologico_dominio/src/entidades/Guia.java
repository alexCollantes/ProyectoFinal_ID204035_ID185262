/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public class Guia extends Empleado {
    
    private String itinerarioAsignado;

    public Guia() {
    }

    public Guia(String itinerarioAsignado, ObjectId id) {
        super(id);
        this.itinerarioAsignado = itinerarioAsignado;
    }

    public Guia(String itinerarioAsignado, String nombre, String direccion, int telefono, ObjectId id, Date fechaIngreso) {
        super(nombre, direccion, telefono, id, fechaIngreso);
        this.itinerarioAsignado = itinerarioAsignado;
    }

    public Guia(String itinerarioAsignado, String nombre, String direccion, int telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
        this.itinerarioAsignado = itinerarioAsignado;
    }

    public Guia(String nombre, String direccion, int telefono,  Date fechaIngreso) {
        super(nombre, direccion, telefono,  fechaIngreso);
    }
    

    public String getItinerarioAsignado() {
        return itinerarioAsignado;
    }

    public void setItinerarioAsignado(String itinerarioAsignado) {
        this.itinerarioAsignado = itinerarioAsignado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.itinerarioAsignado);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Guia other = (Guia) obj;
        return Objects.equals(this.itinerarioAsignado, other.itinerarioAsignado);
    }

    @Override
    public String toString() {
        return "Guia{" + "itinerarioAsignado=" + itinerarioAsignado + '}';
    }

    
   
    
   

}
