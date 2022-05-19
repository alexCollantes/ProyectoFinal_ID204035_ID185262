/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public class Especie {
    private String nombreEspecie,nombreEspañol,nombreCientifico,descripcion;
    private ObjectId id;
    private Habitat  habitad;
    private Cuidador  cuidador;

    public Especie() {
    }

    public Especie(String nombreEspecie,String nombreEspañol, String nombreCientifico, String descripcion, ObjectId id, Habitat habitad, Cuidador cuidador) {
        this.nombreEspecie=nombreEspecie;
        this.nombreEspañol = nombreEspañol;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.id = id;
        this.habitad = habitad;
        this.cuidador = cuidador;
    }

    public Especie(String nombreEspecie,String nombreEspañol, String nombreCientifico, String descripcion, Habitat habitad, Cuidador cuidador) {
        this.nombreEspecie=nombreEspecie;
        this.nombreEspañol = nombreEspañol;
        this.nombreCientifico = nombreCientifico;
        this.descripcion = descripcion;
        this.habitad = habitad;
        this.cuidador = cuidador;
    }

    public String getNombreEspecie() {
        return nombreEspecie;
    }

    public void setNombreEspecie(String nombreEspecie) {
        this.nombreEspecie = nombreEspecie;
    }

    public String getNombreEspañol() {
        return nombreEspañol;
    }

    public void setNombreEspañol(String nombreEspañol) {
        this.nombreEspañol = nombreEspañol;
    }

    public String getNombreCientifico() {
        return nombreCientifico;
    }

    public void setNombreCientifico(String nombreCientifico) {
        this.nombreCientifico = nombreCientifico;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public Habitat getHabitad() {
        return habitad;
    }

    public void setHabitad(Habitat habitad) {
        this.habitad = habitad;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

   

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        final Especie other = (Especie) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "Especie{" + "nombreEspa\u00f1ol=" + nombreEspañol + ", nombreCientifico=" + nombreCientifico + ", descripcion=" + descripcion + ", idEspecie=" + id+ ", habitad=" + habitad + ", zona=" + cuidador + '}';
    }

   


}
