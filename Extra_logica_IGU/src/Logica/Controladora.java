package Logica;

public class Controladora {
    
    Alumno vectorAlu[] = new Alumno[4];
    
    public void agregarAlumno (String dni,String nombre, String apellido){
    
            Alumno alu = new Alumno();
            alu.setApellido(apellido);
            alu.setNombre(nombre);
            
            int dniNumero = Integer.parseInt(dni);
            alu.setDni(dniNumero);
            
            //recorro vector y cargo alumno donde este vacio
            //salgo del bucle una vez cargado
            for (int i = 0; i < vectorAlu.length; i++) {
            
                if(vectorAlu[i] == null){
                
                    vectorAlu[i] = alu;
                    i= vectorAlu.length;
                }
                    
                
        }
            
    }
    
    public void VerAlumno(){
    
        for (int i = 0; i < vectorAlu.length; i++) {
            
            System.out.println("Alumno posicion:  " + i + "Nombre: " + vectorAlu[i].getNombre());
        }
        
    }

    public Alumno traerAlumno(int indice) {
        
        return vectorAlu[indice];
    }
}
    

