/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Objects;

/**
 *
 * @author Alejandro
 */
public class Habitats {
    private String nombre,clima,vegetacion,descripcion;
    private int idHabitad;
    private Continente continente;

    public Habitats() {
    }

    public Habitats(String nombre, String clima, String vegetacion, Continente continente, String descripcion) {
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continente = continente;
        this.descripcion = descripcion;
    }

    public Habitats(String nombre, String clima, String vegetacion, Continente continente, String descripcion, int idHabitad) {
        this.nombre = nombre;
        this.clima = clima;
        this.vegetacion = vegetacion;
        this.continente = continente;
        this.descripcion = descripcion;
        this.idHabitad = idHabitad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public String getVegetacion() {
        return vegetacion;
    }

    public void setVegetacion(String vegetacion) {
        this.vegetacion = vegetacion;
    }

    public Continente getContinente() {
        return continente;
    }

    public void setContinente(Continente continente) {
        this.continente = continente;
    }


    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getIdHabitad() {
        return idHabitad;
    }

    public void setIdHabitad(int idHabitad) {
        this.idHabitad = idHabitad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.nombre);
        hash = 67 * hash + Objects.hashCode(this.clima);
        hash = 67 * hash + Objects.hashCode(this.vegetacion);
        hash = 67 * hash + Objects.hashCode(this.continente);
        hash = 67 * hash + Objects.hashCode(this.descripcion);
        hash = 67 * hash + this.idHabitad;
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
        final Habitats other = (Habitats) obj;
        if (this.idHabitad != other.idHabitad) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.clima, other.clima)) {
            return false;
        }
        if (!Objects.equals(this.vegetacion, other.vegetacion)) {
            return false;
        }
        if (!Objects.equals(this.continente, other.continente)) {
            return false;
        }
        return Objects.equals(this.descripcion, other.descripcion);
    }

    
    @Override
    public String toString() {
        return "Habitats{" + "nombre=" + nombre + ", clima=" + clima + ", vegetacion=" + vegetacion + ", continente=" + continente + ", descripcion=" + descripcion + ", idHabitad=" + idHabitad + '}';
    }
    
    
}
