/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Time;
import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;

/**
 *
 * @author Alejandro
 */
public class Itinerario {

    private ObjectId id;
    private String nombre;
    private String duracion;
    private int maxNumVisitantes,numEspVisitadas;
    private Float longitud;
    private Zona zona;
    private Guia guia;
    private Date fecha;

    public Itinerario() {
    }

    public Itinerario(ObjectId id, String nombre,String duracion, int maxNumVisitantes, int numEspVisitadas, float longitud,Zona zona,Guia guia) {
        this.nombre=nombre;
        this.id = id;
        this.duracion = duracion;
        this.maxNumVisitantes = maxNumVisitantes;
        this.numEspVisitadas = numEspVisitadas;
        this.longitud = longitud;
         this.zona= zona;
        this.guia = guia;
    }

    public Itinerario(String nombre,String duracion, int maxNumVisitantes, int numEspVisitadas, float longitud,Zona zona,Guia guia, Date fecha) {
        this.nombre=nombre;
        this.duracion = duracion;
        this.maxNumVisitantes = maxNumVisitantes;
        this.numEspVisitadas = numEspVisitadas;
        this.longitud = longitud;
        this.zona= zona;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Itinerario(String nombre, String duracion,int maxNumVisitantes, float longitud, Zona zona, Guia guia,Date fecha) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.maxNumVisitantes = maxNumVisitantes;
        this.longitud = longitud;
        this.zona = zona;
        this.guia = guia;
        this.fecha = fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getDuracion() {
        return duracion;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    
    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getMaxNumVisitantes() {
        return maxNumVisitantes;
    }

    public void setMaxNumVisitantes(int maxNumVisitantes) {
        this.maxNumVisitantes = maxNumVisitantes;
    }

    public int getNumEspVisitadas() {
        return numEspVisitadas;
    }

    public void setNumEspVisitadas(int numEspVisitadas) {
        this.numEspVisitadas = numEspVisitadas;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.duracion);
        hash = 79 * hash + this.maxNumVisitantes;
        hash = 79 * hash + this.numEspVisitadas;
        hash = 79 * hash + Float.floatToIntBits(this.longitud);
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
        final Itinerario other = (Itinerario) obj;
        if (this.maxNumVisitantes != other.maxNumVisitantes) {
            return false;
        }
        if (this.numEspVisitadas != other.numEspVisitadas) {
            return false;
        }
        if (Float.floatToIntBits(this.longitud) != Float.floatToIntBits(other.longitud)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.duracion, other.duracion);
    }

    @Override
    public String toString() {
        return "Itinerario{" + "idItinerario=" + id+ ", duracion=" + duracion + ", maxNumVisitantes=" + maxNumVisitantes + ", numEspVisitadas=" + numEspVisitadas + ", longitud=" + longitud + '}';
    }

    
    
    
    

}
