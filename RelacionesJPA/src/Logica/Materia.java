package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Materia implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id_materia;
    @Basic
    String nombre;
    String carrera;

    public Materia() {
    }

    public Materia(long id_materia, String nombre, String carrera) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.carrera = carrera;
    }

    public long getId_materia() {
        return id_materia;
    }

    public void setId_materia(long id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
   
    
}
