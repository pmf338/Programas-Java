package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS) //Estrategia de herencia, cada clase que hereda de esta clase Persona van a tener su propia tabla
public class Persona implements Serializable {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    long id_persona; //las demas clases heredaran id_persona como su ID tambien
    @Basic
    String nombre;
    String apellido;
    String profesion;
    int edad;

    public Persona() {
    }

    public Persona(long id_persona, String nombre, String apellido, String profesion, int edad) {
        this.id_persona = id_persona;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.edad = edad;
    }

    public long getId_persona() {
        return id_persona;
    }

    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
