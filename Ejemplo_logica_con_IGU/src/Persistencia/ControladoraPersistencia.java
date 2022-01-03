package Persistencia;

import Logica.Producto;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {
    
    ProductoJpaController jpaProducto = new ProductoJpaController(); //llamo al controlador de jpa 
    
    //creo el constructor 
    public void altaProducto(Producto prod){
    
        try {
            jpaProducto.create(prod); //creo un nuevo producto en la base de datos
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
