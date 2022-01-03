package Logica;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Profesor {
    
    @Id
    int id_profesor;
    @Basic
    String nombre;
    String apellido;
    @OneToMany 
    List <Materia> listaMaterias; //creando una lista del tipo de la clase con la que queremos asociar estamos haciendo la relacion 1 a n
    
    
    public Profesor() {
    }

    public Profesor(int id_profesor, String nombre, String apellido) {
        this.id_profesor = id_profesor;
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public int getId_profesor() {
        return id_profesor;
    }

    public void setId_profesor(int id_profesor) {
        this.id_profesor = id_profesor;
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
    
    
    
}
