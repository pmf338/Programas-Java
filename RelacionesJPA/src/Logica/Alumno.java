package Logica;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)      
    long id_alumno;
    @Basic
    String nombre;
    String apellido;
    @OneToMany
    List<Materia> listMaterias;

    public Alumno() {
    }

    public Alumno(long id_alumno, String nombre, String apellido, List<Materia> listMaterias) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.listMaterias = listMaterias;
    }

    public long getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(long id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Materia> getListMaterias() {
        return listMaterias;
    }

    public void setListMaterias(List<Materia> listMaterias) {
        this.listMaterias = listMaterias;
    }
    
    
    
}
