/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public class Empleado {
    protected String nombre,direccion,telefono;
    protected ObjectId id;
    protected Date fechaIngreso;
    

    public Empleado() {
    }

    public Empleado(ObjectId id) {
        this.id = id;
    }

    public Empleado(String nombre, String direccion, String telefono, ObjectId id, Date fechaIngreso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id = id;
        this.fechaIngreso = fechaIngreso;
    }

    
    public Empleado(String nombre, String direccion, String telefono, Date fechaIngreso) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaIngreso = fechaIngreso;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId idEmpleado) {
        this.id = idEmpleado;
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

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", direccion=" + direccion + ", telefono=" + telefono + ", idEmpleado=" + id + ", fechaIngreso=" + fechaIngreso + '}';
    }
    
    
    
    




}
