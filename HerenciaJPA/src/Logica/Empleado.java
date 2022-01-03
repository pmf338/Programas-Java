package Logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;

@Entity
public class Empleado extends Persona implements Serializable {
    
    @Basic
    String puesto;
    double sueldo;

    public Empleado() {
    }

    public Empleado(String puesto, double sueldo, long id_persona, String nombre, String apellido, String profesion, int edad) {
        super(id_persona, nombre, apellido, profesion, edad);
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    @Override
    public long getId_persona() {
        return id_persona;
    }

    @Override
    public void setId_persona(long id_persona) {
        this.id_persona = id_persona;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getApellido() {
        return apellido;
    }

    @Override
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String getProfesion() {
        return profesion;
    }

    @Override
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    @Override
    public int getEdad() {
        return edad;
    }

    @Override
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
