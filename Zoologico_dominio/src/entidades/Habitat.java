/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public class Habitat {

    private ObjectId id;
    private String nombre, descripcion;
    private Continente continente;
    private Clima clima;
    private Vegetacion vegetacion;
    private List<Continente> continentes;

    public Habitat() {
    }

    public Habitat(String nombre, String descripcion, Clima clima, Vegetacion vegetacion,List<Continente> continentes) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continentes = continentes;
    }

    
    
    public Habitat(ObjectId id, String nombre, String descripcion, Continente continente, Clima clima, Vegetacion vegetacion) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.continente = continente;
        this.clima = clima;
        this.vegetacion = vegetacion;
    }

    public Habitat(String nombre, String descripcion, Continente continente, Clima clima, Vegetacion vegetacion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.continente = continente;
        this.clima = clima;
        this.vegetacion = vegetacion;
    }

    public List<Continente> getContinentes() {
        return continentes;
    }

    public void setContinentes(List<Continente> continentes) {
        this.continentes = continentes;
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }

    public Clima getClima() {
        return clima;
    }

    public void setClima(Clima clima) {
        this.clima = clima;
    }

    public Vegetacion getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(Vegetacion vegetacion) {
        this.vegetacion = vegetacion;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 41 * hash + Objects.hashCode(this.id);
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
        final Habitat other = (Habitat) obj;
        return true;
    }

    @Override
    public String toString() {
        return "Habitat{" + "idHabitat=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", continente=" + continente + ", clima=" + clima + ", vegetacion=" + vegetacion + '}';
    }

}
