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
public class Cuidador extends Empleado {

    private String basicoEsp, expertoEsp;
    private Date fechaEspecie;

    public Cuidador() {
    }

    public Cuidador(String basicoEsp, String expertoEsp, Date fechaEspecie) {
        this.basicoEsp = basicoEsp;
        this.expertoEsp = expertoEsp;
        this.fechaEspecie = fechaEspecie;
    }

    public Cuidador(String basicoEsp, String expertoEsp, Date fechaEspecie, ObjectId id) {
        super(id);
        this.basicoEsp = basicoEsp;
        this.expertoEsp = expertoEsp;
        this.fechaEspecie = fechaEspecie;
    }

    public Cuidador(String basicoEsp, String expertoEsp, Date fechaEspecie, String nombre, String direccion, String telefono, ObjectId id, Date fechaIngreso) {
        super(nombre, direccion, telefono, id, fechaIngreso);
        this.basicoEsp = basicoEsp;
        this.expertoEsp = expertoEsp;
        this.fechaEspecie = fechaEspecie;
    }

    public Cuidador(String basicoEsp, String expertoEsp, Date fechaEspecie, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
        this.basicoEsp = basicoEsp;
        this.expertoEsp = expertoEsp;
        this.fechaEspecie = fechaEspecie;
    }

    public String getBasicoEsp() {
        return basicoEsp;
    }

    public void setBasicoEsp(String basicoEsp) {
        this.basicoEsp = basicoEsp;
    }

    public String getExpertoEsp() {
        return expertoEsp;
    }

    public void setExpertoEsp(String expertoEsp) {
        this.expertoEsp = expertoEsp;
    }

    public Date getFechaEspecie() {
        return fechaEspecie;
    }

    public void setFechaEspecie(Date fechaEspecie) {
        this.fechaEspecie = fechaEspecie;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 17 * hash + Objects.hashCode(this.basicoEsp);
        hash = 17 * hash + Objects.hashCode(this.expertoEsp);
        hash = 17 * hash + Objects.hashCode(this.fechaEspecie);
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
        final Cuidador other = (Cuidador) obj;
        if (!Objects.equals(this.basicoEsp, other.basicoEsp)) {
            return false;
        }
        if (!Objects.equals(this.expertoEsp, other.expertoEsp)) {
            return false;
        }
        return Objects.equals(this.fechaEspecie, other.fechaEspecie);
    }

    @Override
    public String toString() {
        return "Cuidador{" + "basicoEsp=" + basicoEsp + ", expertoEsp=" + expertoEsp + ", fechaEspecie=" + fechaEspecie + '}';
    }

}
