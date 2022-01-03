package Logica;

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia ();
    
    //dar de alta un alumno
    public void crearAlumno(String nombre,String apellido,String colorPelo,boolean titulo,String nivelJava){
        
        Alumno alu = new Alumno ();
        alu.setNombre(nombre);
        alu.setApellido(apellido);
        alu.setColorPelo(colorPelo);
        alu.setTieneTitulo(titulo);
        alu.setNivelJava(nivelJava);
        
        controlPersis.crearAlumno(alu);
    }
    
    //metodo que devuelve una lista de personas, va a devolver el resultado de ejecutar el metodo traerPersonas pero en la persistencia
    public List<Persona> traerPersonas(){ 
    
            return controlPersis.crearAlumno(alu); //traeme las personas que yo voy a retornar en la lista List<Persona>, la controladora pasa esa lista a la web(o sea a mis jsp)
    }
    
}
