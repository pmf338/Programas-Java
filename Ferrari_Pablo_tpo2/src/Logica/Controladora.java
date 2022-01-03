package Logica;

//Esta clase la utilizo para controlar a las demas clases y manejar los momentos en que las quiero utilizar

import Persistencia.ControladoraPersistencia;

public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia(); //instancio a la ControladoraPersistencia para crear una conexion con la controladora de la logica
    
    public void altaMascota(int num_cliente, String nombre_perro, String raza, String color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones){
        
        //instancio una variable del tipo Mascota para setear los atributos de esa clase con las variables que recibi desde la IGU
        Mascota masco = new Mascota();
        masco.setNum_cliente(num_cliente);
        masco.setNombre_perro(nombre_perro);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencion_especial);
        masco.setNombre_duenio(nombre_duenio);
        masco.setCelular_duenio(celular_duenio);
        masco.setObservaciones(observaciones);
        
        controlPersis.altaMascota(masco); //Le paso las variables modificadas de la clase mascota a el constructor que se encuentra en la controladora de la persistencia
    }
   
}
