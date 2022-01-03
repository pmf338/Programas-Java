package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity //Si no me aparece para importar la libreria que corresponde a Entity debo importar el javax.persistence
public class Alumno implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    int id_alumno;
    
    @Basic
    String nombre;
    String apellido;
    String colorPelo;
    boolean tieneTitulo;
    String nivelJava;

    public Alumno() {
    }

    public Alumno(int id_alumno, String nombre, String apellido, String colorPelo, boolean tieneTitulo, String nivelJava) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellido = apellido;
        this.colorPelo = colorPelo;
        this.tieneTitulo = tieneTitulo;
        this.nivelJava = nivelJava;
    }

    public int getId_alumno() {
        return id_alumno;
    }

    public void setId_alumno(int id_alumno) {
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

    public String getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }

    public boolean isTieneTitulo() {
        return tieneTitulo;
    }

    public void setTieneTitulo(boolean tieneTitulo) {
        this.tieneTitulo = tieneTitulo;
    }

    public String getNivelJava() {
        return nivelJava;
    }

    public void setNivelJava(String nivelJava) {
        this.nivelJava = nivelJava;
    }
    
    
}
