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
public class Administrador extends Empleado {

    private String usuario, contraseña;

    public Administrador(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Administrador(String usuario, String contraseña, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono, fechaIngreso);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Administrador(String usuario, String contraseña, ObjectId idEmpleado) {
        super(idEmpleado);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Administrador() {
    }

    public Administrador(ObjectId id,String usuario, String contraseña, String nombre, String direccion, String telefono, Date fechaIngreso) {
        super(nombre, direccion, telefono,id, fechaIngreso);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
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
        return "Administrador{" + "usuario=" + usuario + ", contrase\u00f1a=" + contraseña + '}';
    }

}
