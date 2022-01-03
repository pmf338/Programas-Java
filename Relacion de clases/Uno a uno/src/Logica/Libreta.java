package Logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Libreta {
    
    @Id
    int id_libreta;
    @Basic
    String colorDeTapa;
    @OneToOne //con esto JPA va a saber que Profesor y Libreta estan relacionados entonces cuando pase a la base de datos me va a crear una foreign key 
    Profesor alu; //para relacionar las clases debo tener un objeto de la clase Profesor en la clase Libreta(en este caso porque es una relacion 1 a 1)

    public Libreta() {
    }

    public Libreta(int id_libreta, String colorDeTapa, Profesor alu) {
        this.id_libreta = id_libreta;
        this.colorDeTapa = colorDeTapa;
        this.alu = alu;
    }

    public int getId_libreta() {
        return id_libreta;
    }

    public void setId_libreta(int id_libreta) {
        this.id_libreta = id_libreta;
    }

    public String getColorDeTapa() {
        return colorDeTapa;
    }

    public void setColorDeTapa(String colorDeTapa) {
        this.colorDeTapa = colorDeTapa;
    }

    public Profesor getAlu() {
        return alu;
    }

    public void setAlu(Profesor alu) {
        this.alu = alu;
    }
    
    
    
}
