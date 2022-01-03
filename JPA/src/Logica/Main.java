package Logica;

import Persistencia.ControladoraPersistencia;
//import java.util.List;
//import java.util.Date;

public class Main {

    public static void main(String[] args) {

        /*
        //Alumno alumno = new Alumno("3756222", "Elena", "Ferrari", new Date ("06/06/1938"));
        Alumno alumno2 = new Alumno("3756225", "Prueba", "Eliminar", new Date ("21/10/1975"));
        
        ControladoraPersistencia control = new ControladoraPersistencia();
        control.crearAlumno(alumno2);
        
        //control.eliminarAlumno("3756225");  //paso la id del alumno que quiero eliminar
    
        alumno2.setApellido("Prueba");
        alumno2.setNombre("Numero 2");
        
        control.modificarAlumno(alumno2); //editar alguno de los datos exceptuando la id
         */
        
        //mostrar lista de alumnos
        /*
        ControladoraPersistencia control = new ControladoraPersistencia();
        
        List<Alumno> listaAlumnos = control.traerAlumnos();
        
        System.out.println(" \n A continuacion se citan todos los alumnos");
        for(Alumno alu : listaAlumnos){
        
            System.out.println("* " + alu.getDni() + " " + alu.getApellido() + " " + alu.getNombre());
        }
         */
        
        //traigo un alumno en particular
        ControladoraPersistencia control = new ControladoraPersistencia();

        Alumno alu = control.traerAlumnoEnParticular("3756222");

        System.out.println("* " + alu.getDni() + " " + alu.getApellido() + " " + alu.getNombre());

    }

}
