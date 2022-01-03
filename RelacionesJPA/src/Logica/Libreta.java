package Logica;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Libreta implements Serializable {
    
    @Id
    long id_libreta;
    @OneToOne
    Alumno alu;

    public Libreta() {
    }

    public Libreta(long id_libreta, Alumno alu) {
        this.id_libreta = id_libreta;
        this.alu = alu;
    }

    public long getId_libreta() {
        return id_libreta;
    }

    public void setId_libreta(long id_libreta) {
        this.id_libreta = id_libreta;
    }

    public Alumno getAlu() {
        return alu;
    }

    public void setAlu(Alumno alu) {
        this.alu = alu;
    }
    
    
    
}
