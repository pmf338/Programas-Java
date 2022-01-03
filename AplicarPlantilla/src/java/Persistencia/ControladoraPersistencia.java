package Persistencia;

import Logica.Alumno;

public class ControladoraPersistencia {
    
    AlumnoJpaController aluJpa = new AlumnoJpaController();
    
    public void crearAlumno(Alumno alu){
    
        aluJpa.create(alu);
    }
    
    public List <Persona> traerPersonas (){
    
        return aluJpa.findAlumnoEntities(); //me retorna la lista de personas, la persistencia se encarga de traer todas las personas y guardarlas en una lista, mandandola a la controladora
    }
}