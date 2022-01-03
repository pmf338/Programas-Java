package Logica;


public class Materia {
    
    int id_materia;
    String nombre;
    String orientacion;

    public Materia() {
    }

    public Materia(int id_materia, String nombre, String orientacion) {
        this.id_materia = id_materia;
        this.nombre = nombre;
        this.orientacion = orientacion;
    }

    public int getId_materia() {
        return id_materia;
    }

    public void setId_materia(int id_materia) {
        this.id_materia = id_materia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }
    
    
    
}
