package Persistencia;

import Logica.Mascota;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraPersistencia {
    
    MascotaJpaController jpaMascota = new MascotaJpaController();
    
    //creo el constructor 
    public void altaMascota (Mascota masco){
    
        try {
            jpaMascota.create(masco); //creo un nuevo producto en la base de datos con lo que recibi de la controladora de la logica
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
