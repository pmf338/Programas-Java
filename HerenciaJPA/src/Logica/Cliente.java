package Logica;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Cliente extends Persona implements Serializable{
    
    @Basic
    String tipoCliente;
    @Temporal(TemporalType.DATE)
    Date fechaAltaServicio;

    public Cliente() {
    }

    public Cliente(String tipoCliente, Date fechaAltaServicio, long id_persona, String nombre, String apellido, String profesion, int edad) {
        super(id_persona, nombre, apellido, profesion, edad);
        this.tipoCliente = tipoCliente;
        this.fechaAltaServicio = fechaAltaServicio;
    }

    

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public Date getFechaAltaServicio() {
        return fechaAltaServicio;
    }

    public void setFechaAltaServicio(Date fechaAltaServicio) {
        this.fechaAltaServicio = fechaAltaServicio;
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
